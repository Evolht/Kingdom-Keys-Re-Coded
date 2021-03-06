package uk.co.wehavecookies56.kk.common.entity;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import uk.co.wehavecookies56.kk.client.model.mobs.ModelDarkball;
import uk.co.wehavecookies56.kk.common.item.ModItems;

public class EntityGummiShip extends Entity{
	private static final DataParameter<Integer> TIME_SINCE_HIT = EntityDataManager.<Integer>createKey(EntityGummiShip.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> FORWARD_DIRECTION = EntityDataManager.<Integer>createKey(EntityGummiShip.class, DataSerializers.VARINT);
	private static final DataParameter<Float> DAMAGE_TAKEN = EntityDataManager.<Float>createKey(EntityGummiShip.class, DataSerializers.FLOAT);
	private static final DataParameter<Integer> BOAT_TYPE = EntityDataManager.<Integer>createKey(EntityGummiShip.class, DataSerializers.VARINT);
	private static final DataParameter<Boolean>[] DATA_ID_PADDLE = new DataParameter[] {EntityDataManager.createKey(EntityGummiShip.class, DataSerializers.BOOLEAN), EntityDataManager.createKey(EntityGummiShip.class, DataSerializers.BOOLEAN)};
	/** How much of current speed to retain. Value zero to one. */
	private float momentum;
	private float deltaRotation;
	private int lerpSteps;
	private double lerpX;
	private double lerpY;
	private double lerpZ;
	private double lerpYaw;
	private double lerpPitch;
	private boolean leftInputDown;
	private boolean rightInputDown;
	private boolean forwardInputDown;
	private boolean backInputDown;
	private double lastYd;

	public EntityGummiShip(World worldIn){
		super(worldIn);
		this.preventEntitySpawning = true;
		this.setSize(1.375F, 0.5625F);
	}

	public EntityGummiShip(World worldIn, double x, double y, double z){
		this(worldIn);
		this.setPosition(x, y, z);
		this.motionX = 0.0D;
		this.motionY = 0.0D;
		this.motionZ = 0.0D;
		this.prevPosX = x;
		this.prevPosY = y;
		this.prevPosZ = z;
	}

	public ModelBase getModel() {
		return new ModelDarkball();
	}

	/**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
	 * prevent them from trampling crops
	 */
	protected boolean canTriggerWalking(){
		return false;
	}

	protected void entityInit(){
		this.dataManager.register(TIME_SINCE_HIT, Integer.valueOf(0));
		this.dataManager.register(FORWARD_DIRECTION, Integer.valueOf(1));
		this.dataManager.register(DAMAGE_TAKEN, Float.valueOf(0.0F));

		for (DataParameter<Boolean> dataparameter : DATA_ID_PADDLE){
			this.dataManager.register(dataparameter, Boolean.valueOf(false));
		}
	}

	@Nullable
	public AxisAlignedBB getCollisionBox(Entity entityIn){
		return entityIn.canBePushed() ? entityIn.getEntityBoundingBox() : null;
	}

	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(){
		return this.getEntityBoundingBox();
	}

	public boolean canBePushed(){
		return true;
	}

	public double getMountedYOffset(){
		return -0.1D;
	}

	public boolean attackEntityFrom(DamageSource source, float amount){
		if (this.isEntityInvulnerable(source)){
			return false;
		}
		else if (!this.world.isRemote && !this.isDead){
			if (source instanceof EntityDamageSourceIndirect && source.getTrueSource() != null && this.isPassenger(source.getTrueSource())){
				return false;
			}
			else
			{
				this.setForwardDirection(-this.getForwardDirection());
				this.setTimeSinceHit(10);
				this.setDamageTaken(this.getDamageTaken() + amount * 10.0F);
				this.setBeenAttacked();
				boolean flag = source.getTrueSource() instanceof EntityPlayer && ((EntityPlayer)source.getTrueSource()).capabilities.isCreativeMode;

				if (flag || this.getDamageTaken() > 40.0F){
					if (!flag && this.world.getGameRules().getBoolean("doEntityDrops")){
						this.dropItemWithOffset(ModItems.GummiShip, 1, 0.0F);
					}

					this.setDead();
				}

				return true;
			}
		}
		else
		{
			return true;
		}
	}

	public void applyEntityCollision(Entity entityIn){
		if (entityIn instanceof EntityGummiShip)
		{
			if (entityIn.getEntityBoundingBox().minY < this.getEntityBoundingBox().maxY)
			{
				super.applyEntityCollision(entityIn);
			}
		}
		else if (entityIn.getEntityBoundingBox().minY <= this.getEntityBoundingBox().minY)
		{
			super.applyEntityCollision(entityIn);
		}
	}


	@SideOnly(Side.CLIENT)
	public void performHurtAnimation(){
		this.setForwardDirection(-this.getForwardDirection());
		this.setTimeSinceHit(10);
		this.setDamageTaken(this.getDamageTaken() * 11.0F);
	}

	public boolean canBeCollidedWith(){
		return !this.isDead;
	}

	@SideOnly(Side.CLIENT)
	public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean teleport){
		this.lerpX = x;
		this.lerpY = y;
		this.lerpZ = z;
		this.lerpYaw = (double)yaw;
		this.lerpPitch = (double)pitch;
		this.lerpSteps = 10;
	}

	public EnumFacing getAdjustedHorizontalFacing()
	{
		return this.getHorizontalFacing().rotateY();
	}

	public void onUpdate(){
		if (this.getTimeSinceHit() > 0){
			this.setTimeSinceHit(this.getTimeSinceHit() - 1);
		}

		if (this.getDamageTaken() > 0.0F){
			this.setDamageTaken(this.getDamageTaken() - 1.0F);
		}

		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;
		super.onUpdate();
		this.tickLerp();

		if (this.canPassengerSteer()){

			this.updateMotion();

			if (this.world.isRemote){
				this.controlBoat();
			}

			this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
		}else{
			this.motionX = 0.0D;
			this.motionY = 0.0D;
			this.motionZ = 0.0D;
		}

		this.doBlockCollisions();
		List<Entity> list = this.world.getEntitiesInAABBexcluding(this, this.getEntityBoundingBox().grow(0.20000000298023224D, -0.009999999776482582D, 0.20000000298023224D), EntitySelectors.getTeamCollisionPredicate(this));

		if (!list.isEmpty()){
			boolean flag = !this.world.isRemote && !(this.getControllingPassenger() instanceof EntityPlayer);

			for (int j = 0; j < list.size(); ++j){
				Entity entity = list.get(j);

				if (!entity.isPassenger(this)){
					if (flag && this.getPassengers().size() < 2 && !entity.isRiding() && entity.width < this.width && entity instanceof EntityLivingBase && !(entity instanceof EntityWaterMob) && !(entity instanceof EntityPlayer)){
						entity.startRiding(this);
					}else{
						this.applyEntityCollision(entity);
					}
				}
			}
		}
	}

	private void tickLerp(){
		if (this.lerpSteps > 0 && !this.canPassengerSteer()){
			double d0 = this.posX + (this.lerpX - this.posX) / (double)this.lerpSteps;
			double d1 = this.posY + (this.lerpY - this.posY) / (double)this.lerpSteps;
			double d2 = this.posZ + (this.lerpZ - this.posZ) / (double)this.lerpSteps;
			double d3 = MathHelper.wrapDegrees(this.lerpYaw - (double)this.rotationYaw);
			this.rotationYaw = (float)((double)this.rotationYaw + d3 / (double)this.lerpSteps);
			this.rotationPitch = (float)((double)this.rotationPitch + (this.lerpPitch - (double)this.rotationPitch) / (double)this.lerpSteps);
			--this.lerpSteps;
			this.setPosition(d0, d1, d2);
			this.setRotation(this.rotationYaw, this.rotationPitch);
		}
	}

	public float getBoatGlide(){
		AxisAlignedBB axisalignedbb = this.getEntityBoundingBox();
		AxisAlignedBB axisalignedbb1 = new AxisAlignedBB(axisalignedbb.minX, axisalignedbb.minY - 0.001D, axisalignedbb.minZ, axisalignedbb.maxX, axisalignedbb.minY, axisalignedbb.maxZ);
		int i = MathHelper.floor(axisalignedbb1.minX) - 1;
		int j = MathHelper.ceil(axisalignedbb1.maxX) + 1;
		int k = MathHelper.floor(axisalignedbb1.minY) - 1;
		int l = MathHelper.ceil(axisalignedbb1.maxY) + 1;
		int i1 = MathHelper.floor(axisalignedbb1.minZ) - 1;
		int j1 = MathHelper.ceil(axisalignedbb1.maxZ) + 1;
		List<AxisAlignedBB> list = Lists.<AxisAlignedBB>newArrayList();
		float f = 0.0F;
		int k1 = 0;
		BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain();

		try{
			for (int l1 = i; l1 < j; ++l1){
				for (int i2 = i1; i2 < j1; ++i2){
					int j2 = (l1 != i && l1 != j - 1 ? 0 : 1) + (i2 != i1 && i2 != j1 - 1 ? 0 : 1);

					if (j2 != 2){
						for (int k2 = k; k2 < l; ++k2){
							if (j2 <= 0 || k2 != k && k2 != l - 1){
								blockpos$pooledmutableblockpos.setPos(l1, k2, i2);
								IBlockState iblockstate = this.world.getBlockState(blockpos$pooledmutableblockpos);
								iblockstate.addCollisionBoxToList(this.world, blockpos$pooledmutableblockpos, axisalignedbb1, list, this, false);

								if (!list.isEmpty()){
									f += iblockstate.getBlock().getSlipperiness(iblockstate, this.world, blockpos$pooledmutableblockpos, this);
									++k1;
								}

								list.clear();
							}
						}
					}
				}
			}
		}finally{
			blockpos$pooledmutableblockpos.release();
		}

		return f / (float)k1;
	}

	private void updateMotion(){
		double d2 = 0.0D;
		this.momentum = 0.9F;
		this.motionY += d2 * 0.06153846016296973D;
		this.motionY *= 0.75D;
	}

	private void controlBoat(){
		if (this.isBeingRidden()){
			//System.out.println(getControllingPassenger());
			float f = 0.0F;

			if (this.leftInputDown){
				System.out.println("a");
				this.deltaRotation--;
			}

			if (this.rightInputDown){
				++this.deltaRotation;
			}

			this.rotationYaw += this.deltaRotation;

			if (this.forwardInputDown){
				f += 0.04F;
			}

			if (this.backInputDown){
				f -= 0.005F;
			}

			this.motionX += (double)(MathHelper.sin(-this.rotationYaw * 0.017453292F) * f);
			this.motionZ += (double)(MathHelper.cos(this.rotationYaw * 0.017453292F) * f);
			System.out.println(motionX +" "+motionZ);
		}
	}

	public void updatePassenger(Entity passenger){
		if (this.isPassenger(passenger)){
			float f = 0.0F;
			float f1 = (float)((this.isDead ? 0.009999999776482582D : this.getMountedYOffset()) + passenger.getYOffset());

			if (this.getPassengers().size() > 1){
				int i = this.getPassengers().indexOf(passenger);

				if (i == 0){
					f = 0.2F;
				}else{
					f = -0.6F;
				}

				if (passenger instanceof EntityAnimal){
					f = (float)((double)f + 0.2D);
				}
			}

			Vec3d vec3d = (new Vec3d((double)f, 0.0D, 0.0D)).rotateYaw(-this.rotationYaw * 0.017453292F - ((float)Math.PI / 2F));
			passenger.setPosition(this.posX + vec3d.x, this.posY + (double)f1, this.posZ + vec3d.z);
			passenger.rotationYaw += this.deltaRotation;
			passenger.setRotationYawHead(passenger.getRotationYawHead() + this.deltaRotation);
			this.applyYawToEntity(passenger);

			if (passenger instanceof EntityAnimal && this.getPassengers().size() > 1){
				int j = passenger.getEntityId() % 2 == 0 ? 90 : 270;
				passenger.setRenderYawOffset(((EntityAnimal)passenger).renderYawOffset + (float)j);
				passenger.setRotationYawHead(passenger.getRotationYawHead() + (float)j);
			}
		}
	}

	/**
	 * Applies this boat's yaw to the given entity. Used to update the orientation of its passenger.
	 */
	protected void applyYawToEntity(Entity entityToUpdate){
		entityToUpdate.setRenderYawOffset(this.rotationYaw);
		float f = MathHelper.wrapDegrees(entityToUpdate.rotationYaw - this.rotationYaw);
		float f1 = MathHelper.clamp(f, -105.0F, 105.0F);
		entityToUpdate.prevRotationYaw += f1 - f;
		entityToUpdate.rotationYaw += f1 - f;
		entityToUpdate.setRotationYawHead(entityToUpdate.rotationYaw);
	}

	@SideOnly(Side.CLIENT)
	public void applyOrientationToEntity(Entity entityToUpdate){
		this.applyYawToEntity(entityToUpdate);
	}

	protected void writeEntityToNBT(NBTTagCompound compound){}

	protected void readEntityFromNBT(NBTTagCompound compound){}

	public boolean processInitialInteract(EntityPlayer player, EnumHand hand)
	{
		if (player.isSneaking())
		{
			return false;
		}
		else
		{
			if (!this.world.isRemote)
			{
				player.startRiding(this);
			}

			return true;
		}
	}

	/*protected void updateFallState(double y, boolean onGroundIn, IBlockState state, BlockPos pos)
	{
		this.lastYd = this.motionY;

		if (!this.isRiding())
		{
			if (onGroundIn)
			{
				if (this.fallDistance > 3.0F)
				{

					this.fall(this.fallDistance, 1.0F);

					if (!this.world.isRemote && !this.isDead)
					{
						this.setDead();

						if (this.world.getGameRules().getBoolean("doEntityDrops"))
						{
							for (int i = 0; i < 3; ++i)
							{
								this.entityDropItem(new ItemStack(Item.getItemFromBlock(Blocks.PLANKS), 1, this.getBoatType().getMetadata()), 0.0F);
							}

							for (int j = 0; j < 2; ++j)
							{
								this.dropItemWithOffset(Items.STICK, 1, 0.0F);
							}
						}
					}
				}

				this.fallDistance = 0.0F;
			}
			else if (this.world.getBlockState((new BlockPos(this)).down()).getMaterial() != Material.WATER && y < 0.0D)
			{
				this.fallDistance = (float)((double)this.fallDistance - y);
			}
		}
	}*/

	public void setDamageTaken(float damageTaken){
		this.dataManager.set(DAMAGE_TAKEN, Float.valueOf(damageTaken));
	}

	
	public float getDamageTaken(){
		return ((Float)this.dataManager.get(DAMAGE_TAKEN)).floatValue();
	}

	public void setTimeSinceHit(int timeSinceHit){
		this.dataManager.set(TIME_SINCE_HIT, Integer.valueOf(timeSinceHit));
	}

	public int getTimeSinceHit(){
		return ((Integer)this.dataManager.get(TIME_SINCE_HIT)).intValue();
	}

	public void setForwardDirection(int forwardDirection){
		this.dataManager.set(FORWARD_DIRECTION, Integer.valueOf(forwardDirection));
	}

	public int getForwardDirection(){
		return ((Integer)this.dataManager.get(FORWARD_DIRECTION)).intValue();
	}

	protected boolean canFitPassenger(Entity passenger){
		return this.getPassengers().size() < 2;
	}

	/**
	 * For vehicles, the first passenger is generally considered the controller and "drives" the vehicle. For example,
	 * Pigs, Horses, and Boats are generally "steered" by the controlling passenger.
	 */
	@Nullable
	public Entity getControllingPassenger(){
		List<Entity> list = this.getPassengers();
		return list.isEmpty() ? null : (Entity)list.get(0);
	}

	@SideOnly(Side.CLIENT)
	public void updateInputs(boolean p_184442_1_, boolean p_184442_2_, boolean p_184442_3_, boolean p_184442_4_){
		this.leftInputDown = p_184442_1_;
		this.rightInputDown = p_184442_2_;
		this.forwardInputDown = p_184442_3_;
		this.backInputDown = p_184442_4_;
	}

	@Override
	protected void addPassenger(Entity passenger){
		super.addPassenger(passenger);
		if(this.canPassengerSteer() && this.lerpSteps > 0){
			this.lerpSteps = 0;
			this.posX = this.lerpX;
			this.posY = this.lerpY;
			this.posZ = this.lerpZ;
			this.rotationYaw = (float)this.lerpYaw;
			this.rotationPitch = (float)this.lerpPitch;
		}
	}
}
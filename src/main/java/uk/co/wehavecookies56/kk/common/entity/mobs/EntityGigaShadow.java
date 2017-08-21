package uk.co.wehavecookies56.kk.common.entity.mobs;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import uk.co.wehavecookies56.kk.common.core.helper.EntityHelper;
import uk.co.wehavecookies56.kk.common.core.helper.EntityHelper.MobType;
import uk.co.wehavecookies56.kk.common.entity.mobs.ai.EntityAIShadow;

public class EntityGigaShadow extends BaseEntityHeartless implements IKHMob {
    // ENTITY_STATE : 1 - Invisible

    public EntityGigaShadow(World world) {
        super(world);
        this.setSize(width*4, height/2*4);
        this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, true));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityAgeable.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityAnimal.class, true));
        this.targetTasks.addTask(4, new EntityAIShadow(this));
    }

    @Override
    public void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.28D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(EntityHelper.STATE, 0);
        this.dataManager.register(EntityHelper.ANIMATION, 0);
    }

    @Override
    protected boolean isValidLightLevel() {
        return true;
    }

    @Override
    protected boolean canDespawn() {
        return true;
    }

    @Override
    public boolean isAIDisabled() {
        return false;
    }

    @Override
    public boolean getCanSpawnHere() {
        return true;
    }

    @Override
    public MobType getType() {
        return MobType.HEARTLESS_PUREBLOOD;
    }

}

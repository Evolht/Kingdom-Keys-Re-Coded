package wehavecookies56.kk.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import wehavecookies56.kk.network.CommonProxy;
import wehavecookies56.kk.network.PacketDispatcher;
import wehavecookies56.kk.network.SyncExtendedPlayer;

public class ExtendedPlayer implements IExtendedEntityProperties {

	public final static String EXT_PROP_NAME = "KKExtendedPlayer";

	private final EntityPlayer player;

	public int munny, maxMunny, level, maxLevel, experience, maxExperience, mp, maxMp;

	public ExtendedPlayer(EntityPlayer player){
		this.player = player;
		this.munny = 0;
		this.level = 1;
		this.experience = 0;
		this.mp = 0;
		this.maxMunny = Integer.MAX_VALUE;
		this.maxLevel = 99;
		this.maxExperience = 10;
		this.maxMp = 100;
	}

	@Override
	public void saveNBTData(NBTTagCompound compound){
		NBTTagCompound properties = new NBTTagCompound();

		properties.setInteger("Munny", this.munny);
		properties.setInteger("Level", level);
		properties.setInteger("Experience", experience);
		properties.setInteger("MP", mp);
		properties.setInteger("MaxExperience", maxExperience);
		properties.setInteger("MaxMP", maxMp);
		
		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound){
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);

		this.munny = properties.getInteger("Munny");
		this.level = properties.getInteger("Level");
		this.experience = properties.getInteger("Experience");
		this.mp = properties.getInteger("MP");
		this.maxExperience = properties.getInteger("MaxExperience");
		this.maxMp = properties.getInteger("MaxMP");

	}

	@Override
	public void init(Entity entity, World world) {

	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.sync();
		this.level = level;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.sync();
		this.maxLevel = maxLevel;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.sync();
		this.experience = experience;
	}

	public int getMaxExperience() {
		return maxExperience;
	}

	public void setMaxExperience(int maxExperience) {
		this.sync();
		this.maxExperience = maxExperience;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.sync();
		this.mp = mp;
	}

	public int getMaxMp() {
		return maxMp;
	}

	public void setMaxMp(int maxMp) {
		this.sync();
		this.maxMp = maxMp;
	}

	public boolean addMunny(int amount){
		boolean sufficient = true;

		if(amount + this.munny > this.maxMunny || amount > this.maxMunny){
			sufficient = false;
		}
		
		if (sufficient) {
			this.munny += amount;
			this.sync();
		} else {
			return false;
		}
		return true;
	}

	public boolean removeMunny(int amount){
		boolean sufficient = true;
		
		if(amount - this.maxMunny < 0 || amount > this.maxMunny){
			sufficient = false;
		}
		if(sufficient){
			this.munny -= amount;
			this.sync();
		} else {
			return false;
		}
		return true;
	}

	public int getMunny(){
		return this.munny;
	}
	
	public void setMunny(int amount){
		this.munny = amount;
		this.sync();
	}
	
	public void setMaxMunny(int max){
		this.maxMunny = max;
		this.sync();
	}
	
	public int getMaxMunny(){
		return this.maxMunny;
	}
	

	public final void sync(){
		SyncExtendedPlayer packet = new SyncExtendedPlayer(player);
        PacketDispatcher.sendToServer(packet);
		

		if(!player.worldObj.isRemote){
			EntityPlayerMP player1 = (EntityPlayerMP) player;
			PacketDispatcher.sendTo(packet, player1);
		}
	}
	
	private static String getSaveKey (EntityPlayer player){
		return player.getDisplayName() + ":" + EXT_PROP_NAME;
	}
	
	public static void saveProxyData(EntityPlayer player){
		ExtendedPlayer playerData = ExtendedPlayer.get(player);
		NBTTagCompound SavedData = new NBTTagCompound();

		playerData.saveNBTData (SavedData);
		CommonProxy.storeEntityData(getSaveKey(player), SavedData);
	}

	public static void loadProxyData (EntityPlayer player){
		ExtendedPlayer playerData = ExtendedPlayer.get(player);
		NBTTagCompound savedData = CommonProxy.getEntityData(getSaveKey(player));

		if(savedData != null) {
			playerData.loadNBTData(savedData);
		}
		playerData.sync();
	}
	
	public static final void register(EntityPlayer player){
		player.registerExtendedProperties(EXT_PROP_NAME, new ExtendedPlayer(player));
	}

	public static final ExtendedPlayer get(EntityPlayer player){
		return (ExtendedPlayer) player.getExtendedProperties(EXT_PROP_NAME);
	}
 

}

package wehavecookies56.kk.util;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.entities.ExtendedPlayer;
import wehavecookies56.kk.item.ItemKeyblade;
import wehavecookies56.kk.item.ItemMunny;
import wehavecookies56.kk.item.ModItems;
import wehavecookies56.kk.network.PacketDispatcher;
import wehavecookies56.kk.network.SyncExtendedPlayer;

public class EventHandler {

	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event){
		if(event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer) event.entity) == null)
			ExtendedPlayer.register((EntityPlayer) event.entity);
	}
	
	@SubscribeEvent
	public void OnEntityJoinWorld(EntityJoinWorldEvent event){
		if(!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer){
			ExtendedPlayer.get((EntityPlayer) event.entity).loadProxyData(((EntityPlayer) event.entity));
			PacketDispatcher.sendTo(new SyncExtendedPlayer((EntityPlayer) event.entity), ((EntityPlayerMP) event.entity));
		}

	}
	
	@SubscribeEvent
	public void onLivingDeathEvent(LivingDeathEvent event) {
		if(!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer){
			ExtendedPlayer.get((EntityPlayer) event.entity).saveProxyData(((EntityPlayer) event.entity));
			
		} else {}
	}
	
	@SubscribeEvent
	public void onLivingDrops(LivingDropsEvent event){
		if(event.entity instanceof EntityPig){
			if(event.source.getSourceOfDamage() instanceof EntityPlayer){
				ItemStack munny = new ItemStack(ModItems.Munny, 1);
				munny.setTagCompound(new NBTTagCompound());
				munny.getTagCompound().setInteger("amount", 100);
				event.entityLiving.entityDropItem(munny, 1);
			}
		}
		
		if(event.entity instanceof EntityZombie){
			if(event.source.getSourceOfDamage() instanceof EntityPlayer){
				EntityPlayer player = (EntityPlayer)event.source.getSourceOfDamage();
				if(player.getCurrentEquippedItem() != null){
					if(player.getCurrentEquippedItem().getItem() instanceof ItemKeyblade){
						event.entityLiving.entityDropItem(new ItemStack(ModItems.DarkHeart), 2);
					}
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onEntityItemPickUp(EntityItemPickupEvent event){
		
	}
	
	@SubscribeEvent
	public void onLivingUpdate(LivingUpdateEvent event){
		
	}
}

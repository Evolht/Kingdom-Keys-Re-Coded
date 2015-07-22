package wehavecookies56.kk.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TabKingdomKeys extends CreativeTabs {

	public TabKingdomKeys(int index, String label) {
		super(index, label);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return ModItems.KingdomHearts;
	}

	@Override
	public void displayAllReleventItems(List list) {
		super.displayAllReleventItems(list);
		ItemStack munny = new ItemStack(ModItems.Munny, 1);
		munny.setTagCompound(new NBTTagCompound());
		munny.getTagCompound().setInteger("amount", 1000000);
		list.add(munny);
		ItemStack driveOrb = new ItemStack(ModItems.DriveOrb, 1);
		driveOrb.setTagCompound(new NBTTagCompound());
		driveOrb.getTagCompound().setInteger("amount", 1000);
		list.add(driveOrb);
		ItemStack WHC56skull = new ItemStack(Items.skull, 1, 3);
		WHC56skull.setTagCompound(new NBTTagCompound());
		WHC56skull.getTagCompound().setTag("SkullOwner", new NBTTagString("Wehavecookies56"));
		list.add(WHC56skull);
		ItemStack AAskull = new ItemStack(Items.skull, 1, 3);
		AAskull.setTagCompound(new NBTTagCompound());
		AAskull.getTagCompound().setTag("SkullOwner", new NBTTagString("Abelatox"));
		list.add(AAskull);
	}

}
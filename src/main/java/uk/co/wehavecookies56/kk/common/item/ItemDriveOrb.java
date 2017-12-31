package uk.co.wehavecookies56.kk.common.item;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import uk.co.wehavecookies56.kk.common.item.base.ItemKKBase;

public class ItemDriveOrb extends ItemKKBase {

    public ItemDriveOrb (String name) {
        super(name);
        setMaxStackSize(1);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if (stack.hasTagCompound()) {
            int amount = stack.getTagCompound().getInteger("amount");
            tooltip.add("" + amount);
        }
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
        if (isInCreativeTab(tab)) {
            ItemStack driveOrb = new ItemStack(ModItems.DriveOrb, 1);
            driveOrb.setTagCompound(new NBTTagCompound());
            driveOrb.getTagCompound().setInteger("amount", 1000);
            items.add(driveOrb);
        }
    }
}

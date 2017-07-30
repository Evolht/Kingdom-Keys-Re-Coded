package uk.co.wehavecookies56.kk.common.item.org;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import uk.co.wehavecookies56.kk.common.item.base.ItemOrgWeapon;
import uk.co.wehavecookies56.kk.common.util.Utils;
import uk.co.wehavecookies56.kk.common.util.Utils.OrgMember;
import uk.co.wehavecookies56.kk.common.world.dimension.ModDimensions;
import uk.co.wehavecookies56.kk.common.world.dimension.TeleporterDestinyIslands;
import uk.co.wehavecookies56.kk.common.world.dimension.TeleporterDiveToTheHeart;
import uk.co.wehavecookies56.kk.common.world.dimension.TeleporterTraverseTown;

public class ItemCard extends ItemOrgWeapon implements IOrgWeapon{

    public ItemCard (String name, double strength, double magic)  {
        super(name, strength,magic);
        setMaxStackSize(1);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("X Luxord");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote)
            if (playerIn.dimension != ModDimensions.destinyIslandsID)
                new TeleporterDestinyIslands(worldIn.getMinecraftServer().getServer().getWorld(ModDimensions.destinyIslandsID)).teleport(((EntityPlayer) playerIn), worldIn);
            else
                new TeleporterDiveToTheHeart(worldIn.getMinecraftServer().getServer().getWorld(ModDimensions.diveToTheHeartID)).teleport(playerIn, worldIn);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public OrgMember getMember() {
        return Utils.OrgMember.LUXORD;
    }
}

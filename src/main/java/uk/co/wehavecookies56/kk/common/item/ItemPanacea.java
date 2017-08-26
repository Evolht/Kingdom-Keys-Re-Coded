package uk.co.wehavecookies56.kk.common.item;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import uk.co.wehavecookies56.kk.common.item.base.ItemKKPotion;
import uk.co.wehavecookies56.kk.common.lib.Strings;

public class ItemPanacea extends ItemKKPotion {

    String potionType;

    public ItemPanacea(int food, boolean wolf, String type) {
        super(food, wolf, type, Strings.Panacea);
        setAlwaysEdible();
        this.potionType = type;
    }

    @Override
    public void potionEffect (EntityPlayer player) {
        player.clearActivePotions();
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(TextFormatting.WHITE + "Removes all potion effects");
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
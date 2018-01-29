package uk.co.wehavecookies56.kk.common.entity.magic;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import uk.co.wehavecookies56.kk.common.capability.ModCapabilities;
import uk.co.wehavecookies56.kk.common.core.handler.MainConfig;
import uk.co.wehavecookies56.kk.common.item.base.ItemKeyblade;
import uk.co.wehavecookies56.kk.common.item.base.ItemOrgWeapon;
import uk.co.wehavecookies56.kk.common.item.org.IOrgWeapon;
import uk.co.wehavecookies56.kk.common.item.org.ItemClaymore;
import uk.co.wehavecookies56.kk.common.lib.Strings;

public class DamageCalculation {
    public static float fireMultiplier = 0.8F;
    public static float blizzardMultiplier = 1;
    public static float aeroMultiplier = 0.2F;

    /**
     * Magic
     */
    public static float getMagicDamage(EntityPlayer player, int level, ItemKeyblade keyblade) {
        if (player != null) {
            float damage = 0;
            float finalDamage = 0;

            damage = (float) (keyblade.getMagic() + player.getCapability(ModCapabilities.PLAYER_STATS, null).getMagic());

            switch (player.getCapability(ModCapabilities.DRIVE_STATE, null).getActiveDriveName()) {
                case Strings.Form_Wisdom:
                    damage = damage * 2;
                    break;
                case Strings.Form_Master:
                    damage = (float) (damage * 2.25);
                    break;
                case Strings.Form_Final:
                    damage = (float) (damage * 2.5);
                    break;
            }

            switch (level) {
                case 1:
                    finalDamage = damage;
                    break;
                case 2:
                    finalDamage = (float) (damage + (0.1 * damage));
                    break;
                case 3:
                    finalDamage = (float) (damage + (0.2 * damage));
                    break;
            }
            //System.out.println("Magic: "+finalDamage);

            return (float) (finalDamage * MainConfig.items.damageMultiplier);
        } else {
            return 0;
        }
    }
    /**
     * Magic
     */
    public static float getMagicDamage(EntityPlayer player, int level, IOrgWeapon weapon) {
        if (player != null) {
            float damage = 0;
            float finalDamage = 0;

            damage = (float) (weapon.getMagic() + player.getCapability(ModCapabilities.PLAYER_STATS, null).getMagic());

            switch (player.getCapability(ModCapabilities.DRIVE_STATE, null).getActiveDriveName()) {
                case Strings.Form_Wisdom:
                    damage = damage * 2;
                    break;
                case Strings.Form_Master:
                    damage = (float) (damage * 2.25);
                    break;
                case Strings.Form_Final:
                    damage = (float) (damage * 2.5);
                    break;
            }

            switch (level) {
                case 1:
                    finalDamage = damage;
                    break;
                case 2:
                    finalDamage = (float) (damage + (0.1 * damage));
                    break;
                case 3:
                    finalDamage = (float) (damage + (0.2 * damage));
                    break;
            }
            //System.out.println("Magic: "+finalDamage);

            return (float) (finalDamage * MainConfig.items.damageMultiplier);
        } else {
            return 0;
        }
    }
    /**
     * Magic
     */
    public static float getMagicDamage(EntityPlayer player, int level) {
        if (player != null) {
            float finalDamage = 0;

            if (!ItemStack.areItemStacksEqual(player.getHeldItem(EnumHand.MAIN_HAND), ItemStack.EMPTY) && player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof ItemKeyblade) {
                finalDamage = getMagicDamage(player, level, (ItemKeyblade) player.getHeldItemMainhand().getItem());
            } else {
                finalDamage = player.getCapability(ModCapabilities.PLAYER_STATS, null).getMagic();
            }
            return (float) (finalDamage * MainConfig.items.damageMultiplier);
        } else {
            return 0;
        }
    }


    /**
     * Strength
     */
    public static float getStrengthDamage(EntityPlayer player, ItemKeyblade keyblade) {
        if (player != null) {
            float damage = 0;
            float finalDamage = 0;

            damage = (float) (keyblade.getStrength() + player.getCapability(ModCapabilities.PLAYER_STATS, null).getStrength());

            switch (player.getCapability(ModCapabilities.DRIVE_STATE, null).getActiveDriveName()) {
                case Strings.Form_Valor:
                    damage = (float) (damage * 1.5);
                    break;
                case Strings.Form_Limit:
                    damage = (float) (damage * 1.2);
                    break;
                case Strings.Form_Master:
                    damage = (float) (damage * 1.5);
                    break;
                case Strings.Form_Final:
                    damage = (float) (damage * 1.7);
                    break;
            }

            finalDamage = (float) (damage * MainConfig.items.damageMultiplier);
            //System.out.println("Strength: "+finalDamage);
            return finalDamage;
        } else {
            return 0;
        }
    }
    /**
     * Strength
     */
    public static float getOrgStrengthDamage(EntityPlayer player, ItemStack weapon) {
        if (player != null) {
            float damage = 0;
            float finalDamage = 0;
            if (weapon.getItem() instanceof IOrgWeapon) {
                damage = (float) (((IOrgWeapon) weapon.getItem()).getStrength() + player.getCapability(ModCapabilities.PLAYER_STATS, null).getStrength());

                switch (player.getCapability(ModCapabilities.DRIVE_STATE, null).getActiveDriveName()) {
                    case Strings.Form_Valor:
                        damage = (float) (damage * 1.5);
                        break;
                    case Strings.Form_Limit:
                        damage = (float) (damage * 1.2);
                        break;
                    case Strings.Form_Master:
                        damage = (float) (damage * 1.5);
                        break;
                    case Strings.Form_Final:
                        damage = (float) (damage * 1.7);
                        break;
                }

                if (weapon.getItem() instanceof ItemClaymore) {
                    if (weapon.getItemDamage() == 1)
                        damage *= 1.25F;
                }
                finalDamage = (float) (damage * MainConfig.items.damageMultiplier);
            }
            return finalDamage;
        } else {
            return 0;
        }
    }
    /**
     * Strength
     */
    public static float getStrengthDamage(EntityPlayer player) {
        if (player != null) {
            float finalDamage = 0;

            if (!ItemStack.areItemStacksEqual(player.getHeldItem(EnumHand.MAIN_HAND), ItemStack.EMPTY) && player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof ItemKeyblade) {
                finalDamage = getStrengthDamage(player, (ItemKeyblade) player.getHeldItemMainhand().getItem());
            } else if (!ItemStack.areItemStacksEqual(player.getHeldItem(EnumHand.MAIN_HAND), ItemStack.EMPTY) && player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof IOrgWeapon) {
                finalDamage = getOrgStrengthDamage(player, player.getHeldItemMainhand());
            }
            return finalDamage;
        } else {
            return 0;
        }
    }
}

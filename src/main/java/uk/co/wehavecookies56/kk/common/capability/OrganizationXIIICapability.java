package uk.co.wehavecookies56.kk.common.capability;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.Constants;
import uk.co.wehavecookies56.kk.api.recipes.RecipeRegistry;
import uk.co.wehavecookies56.kk.common.core.helper.LogHelper;
import uk.co.wehavecookies56.kk.common.item.ModItems;
import uk.co.wehavecookies56.kk.common.item.base.ItemOrgWeapon;
import uk.co.wehavecookies56.kk.common.item.org.IOrgWeapon;
import uk.co.wehavecookies56.kk.common.util.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toby on 08/02/2017.
 */
public class OrganizationXIIICapability {

    List<Item> unlockedWeapons = new ArrayList<>();

    public interface IOrganizationXIII {
        Utils.OrgMember getMember();
        Item currentWeapon();

        List<Item> unlockedWeapons();

        void setMember(Utils.OrgMember member);
        void setCurrentWeapon(Item weapon);
        void setUnlockedWeapons(List<Item> list);
        void addUnlockedWeapon(Item item);
        void removeUnlockedWeapon(Item item);
    }

    public static class Storage implements Capability.IStorage<IOrganizationXIII> {
        @Override
        public NBTBase writeNBT(Capability<IOrganizationXIII> capability, IOrganizationXIII instance, EnumFacing side) {
            NBTTagCompound properties = new NBTTagCompound();
            properties.setInteger("Member", instance.getMember().ordinal());
            new ItemStack(instance.currentWeapon()).writeToNBT(properties);

            NBTTagList tagList = new NBTTagList();
            for (int i = 0; i < instance.unlockedWeapons().size(); i++) {
                Item item = instance.unlockedWeapons().get(i);
                if (item != null) {
                    NBTTagCompound weapons = new NBTTagCompound();
                    new ItemStack(item).writeToNBT(weapons);
                    tagList.appendTag(weapons);
                }
            }
            properties.setTag("UnlockedWeapons", tagList);
            return properties;
        }

        @Override
        public void readNBT(Capability<IOrganizationXIII> capability, IOrganizationXIII instance, EnumFacing side, NBTBase nbt) {
            NBTTagCompound properties = (NBTTagCompound) nbt;
            instance.setMember(Utils.OrgMember.values()[properties.getInteger("Member")]);
            instance.setCurrentWeapon(ItemStack.loadItemStackFromNBT(properties).getItem());
            NBTTagList tagList = properties.getTagList("UnlockedWeapons", Constants.NBT.TAG_COMPOUND);
            for (int i = 0; i < tagList.tagCount(); i++) {
                NBTTagCompound weapons = tagList.getCompoundTagAt(i);
                if (!instance.unlockedWeapons().contains(ItemStack.loadItemStackFromNBT(weapons).getItem())) {
                    instance.addUnlockedWeapon(ItemStack.loadItemStackFromNBT(weapons).getItem());
                    LogHelper.info("Loaded unlocked weapon: " + ItemStack.loadItemStackFromNBT(weapons).getDisplayName());
                }
            }
        }
    }

    public static class Default implements IOrganizationXIII {
        private Utils.OrgMember member = Utils.OrgMember.NONE;
        private Item weapon = ModItems.KingdomKey;
        private List<Item> weapons = new ArrayList<>();

        @Override
        public Utils.OrgMember getMember() {
            return member;
        }

        @Override
        public Item currentWeapon() {
            return weapon;
        }

        @Override
        public void setMember(Utils.OrgMember member) {
            this.member = member;
        }

        @Override
        public void setCurrentWeapon(Item weapon) {
            this.weapon = weapon;
        }

        @Override
        public List<Item> unlockedWeapons() {
            return weapons;
        }

        @Override
        public void setUnlockedWeapons(List<Item> list) {
            this.weapons = list;
        }

        @Override
        public void addUnlockedWeapon(Item item) {
            this.weapons.add(item);
        }

        @Override
        public void removeUnlockedWeapon(Item item) {
            this.weapons.remove(this.weapons.indexOf(item));
        }
    }

}
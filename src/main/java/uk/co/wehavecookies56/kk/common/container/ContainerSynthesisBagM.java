package uk.co.wehavecookies56.kk.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import uk.co.wehavecookies56.kk.common.container.inventory.InventorySynthesisBagM;
import uk.co.wehavecookies56.kk.common.container.slot.SlotSynthesisBag;

public class ContainerSynthesisBagM extends Container {

	private final InventorySynthesisBagM inventory;

	private static final int INV_START = InventorySynthesisBagM.INV_SIZE, INV_END = INV_START + 26, HOTBAR_START = INV_END + 1, HOTBAR_END = HOTBAR_START + 8;

	public ContainerSynthesisBagM (EntityPlayer player, InventoryPlayer invPlayer, InventorySynthesisBagM invBag) {
		inventory = invBag;

		int i;
		int j;

		// Bag Inventory
		for (i = 0; i < 4; i++)
			for (j = 0; j < 7; j++)
				addSlotToContainer(new SlotSynthesisBag(invBag, j + i * 7, 26 + j * 18, 18 + i * 18));

		for (i = 0; i < 3; ++i)
			for (j = 0; j < 9; ++j)
				addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 94 + i * 18));

		for (i = 0; i < 9; ++i)
			addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 152));
	}

	@Override
	public boolean canInteractWith (EntityPlayer player) {
		return true;
	}

	@Override
	public ItemStack transferStackInSlot (EntityPlayer playerIn, int index) {
		int numRows = 28 / 7;
		ItemStack itemstack = null;
		Slot slot = this.inventorySlots.get(index);

		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (index < numRows * 7) {
				if (!mergeItemStack(itemstack1, numRows * 7, this.inventorySlots.size(), true)) return null;
			} else if (!mergeItemStack(itemstack1, 0, numRows * 7, false)) return null;

			if (itemstack1.getCount() == 0)
				slot.putStack(ItemStack.EMPTY);
			else
				slot.onSlotChanged();
		}

		return itemstack;
	}

	@Override
	public ItemStack slotClick(int slot, int dragType, ClickType clickTypeIn, EntityPlayer player) {
		if (slot >= 0 && getSlot(slot) != null && getSlot(slot).getStack() == player.getHeldItem(EnumHand.MAIN_HAND)) return null;
		return super.slotClick(slot, dragType, clickTypeIn, player);
	}

	@Override
	protected boolean mergeItemStack (ItemStack stack, int start, int end, boolean backwards) {
		boolean flag1 = false;
		int k = (backwards ? end - 1 : start);
		Slot slot;
		ItemStack itemstack1;

		if (stack.isStackable()) while (stack.getCount() > 0 && (!backwards && k < end || backwards && k >= start)) {
			slot = inventorySlots.get(k);
			itemstack1 = slot.getStack();

			if (!slot.isItemValid(stack)) {
				k += (backwards ? -1 : 1);
				continue;
			}

			if (itemstack1 != null && itemstack1.getItem() == stack.getItem() && (!stack.getHasSubtypes() || stack.getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(stack, itemstack1)) {
				int l = itemstack1.getCount() + stack.getCount();

				if (l <= stack.getMaxStackSize() && l <= slot.getSlotStackLimit()) {
					stack.setCount(0);
					itemstack1.setCount(1);
					inventory.markDirty();
					flag1 = true;
				} else if (itemstack1.getCount() < stack.getMaxStackSize() && l < slot.getSlotStackLimit()) {
					stack.shrink(stack.getMaxStackSize() - itemstack1.getCount());
					itemstack1.setCount(stack.getMaxStackSize());
					inventory.markDirty();
					flag1 = true;
				}
			}

			k += (backwards ? -1 : 1);
		}

		if (stack.getCount() > 0) {
			k = (backwards ? end - 1 : start);

			while (!backwards && k < end || backwards && k >= start) {
				slot = inventorySlots.get(k);
				itemstack1 = slot.getStack();

				if (!slot.isItemValid(stack)) {
					k += (backwards ? -1 : 1);
					continue;
				}

				if (itemstack1 == ItemStack.EMPTY) {
					int l = stack.getCount();

					if (l <= slot.getSlotStackLimit()) {
						slot.putStack(stack.copy());
						stack.setCount(0);
						inventory.markDirty();
						flag1 = true;
						break;
					} else {
						putStackInSlot(k, new ItemStack(stack.getItem(), slot.getSlotStackLimit(), stack.getItemDamage()));
						stack.shrink(slot.getSlotStackLimit());
						inventory.markDirty();
						flag1 = true;
					}
				}

				k += (backwards ? -1 : 1);
			}
		}

		return flag1;
	}
}
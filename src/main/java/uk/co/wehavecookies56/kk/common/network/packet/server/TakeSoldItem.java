package uk.co.wehavecookies56.kk.common.network.packet.server;

import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.relauncher.Side;
import uk.co.wehavecookies56.kk.common.capability.ModCapabilities;
import uk.co.wehavecookies56.kk.common.network.packet.AbstractMessage;
import uk.co.wehavecookies56.kk.common.network.packet.PacketDispatcher;
import uk.co.wehavecookies56.kk.common.network.packet.client.SyncMunnyData;

public class TakeSoldItem extends AbstractMessage.AbstractServerMessage<TakeSoldItem> {

    public TakeSoldItem() {}

    int munnyToGive;
    int quantity;
    ItemStack soldItem;

    public TakeSoldItem(int spentMunny, int quantity, ItemStack boughtItem) {
        this.munnyToGive = spentMunny;
        this.quantity = quantity;
        this.soldItem = boughtItem;
    }

    @Override
    protected void read (PacketBuffer buffer) throws IOException {
        this.munnyToGive = buffer.readInt();
        this.quantity = buffer.readInt();
        this.soldItem = buffer.readItemStack();
    }

    @Override
    protected void write (PacketBuffer buffer) throws IOException {
        buffer.writeInt(munnyToGive);
        buffer.writeInt(quantity);
        buffer.writeItemStack(soldItem);
    }

    @Override
    public void process (EntityPlayer player, Side side) {
        int quantityRemaining = quantity;
        for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
            if (player.inventory.getStackInSlot(i).getItem() == soldItem.getItem()) {
                if (quantityRemaining >= player.inventory.getStackInSlot(i).getCount()) {
                    player.inventory.removeStackFromSlot(i);
                    quantityRemaining -= player.inventory.getStackInSlot(i).getCount();
                } else if (quantityRemaining < player.inventory.getStackInSlot(i).getCount()) {
                    player.inventory.getStackInSlot(i).shrink(quantityRemaining);
                }
            }
        }
        player.getCapability(ModCapabilities.MUNNY, null).addMunny(munnyToGive);
        PacketDispatcher.sendTo(new SyncMunnyData(player.getCapability(ModCapabilities.MUNNY, null)), (EntityPlayerMP) player);
    }

}

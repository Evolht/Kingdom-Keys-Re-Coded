package uk.co.wehavecookies56.kk.common.network.packet.server;

import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.fml.relauncher.Side;
import uk.co.wehavecookies56.kk.client.sound.ModSounds;
import uk.co.wehavecookies56.kk.common.item.org.ItemClaymore;
import uk.co.wehavecookies56.kk.common.network.packet.AbstractMessage;

public class SummonClaymore extends AbstractMessage.AbstractServerMessage<SummonClaymore> {

    ItemStack stack;

    public SummonClaymore () {}

    public SummonClaymore (ItemClaymore claymore) {
        this.stack = new ItemStack(claymore);
    }

    @Override
    protected void read (PacketBuffer buffer) throws IOException {
        stack = buffer.readItemStack();
    }

    @Override
    protected void write (PacketBuffer buffer) throws IOException {
        buffer.writeItemStack(stack);
    }

    @Override
    public void process (EntityPlayer player, Side side) {
        stack.setItemDamage(1);
        player.inventory.setInventorySlotContents(player.inventory.currentItem, stack);
        player.world.playSound((EntityPlayer)null, player.getPosition(), ModSounds.summon, SoundCategory.MASTER, 1.0f, 1.0f);
    }
}
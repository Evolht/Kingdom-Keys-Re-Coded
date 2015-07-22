package wehavecookies56.kk.network.packet.server;

import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import wehavecookies56.kk.entities.magic.EntityFire2;
import wehavecookies56.kk.network.packet.AbstractMessage.AbstractServerMessage;

public class MagicFire extends AbstractServerMessage<MagicFire> {

	public MagicFire() {}

	@Override
	protected void read(PacketBuffer buffer) throws IOException {

	}

	@Override
	protected void write(PacketBuffer buffer) throws IOException {

	}

	@Override
	public void process(EntityPlayer player, Side side) {
		World world = player.worldObj;
		world.spawnEntityInWorld(new EntityFire2(world));
		//MagicAttack.currMagic = MagicAttack.currMagic - MagicAttack.fireCost;
	}

}
package uk.co.wehavecookies56.kk.common.network.packet.client;

import java.io.IOException;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.relauncher.Side;
import uk.co.wehavecookies56.kk.common.network.packet.AbstractMessage;
import uk.co.wehavecookies56.kk.common.util.Utils;

public class SpawnPortalParticles extends AbstractMessage.AbstractClientMessage<SpawnPortalParticles> {

    double x, y, z;
    int lvl;

    public SpawnPortalParticles () {}

    public SpawnPortalParticles (BlockPos pos) {
        x = pos.getX()+0.5;
        y = pos.getY();
        z = pos.getZ()+0.5;
    }

    @Override
    protected void read (PacketBuffer buffer) throws IOException {
        x = buffer.readDouble();
        y = buffer.readDouble();
        z = buffer.readDouble();
    }

    @Override
    protected void write (PacketBuffer buffer) throws IOException {
        buffer.writeDouble(x);
        buffer.writeDouble(y);
        buffer.writeDouble(z);
    }

    @Override
    public void process (EntityPlayer player, Side side) {
    	for(int i=0;i<10;i++) {
			double x = Utils.randomWithRange(-1.5d,1.5d);
			double y = Utils.randomWithRange(0d,5d);
			double z = Utils.randomWithRange(-1.5d,1.5d);
		
		    player.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.x+x, this.y+y, this.z+z, 0.0D, 0.0D, 0.0D);
    	}
    }
}

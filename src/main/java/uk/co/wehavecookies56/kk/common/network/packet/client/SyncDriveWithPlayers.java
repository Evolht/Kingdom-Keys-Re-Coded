package uk.co.wehavecookies56.kk.common.network.packet.client;

import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.relauncher.Side;
import uk.co.wehavecookies56.kk.common.capability.DriveStateCapability;
import uk.co.wehavecookies56.kk.common.capability.ModCapabilities;
import uk.co.wehavecookies56.kk.common.network.packet.AbstractMessage;

/**
 * Created by Toby on 22/05/2016.
 */
public class SyncDriveWithPlayers extends AbstractMessage.AbstractClientMessage<SyncDriveWithPlayers> {

    public SyncDriveWithPlayers() {}

    int entityId;
    boolean inDrive;
    String driveName;

    public SyncDriveWithPlayers(int entityId, DriveStateCapability.IDriveState driveState) {
        this.entityId = entityId;
        this.inDrive = driveState.getInDrive();
        this.driveName = driveState.getActiveDriveName();
    }

    @Override
    protected void read(PacketBuffer buffer) throws IOException {
        this.entityId = buffer.readInt();
        this.inDrive = buffer.readBoolean();
        this.driveName = buffer.readString(100);
    }

    @Override
    protected void write(PacketBuffer buffer) throws IOException {
        buffer.writeInt(this.entityId);
        buffer.writeBoolean(this.inDrive);
        buffer.writeString(this.driveName);
    }

    @Override
    public void process(EntityPlayer player, Side side) {
        EntityPlayer otherPlayer = (EntityPlayer) player.world.getEntityByID(this.entityId);
        otherPlayer.getCapability(ModCapabilities.DRIVE_STATE, null).setInDrive(this.inDrive);
        otherPlayer.getCapability(ModCapabilities.DRIVE_STATE, null).setActiveDriveName(this.driveName);
    }
}

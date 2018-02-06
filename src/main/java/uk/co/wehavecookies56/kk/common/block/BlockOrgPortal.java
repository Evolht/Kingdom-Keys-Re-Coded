package uk.co.wehavecookies56.kk.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import uk.co.wehavecookies56.kk.common.block.tile.TileEntityOrgPortal;
import uk.co.wehavecookies56.kk.common.capability.ModCapabilities;
import uk.co.wehavecookies56.kk.common.network.packet.PacketDispatcher;
import uk.co.wehavecookies56.kk.common.network.packet.client.SyncOrgXIIIData;
import uk.co.wehavecookies56.kk.common.util.Utils;

public class BlockOrgPortal extends Block implements ITileEntityProvider{

    protected BlockOrgPortal (Material material, String toolClass, int level, float hardness, float resistance, String name) {
        super(material);
        this.setHarvestLevel(toolClass, level);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(SoundType.STONE);
        setCreativeTab(ModBlocks.tabKingdomKeysBlocks);
        setRegistryName(name);
        setUnlocalizedName(name);
    }

    @Override
    public TileEntity createNewTileEntity (World worldIn, int meta) {
        return new TileEntityOrgPortal();
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            byte index=-1;

            if (player.getCapability(ModCapabilities.ORGANIZATION_XIII, null).getMember() != Utils.OrgMember.NONE) {
                if (world.getTileEntity(pos) instanceof TileEntityOrgPortal) {

                    TileEntityOrgPortal te = (TileEntityOrgPortal) world.getTileEntity(pos);

                    if (te.getOwner() == null) {
                        te.setOwner(player);
                        te.markDirty();

                    	for(byte i=0;i<3;i++) {
                    		double[] coords = player.getCapability(ModCapabilities.ORGANIZATION_XIII, null).getPortalCoords(i);
                    		System.out.println(coords[0]);
                        	if(coords[0] == 0.0D && coords[1] == 0.0D && coords[2] == 0.0D) {
                        		index = i;
                        		break;
                        	}
                    	}
                    	System.out.println("A: "+index);
                        if(index != -1) {	
                            player.sendMessage(new TextComponentString(TextFormatting.GREEN + "This is now " + player.getDisplayNameString() + "'s portal "+index));
                        	player.getCapability(ModCapabilities.ORGANIZATION_XIII, null).setPortalCoords((byte)index, new double[] {pos.getX(),pos.getY(),pos.getZ(),player.dimension});
                        } else {
                            player.sendMessage(new TextComponentString(TextFormatting.RED + "You have no empty slots for portals"));
                        }
                        PacketDispatcher.sendTo(new SyncOrgXIIIData(player.getCapability(ModCapabilities.ORGANIZATION_XIII, null)), (EntityPlayerMP) player);
                        return true;

                    }else if(te.getOwner().equals(player.getDisplayNameString())){
                        player.sendMessage(new TextComponentString(TextFormatting.YELLOW + "This is your portal "+index));
                    }else {
                        player.sendMessage(new TextComponentString(TextFormatting.RED + "This portal belongs to "+player.getDisplayNameString()));
                        return false;
                    }

                }
            }
        }
        return false;
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        if (!world.isRemote) {
            //System.out.println(world.getTileEntity(pos));

            if (world.getTileEntity(pos) instanceof TileEntityOrgPortal) {
                TileEntityOrgPortal te = (TileEntityOrgPortal) world.getTileEntity(pos);
                if (te.getOwner() != null) {
                    EntityPlayer player = world.getPlayerEntityByName(te.getOwner());
                    
                    byte index=-1;
                	for(byte i=0;i<3;i++) {
                		double[] coords = player.getCapability(ModCapabilities.ORGANIZATION_XIII, null).getPortalCoords(i);
                    	if(coords[0] == pos.getX() && coords[1] == pos.getY() && coords[2] == pos.getZ()) {
                    		index = i;
                    		break;
                    	}
                	}
                	System.out.println("R: "+index);
                    if(index != -1) {	
                        player.sendMessage(new TextComponentString(TextFormatting.RED + "Portal destination disappeared"));
                        player.getCapability(ModCapabilities.ORGANIZATION_XIII, null).setPortalCoords((byte)index, new double[] {0,0,0,0});
                    } else {
                        player.sendMessage(new TextComponentString(TextFormatting.RED + "You have no empty slots for portals"));
                    }
                    
                    
                    PacketDispatcher.sendTo(new SyncOrgXIIIData(player.getCapability(ModCapabilities.ORGANIZATION_XIII, null)), (EntityPlayerMP) player);
                }
            }
        }
        super.breakBlock(world, pos, state);
    }

    @Override
    public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state) {



        super.onBlockDestroyedByPlayer(world, pos, state);
    }
}

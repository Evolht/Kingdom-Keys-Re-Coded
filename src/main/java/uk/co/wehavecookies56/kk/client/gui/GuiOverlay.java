package uk.co.wehavecookies56.kk.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import uk.co.wehavecookies56.kk.common.capability.DriveStateCapability.IDriveState;
import uk.co.wehavecookies56.kk.common.capability.ModCapabilities;
import uk.co.wehavecookies56.kk.common.capability.PlayerStatsCapability;
import uk.co.wehavecookies56.kk.common.capability.PlayerStatsCapability.IPlayerStats;
import uk.co.wehavecookies56.kk.common.core.handler.MainConfig;
import uk.co.wehavecookies56.kk.common.lib.Reference;
import uk.co.wehavecookies56.kk.common.lib.Strings;
import uk.co.wehavecookies56.kk.common.util.Utils;

import java.awt.Color;

public class GuiOverlay extends GuiScreen {
    public static boolean showExp;
    public static boolean showMunny;
    public static boolean showLevelUp;
    public static boolean showDriveLevelUp;
    public static String driveForm;
    public static long timeExp;
    public static long timeMunny;
    public static long timeLevelUp;
    public static long timeDriveLevelUp;
    public static int munnyGet;
    int levelSeconds = 6;

    @SubscribeEvent
    @SideOnly (Side.CLIENT)
    public void RenderGameOverlayEvent (RenderGameOverlayEvent event) {
        if (event.getType() == ElementType.TEXT) {
            Minecraft mc = Minecraft.getMinecraft();
            int screenWidth = event.getResolution().getScaledWidth();
            int screenHeight = event.getResolution().getScaledHeight();
            IPlayerStats STATS = mc.player.getCapability(ModCapabilities.PLAYER_STATS, null);
            IDriveState DRIVE = mc.player.getCapability(ModCapabilities.DRIVE_STATE, null);

            if (showExp) {
                String reqExp = String.valueOf(STATS.getExpNeeded(STATS.getLevel(), STATS.getExperience()));
                mc.fontRenderer.drawString("Next LV", 5, 5, 0xFFFFFF);
                mc.fontRenderer.drawString(reqExp, 5, 5 + mc.fontRenderer.FONT_HEIGHT, 0xFFFFFF);
                if (timeExp + 4 <= (int) Minecraft.getSystemTime() / 1000)
                	showExp = false;
            }
            if (showMunny) {
                if (!showExp) {
                    GL11.glPushMatrix();
                    GL11.glTranslatef(1, 1, 0);
                    mc.fontRenderer.drawString("Munny Get!", 5, 5, 0xFFFFFF);
                    mc.fontRenderer.drawString(munnyGet + "", 5, 5 + mc.fontRenderer.FONT_HEIGHT, 0xFFFFFF);
                    GL11.glPopMatrix();
                } else {
                    mc.fontRenderer.drawString("Munny Get!", 5, 5 + mc.fontRenderer.FONT_HEIGHT + 10, 0xFFFFFF);
                    mc.fontRenderer.drawString(munnyGet + "", 5, 5 + (mc.fontRenderer.FONT_HEIGHT * 2) + 10, 0xFFFFFF);
                }
                if (timeMunny + 4 <= (int) Minecraft.getSystemTime() / 1000) 
                	showMunny = false;
            }
            if (showLevelUp) {
                ResourceLocation texture = new ResourceLocation(Reference.MODID, "textures/gui/levelup.png");
                GL11.glPushMatrix();
                {
                    int height = (mc.fontRenderer.FONT_HEIGHT - 3) * STATS.getMessages().size();
                    GL11.glEnable(GL11.GL_BLEND);
                    GL11.glColor4ub((byte) MainConfig.client.hud.interfaceColour[0], (byte) MainConfig.client.hud.interfaceColour[1], (byte) MainConfig.client.hud.interfaceColour[2], (byte) 255);
                    GL11.glPushMatrix();
                    {
                        mc.renderEngine.bindTexture(texture);
                        int width = event.getResolution().getScaledWidth();
                        GL11.glPushMatrix();
                        {
                            GL11.glTranslatef((width - 153.6f - 2), 0, 0);
                            GL11.glScalef(0.6f, 0.6f, 1);
                            drawTexturedModalRect(0, 0, 0, 0, 256, 36);
                        }
                        GL11.glPopMatrix();
                        GL11.glPushMatrix();
                        {
                            GL11.glTranslatef(width - ((mc.fontRenderer.getStringWidth("LEVEL UP!")) * 0.75f) - 115, 4, 0);
                            GL11.glScalef(0.75f, 0.75f, 1);
                            drawString(mc.fontRenderer, "LEVEL UP!" + TextFormatting.ITALIC, 0, 0, Color.decode(String.format("#%02x%02x%02x", (byte) MainConfig.client.hud.interfaceColour[0], (byte) MainConfig.client.hud.interfaceColour[1], (byte) MainConfig.client.hud.interfaceColour[2])).hashCode());
                        }
                        GL11.glPopMatrix();
                        GL11.glPushMatrix();
                        {
                            GL11.glPushMatrix();
                            {
                                GL11.glTranslatef(width - ((mc.fontRenderer.getStringWidth("LV. ")) * 0.75f) - 90, 4, 0);
                                GL11.glScalef(0.75f, 0.75f, 1);
                                drawString(mc.fontRenderer, "LV.", 0, 0, 0xE3D000);
                            }
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            {
                                GL11.glTranslatef(width - 256.0f * 0.75f + ((mc.fontRenderer.getStringWidth("999")) * 0.75f) + 88, 4, 0);
                                GL11.glScalef(0.75f, 0.75f, 1);
                                drawString(mc.fontRenderer, "" + STATS.getLevel(), 0, 0, 0xFFFFFF);
                            }
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            {
                                GL11.glTranslatef(width - ((mc.fontRenderer.getStringWidth(mc.player.getDisplayNameString())) * 0.75f) - 7, 4, 0);
                                GL11.glScalef(0.75f, 0.75f, 1);
                                drawString(mc.fontRenderer, mc.player.getDisplayNameString(), 0, 0, 0xFFFFFF);
                            }
                            GL11.glPopMatrix();
                        }
                        GL11.glPopMatrix();
                    }
                    GL11.glPopMatrix();
                    GL11.glColor4ub((byte) MainConfig.client.hud.interfaceColour[0], (byte) MainConfig.client.hud.interfaceColour[1], (byte) MainConfig.client.hud.interfaceColour[2], (byte) 255);
                    GL11.glPushMatrix();
                    {
                        mc.renderEngine.bindTexture(texture);
                        int width = event.getResolution().getScaledWidth();
                        GL11.glTranslatef((width - 256.0f * 0.6f - 2), 36.0f * 0.6f, 0);
                        GL11.glScalef(0.6f, height, 1);
                        drawTexturedModalRect(0, 0, 0, 36, 256, 1);
                    }
                    GL11.glPopMatrix();
                    GL11.glColor4ub((byte) MainConfig.client.hud.interfaceColour[0], (byte) MainConfig.client.hud.interfaceColour[1], (byte) MainConfig.client.hud.interfaceColour[2], (byte) 255);
                    GL11.glPushMatrix();
                    {
                        mc.renderEngine.bindTexture(texture);
                        int width = event.getResolution().getScaledWidth();
                        GL11.glTranslatef((width - 256.0f * 0.6f - 2), height + (36.0f * 0.6f), 0);
                        GL11.glScalef(0.6f, 0.6f, 1);
                        drawTexturedModalRect(0, 0, 0, 37, 256, 14);
                    }
                    GL11.glPopMatrix();
                    GL11.glColor4ub((byte) MainConfig.client.hud.interfaceColour[0], (byte) MainConfig.client.hud.interfaceColour[1], (byte) MainConfig.client.hud.interfaceColour[2], (byte) 255);
                    
                    for (int i = 0; i < STATS.getMessages().size(); i++) {
                        GL11.glPushMatrix();
                        {
                            int width = event.getResolution().getScaledWidth();

                            String message = STATS.getMessages().get(i).toString();
                            GL11.glTranslatef((width - 256.0f * 0.8f + (mc.fontRenderer.getStringWidth("Maximum HP Increased!")) * 0.8f), mc.fontRenderer.FONT_HEIGHT * 0.8f * i + 23, 0);
                            GL11.glTranslatef(-35, 0, 0);
                            GL11.glScalef(0.8f, 0.8f, 1);
                            drawString(mc.fontRenderer, Utils.translateToLocal(message), 0, 0, 0xFFFFFF);

                        }
                        GL11.glPopMatrix();
                    }
                    GL11.glColor4ub((byte) 255, (byte) 255, (byte) 255, (byte) 255);
                }
                GL11.glPopMatrix();
                if (timeLevelUp + levelSeconds <= (int) Minecraft.getSystemTime() / 1000) 
                	showLevelUp = false;
            }
            
            if (showDriveLevelUp || true) {
        		byte[] driveColor = new byte[] {(byte) 255,(byte) 255,(byte) 255};

        		switch(driveForm) {//mc.player.getCapability(ModCapabilities.DRIVE_STATE, null).getActiveDriveName()
        		case Strings.Form_Valor:
                	driveColor[0] = (byte) 255; driveColor[1] = (byte) 0; driveColor[2] = (byte) 0;
                	break;
                	
                case Strings.Form_Wisdom:
                	driveColor[0] = (byte) 0; driveColor[1] = (byte) 0; driveColor[2] = (byte) 255;
                	break;
                	
                case Strings.Form_Limit:
                	driveColor[0] = (byte) 153; driveColor[1] = (byte) 76; driveColor[2] = (byte) 255;
                	break;
                	
                case Strings.Form_Master:
                	driveColor[0] = (byte) 255; driveColor[1] = (byte) 185; driveColor[2] = (byte) 25;
                	break;
                	
                case Strings.Form_Final:
                	driveColor[0] = (byte) 230; driveColor[1] = (byte) 230; driveColor[2] = (byte) 230;
                	break;
        		}
        		
        		ResourceLocation texture = new ResourceLocation(Reference.MODID, "textures/gui/levelup.png");
                
                GL11.glPushMatrix();
                {
                    int height = (mc.fontRenderer.FONT_HEIGHT - 3) * DRIVE.getMessages().size();
                    GL11.glEnable(GL11.GL_BLEND);
                    
                    GL11.glColor4ub(driveColor[0], driveColor[1], driveColor[2], (byte) 255);
                    GL11.glPushMatrix();
                    {
                        mc.renderEngine.bindTexture(texture);
                        int width = event.getResolution().getScaledWidth();
                        int sHeight = event.getResolution().getScaledHeight();

                        GL11.glPushMatrix();
                        {
                            GL11.glTranslatef(2, sHeight/3, 0);
                            GL11.glScalef(0.6f, 0.6f, 1);
                            drawTexturedModalRect(0, 0, 0, 0, 256, 36);
                        }
                        GL11.glPopMatrix();
                        GL11.glPushMatrix();
                        {
                            GL11.glTranslatef(6, sHeight/3+5, 0);
                            GL11.glScalef(0.75f, 0.75f, 1);
                            drawString(mc.fontRenderer, "LEVEL UP!" + TextFormatting.ITALIC, 0, 0, Color.decode(String.format("#%02x%02x%02x", (byte) MainConfig.client.hud.interfaceColour[0], (byte) MainConfig.client.hud.interfaceColour[1], (byte) MainConfig.client.hud.interfaceColour[2])).hashCode());
                        }
                        GL11.glPopMatrix();
                        GL11.glPushMatrix();
                        {
                            GL11.glPushMatrix();
                            {
                                GL11.glTranslatef(2 + (mc.fontRenderer.getStringWidth("LV. ") * 0.75f)+38, sHeight/3+4, 0);
                                GL11.glScalef(0.75f, 0.75f, 1);
                                drawString(mc.fontRenderer, "LV.", 0, 0, 0xE3D000);
                            }
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            {
                                GL11.glTranslatef(2 * 0.75f + (mc.fontRenderer.getStringWidth("999") * 0.75f)+50, sHeight/3+4, 0);
                                GL11.glScalef(0.75f, 0.75f, 1);
                                drawString(mc.fontRenderer, "" + DRIVE.getDriveLevel(driveForm), 0, 0, 0xFFFFFF);
                            }
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            {
                                GL11.glTranslatef(150 - (mc.fontRenderer.getStringWidth(Utils.translateToLocal(driveForm)) * 0.75f), sHeight/3+4, 0);
                                GL11.glScalef(0.75f, 0.75f, 1);
                                drawString(mc.fontRenderer, Utils.translateToLocal(driveForm), 0, 0, 0xFFFFFF);
                            }
                            GL11.glPopMatrix();
                        }
                        GL11.glPopMatrix();
                    }
                    GL11.glPopMatrix();
                    GL11.glColor4ub(driveColor[0], driveColor[1], driveColor[2], (byte) 255);
                    GL11.glPushMatrix();
                    {
                        mc.renderEngine.bindTexture(texture);
                        int width = event.getResolution().getScaledWidth();
                        int sHeight = event.getResolution().getScaledHeight();

                        GL11.glTranslatef(2.0f * 0.6f+1,sHeight/3+ 36.0f * 0.6f, 0);
                        GL11.glScalef(0.6f, height, 1);
                        drawTexturedModalRect(0, 0, 0, 36, 256, 1);
                    }
                    GL11.glPopMatrix();
                    GL11.glColor4ub(driveColor[0], driveColor[1], driveColor[2], (byte) 255);
                    GL11.glPushMatrix();
                    {
                        mc.renderEngine.bindTexture(texture);
                        int width = event.getResolution().getScaledWidth();
                        int sHeight = event.getResolution().getScaledHeight();

                        GL11.glTranslatef(2, sHeight/3+height + (36.0f * 0.6f), 0);
                        GL11.glScalef(0.6f, 0.6f, 1);
                        drawTexturedModalRect(0, 0, 0, 37, 256, 14);
                    }
                    GL11.glPopMatrix();
                    GL11.glColor4ub(driveColor[0], driveColor[1], driveColor[2], (byte) 255);
                    
                    for (int i = 0; i < DRIVE.getMessages().size(); i++) {
                        GL11.glPushMatrix();
                        {
                            int width = event.getResolution().getScaledWidth();
                            int sHeight = event.getResolution().getScaledHeight();

                            String message = DRIVE.getMessages().get(i).toString();
                        	GL11.glTranslatef(2 * 0.8f+50, sHeight/3+mc.fontRenderer.FONT_HEIGHT * 0.8f * i +21, 0);
                            GL11.glTranslatef(-35, 0, 0);
                            GL11.glScalef(0.8f, 0.8f, 1);
                            drawString(mc.fontRenderer, Utils.translateToLocalFormatted(message), 0, 0, 0xFFFFFF);

                        }

                        GL11.glPopMatrix();
                    }
                    GL11.glColor4ub((byte) 255, (byte) 255, (byte) 255, (byte) 255);
                }
                GL11.glPopMatrix();
                if (timeDriveLevelUp + levelSeconds <= (int) Minecraft.getSystemTime() / 1000) 
                	showDriveLevelUp = false;
            }
        }
    }
}
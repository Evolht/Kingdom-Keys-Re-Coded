package uk.co.wehavecookies56.kk.client.gui;

import java.awt.Dimension;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import uk.co.wehavecookies56.kk.common.lib.Reference;

/**
 * Created by Toby on 29/04/2017.
 */
public class GuiNodeButton extends GuiButton {

    ResourceLocation texture = new ResourceLocation(Reference.MODID, "textures/gui/org/org_unlock.png");

    UnlockNode node;
    GuiOrgUnlock parent;

    public GuiNodeButton(int buttonId, UnlockNode node, GuiOrgUnlock parent) {
        super(buttonId, 0, 0, "NODE");
        width = 26;
        height = 26;
        this.node = node;
        this.parent = parent;
    }

    public UnlockNode getNode() {
        return node;
    }

    public void setNode(UnlockNode node) {
        this.node = node;
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
        if (visible) {
            Minecraft.getMinecraft().renderEngine.bindTexture(texture);
            drawTexturedModalRect(x - (width / 2) + parent.dispX, y - (height / 2) + parent.dispY, 0, 202, width, height);
            GlStateManager.pushMatrix();
            GlStateManager.translate(x - (width / 2) + parent.dispX, y - (height / 2) + parent.dispY, 0);
            GlStateManager.scale(1.5F, 1.5F, 0);
            Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(node.getUnlock()), 0, 0);
            GlStateManager.popMatrix();
        }
        Dimension d = parent.convertToGUICoords(node);
        x = (int)d.getWidth();
        y = (int)d.getHeight();
    }

    @Override
    public boolean mousePressed(Minecraft mc, int mouseX, int mouseY) {
        if (mouseX >= x - (width / 2) + parent.dispX && mouseX <= x + width - (width / 2) + parent.dispX && mouseY >= y - (height / 2) + parent.dispY && mouseY <= y + height - (height / 2) + parent.dispY) {
            Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
            parent.selected = node;
        }
        parent.updateButtons();
        return super.mousePressed(mc, mouseX, mouseY);
    }

}

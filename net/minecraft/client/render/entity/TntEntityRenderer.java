/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.render.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.TntEntity;
import org.lwjgl.opengl.GL11;

@Environment(value=EnvType.CLIENT)
public class TntEntityRenderer
extends EntityRenderer {
    private BlockRenderManager blockRenderManager = new BlockRenderManager();

    public TntEntityRenderer() {
        this.shadowRadius = 0.5f;
    }

    public void render(TntEntity tntEntity, double d, double e, double f, float g, float h) {
        float f2;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)e, (float)f);
        if ((float)tntEntity.fuse - h + 1.0f < 10.0f) {
            f2 = 1.0f - ((float)tntEntity.fuse - h + 1.0f) / 10.0f;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            f2 *= f2;
            f2 *= f2;
            float f3 = 1.0f + f2 * 0.3f;
            GL11.glScalef(f3, f3, f3);
        }
        f2 = (1.0f - ((float)tntEntity.fuse - h + 1.0f) / 100.0f) * 0.8f;
        this.bindTexture("/terrain.png");
        this.blockRenderManager.render(Block.TNT, 0, tntEntity.getBrightnessAtEyes(h));
        if (tntEntity.fuse / 5 % 2 == 0) {
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 772);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, f2);
            this.blockRenderManager.render(Block.TNT, 0, 1.0f);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glEnable(3553);
        }
        GL11.glPopMatrix();
    }
}


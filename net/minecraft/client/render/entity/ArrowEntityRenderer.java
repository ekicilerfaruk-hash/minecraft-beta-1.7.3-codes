/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.render.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

@Environment(value=EnvType.CLIENT)
public class ArrowEntityRenderer
extends EntityRenderer {
    public void render(ArrowEntity arrowEntity, double d, double e, double f, float g, float h) {
        if (arrowEntity.prevYaw == 0.0f && arrowEntity.prevPitch == 0.0f) {
            return;
        }
        this.bindTexture("/item/arrows.png");
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)e, (float)f);
        GL11.glRotatef(arrowEntity.prevYaw + (arrowEntity.yaw - arrowEntity.prevYaw) * h - 90.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(arrowEntity.prevPitch + (arrowEntity.pitch - arrowEntity.prevPitch) * h, 0.0f, 0.0f, 1.0f);
        Tessellator tessellator = Tessellator.INSTANCE;
        int n = 0;
        float f2 = 0.0f;
        float f3 = 0.5f;
        float f4 = (float)(0 + n * 10) / 32.0f;
        float f5 = (float)(5 + n * 10) / 32.0f;
        float f6 = 0.0f;
        float f7 = 0.15625f;
        float f8 = (float)(5 + n * 10) / 32.0f;
        float f9 = (float)(10 + n * 10) / 32.0f;
        float f10 = 0.05625f;
        GL11.glEnable(32826);
        float f11 = (float)arrowEntity.shake - h;
        if (f11 > 0.0f) {
            float f12 = -MathHelper.sin(f11 * 3.0f) * f11;
            GL11.glRotatef(f12, 0.0f, 0.0f, 1.0f);
        }
        GL11.glRotatef(45.0f, 1.0f, 0.0f, 0.0f);
        GL11.glScalef(f10, f10, f10);
        GL11.glTranslatef(-4.0f, 0.0f, 0.0f);
        GL11.glNormal3f(f10, 0.0f, 0.0f);
        tessellator.startQuads();
        tessellator.vertex(-7.0, -2.0, -2.0, f6, f8);
        tessellator.vertex(-7.0, -2.0, 2.0, f7, f8);
        tessellator.vertex(-7.0, 2.0, 2.0, f7, f9);
        tessellator.vertex(-7.0, 2.0, -2.0, f6, f9);
        tessellator.draw();
        GL11.glNormal3f(-f10, 0.0f, 0.0f);
        tessellator.startQuads();
        tessellator.vertex(-7.0, 2.0, -2.0, f6, f8);
        tessellator.vertex(-7.0, 2.0, 2.0, f7, f8);
        tessellator.vertex(-7.0, -2.0, 2.0, f7, f9);
        tessellator.vertex(-7.0, -2.0, -2.0, f6, f9);
        tessellator.draw();
        for (int i = 0; i < 4; ++i) {
            GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glNormal3f(0.0f, 0.0f, f10);
            tessellator.startQuads();
            tessellator.vertex(-8.0, -2.0, 0.0, f2, f4);
            tessellator.vertex(8.0, -2.0, 0.0, f3, f4);
            tessellator.vertex(8.0, 2.0, 0.0, f3, f5);
            tessellator.vertex(-8.0, 2.0, 0.0, f2, f5);
            tessellator.draw();
        }
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }
}


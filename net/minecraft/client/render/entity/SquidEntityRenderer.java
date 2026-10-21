/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.render.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.passive.SquidEntity;
import org.lwjgl.opengl.GL11;

@Environment(value=EnvType.CLIENT)
public class SquidEntityRenderer
extends LivingEntityRenderer {
    public SquidEntityRenderer(EntityModel entityModel, float f) {
        super(entityModel, f);
    }

    public void render(SquidEntity squidEntity, double d, double e, double f, float g, float h) {
        super.render(squidEntity, d, e, f, g, h);
    }

    protected void applyHandSwingRotation(SquidEntity squidEntity, float f, float g, float h) {
        float f2 = squidEntity.lastTiltAngle + (squidEntity.tiltAngle - squidEntity.lastTiltAngle) * h;
        float f3 = squidEntity.lastRollAngle + (squidEntity.rollAngle - squidEntity.lastRollAngle) * h;
        GL11.glTranslatef(0.0f, 0.5f, 0.0f);
        GL11.glRotatef(180.0f - g, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(f2, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(f3, 0.0f, 1.0f, 0.0f);
        GL11.glTranslatef(0.0f, -1.2f, 0.0f);
    }

    protected void applyScale(SquidEntity squidEntity, float f) {
    }

    protected float getHeadBob(SquidEntity squidEntity, float f) {
        float f2 = squidEntity.lastTentacleAngle + (squidEntity.tentacleAngle - squidEntity.lastTentacleAngle) * f;
        return f2;
    }
}


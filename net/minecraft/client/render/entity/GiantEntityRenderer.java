/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.render.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.mob.GiantEntity;
import org.lwjgl.opengl.GL11;

@Environment(value=EnvType.CLIENT)
public class GiantEntityRenderer
extends LivingEntityRenderer {
    private float scale;

    public GiantEntityRenderer(EntityModel model, float shadowSize, float scale) {
        super(model, shadowSize * scale);
        this.scale = scale;
    }

    protected void applyScale(GiantEntity giantEntity, float f) {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
}


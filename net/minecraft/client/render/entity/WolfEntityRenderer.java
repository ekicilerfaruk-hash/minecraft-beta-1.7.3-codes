/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.render.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.passive.WolfEntity;

@Environment(value=EnvType.CLIENT)
public class WolfEntityRenderer
extends LivingEntityRenderer {
    public WolfEntityRenderer(EntityModel entityModel, float f) {
        super(entityModel, f);
    }

    public void render(WolfEntity wolfEntity, double d, double e, double f, float g, float h) {
        super.render(wolfEntity, d, e, f, g, h);
    }

    protected float getHeadBob(WolfEntity wolfEntity, float f) {
        return wolfEntity.getTailAngle();
    }

    protected void applyScale(WolfEntity wolfEntity, float f) {
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.render.entity.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;

@Environment(value=EnvType.CLIENT)
public abstract class EntityModel {
    public float handSwingProgress;
    public boolean riding = false;

    public void render(float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch, float scale) {
    }

    public void setAngles(float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch, float scale) {
    }

    public void animateModel(LivingEntity entity, float limbAngle, float limbDistance, float tickDelta) {
    }
}


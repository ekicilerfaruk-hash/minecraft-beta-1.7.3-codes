/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.render.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.passive.CowEntity;

@Environment(value=EnvType.CLIENT)
public class CowEntityRenderer
extends LivingEntityRenderer {
    public CowEntityRenderer(EntityModel entityModel, float f) {
        super(entityModel, f);
    }

    public void render(CowEntity cowEntity, double d, double e, double f, float g, float h) {
        super.render(cowEntity, d, e, f, g, h);
    }
}


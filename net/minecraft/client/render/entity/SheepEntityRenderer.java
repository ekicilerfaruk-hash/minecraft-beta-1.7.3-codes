/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.render.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.passive.SheepEntity;
import org.lwjgl.opengl.GL11;

@Environment(value=EnvType.CLIENT)
public class SheepEntityRenderer
extends LivingEntityRenderer {
    public SheepEntityRenderer(EntityModel model, EntityModel furModel, float shadowRadius) {
        super(model, shadowRadius);
        this.setDecorationModel(furModel);
    }

    protected boolean bindTexture(SheepEntity sheepEntity, int i, float f) {
        if (i == 0 && !sheepEntity.isSheared()) {
            this.bindTexture("/mob/sheep_fur.png");
            float f2 = sheepEntity.getBrightnessAtEyes(f);
            int n = sheepEntity.getColor();
            GL11.glColor3f(f2 * SheepEntity.COLORS[n][0], f2 * SheepEntity.COLORS[n][1], f2 * SheepEntity.COLORS[n][2]);
            return true;
        }
        return false;
    }
}


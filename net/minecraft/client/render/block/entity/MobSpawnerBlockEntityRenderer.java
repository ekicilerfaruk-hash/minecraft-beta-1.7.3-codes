/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.render.block.entity;

import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.entity.MobSpawnerBlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityRegistry;
import org.lwjgl.opengl.GL11;

@Environment(value=EnvType.CLIENT)
public class MobSpawnerBlockEntityRenderer
extends BlockEntityRenderer {
    /**
     * Map of String, Entity
     */
    private Map models = new HashMap();

    public void render(MobSpawnerBlockEntity mobSpawnerBlockEntity, double d, double e, double f, float g) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d + 0.5f, (float)e, (float)f + 0.5f);
        Entity entity = (Entity)this.models.get(mobSpawnerBlockEntity.getSpawnedEntityId());
        if (entity == null) {
            entity = EntityRegistry.create(mobSpawnerBlockEntity.getSpawnedEntityId(), null);
            this.models.put(mobSpawnerBlockEntity.getSpawnedEntityId(), entity);
        }
        if (entity != null) {
            entity.setWorld(mobSpawnerBlockEntity.world);
            float f2 = 0.4375f;
            GL11.glTranslatef(0.0f, 0.4f, 0.0f);
            GL11.glRotatef((float)(mobSpawnerBlockEntity.lastRotation + (mobSpawnerBlockEntity.rotation - mobSpawnerBlockEntity.lastRotation) * (double)g) * 10.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-30.0f, 1.0f, 0.0f, 0.0f);
            GL11.glTranslatef(0.0f, -0.4f, 0.0f);
            GL11.glScalef(f2, f2, f2);
            entity.setPositionAndAnglesKeepPrevAngles(d, e, f, 0.0f, 0.0f);
            EntityRenderDispatcher.INSTANCE.render(entity, 0.0, 0.0, 0.0, 0.0f, g);
        }
        GL11.glPopMatrix();
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.world.biome;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.EntitySpawnGroup;

public class SkyBiome
extends Biome {
    public SkyBiome() {
        this.spawnableMonsters.clear();
        this.spawnablePassive.clear();
        this.spawnableWaterCreatures.clear();
        this.spawnablePassive.add(new EntitySpawnGroup(ChickenEntity.class, 10));
    }

    @Environment(value=EnvType.CLIENT)
    public int getSkyColor(float temperature) {
        return 0xC0C0FF;
    }
}


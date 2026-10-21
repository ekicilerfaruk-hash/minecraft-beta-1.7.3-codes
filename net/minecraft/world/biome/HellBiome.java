/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.world.biome;

import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.entity.mob.PigZombieEntity;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.EntitySpawnGroup;

public class HellBiome
extends Biome {
    public HellBiome() {
        this.spawnableMonsters.clear();
        this.spawnablePassive.clear();
        this.spawnableWaterCreatures.clear();
        this.spawnableMonsters.add(new EntitySpawnGroup(GhastEntity.class, 10));
        this.spawnableMonsters.add(new EntitySpawnGroup(PigZombieEntity.class, 10));
    }
}


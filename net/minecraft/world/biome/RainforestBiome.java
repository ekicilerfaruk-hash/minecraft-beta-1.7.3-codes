/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.LargeOakTreeFeature;
import net.minecraft.world.gen.feature.OakTreeFeature;

public class RainforestBiome
extends Biome {
    public Feature getRandomTreeFeature(Random random) {
        if (random.nextInt(3) == 0) {
            return new LargeOakTreeFeature();
        }
        return new OakTreeFeature();
    }
}


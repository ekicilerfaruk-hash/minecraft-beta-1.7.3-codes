/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.world;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.material.Material;
import net.minecraft.world.biome.source.BiomeSource;

public interface BlockView {
    public int getBlockId(int var1, int var2, int var3);

    public BlockEntity getBlockEntity(int var1, int var2, int var3);

    @Environment(value=EnvType.CLIENT)
    public float getNaturalBrightness(int var1, int var2, int var3, int var4);

    /**
     * getLuminance
     */
    @Environment(value=EnvType.CLIENT)
    public float method_1782(int var1, int var2, int var3);

    public int getBlockMeta(int var1, int var2, int var3);

    public Material getMaterial(int var1, int var2, int var3);

    /**
     * isOpaque
     */
    @Environment(value=EnvType.CLIENT)
    public boolean method_1783(int var1, int var2, int var3);

    public boolean shouldSuffocate(int var1, int var2, int var3);

    /**
     * getBiomeSource
     */
    @Environment(value=EnvType.CLIENT)
    public BiomeSource method_1781();
}


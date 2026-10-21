/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.color.world;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class WaterColors {
    private static int[] colorMap = new int[65536];

    public static void setColorMap(int[] colorMap) {
        WaterColors.colorMap = colorMap;
    }
}


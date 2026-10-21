/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.Box;

@Environment(value=EnvType.CLIENT)
public interface Culler {
    public boolean isVisible(Box var1);

    public void prepare(double var1, double var3, double var5);
}


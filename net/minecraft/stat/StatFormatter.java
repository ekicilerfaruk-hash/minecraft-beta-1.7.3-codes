/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.stat;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

public interface StatFormatter {
    @Environment(value=EnvType.CLIENT)
    public String format(int var1);
}


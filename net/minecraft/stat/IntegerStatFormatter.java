/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.stat;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.stat.Stat;
import net.minecraft.stat.StatFormatter;

final class IntegerStatFormatter
implements StatFormatter {
    IntegerStatFormatter() {
    }

    @Environment(value=EnvType.CLIENT)
    public String format(int value) {
        return Stat.getNumberFormat().format(value);
    }
}


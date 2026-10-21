/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.isom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.isom.OS;

@Environment(value=EnvType.CLIENT)
class class_581 {
    static final /* synthetic */ int[] field_2517;

    static {
        field_2517 = new int[OS.values().length];
        try {
            class_581.field_2517[OS.LINUX.ordinal()] = 1;
        } catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class_581.field_2517[OS.SOLARIS.ordinal()] = 2;
        } catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class_581.field_2517[OS.WINDOWS.ordinal()] = 3;
        } catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class_581.field_2517[OS.MACOS.ordinal()] = 4;
        } catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}


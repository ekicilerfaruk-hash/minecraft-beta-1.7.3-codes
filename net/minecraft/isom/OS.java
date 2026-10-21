/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.isom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
enum OS {
    LINUX,
    SOLARIS,
    WINDOWS,
    MACOS,
    UNKNOWN;

}


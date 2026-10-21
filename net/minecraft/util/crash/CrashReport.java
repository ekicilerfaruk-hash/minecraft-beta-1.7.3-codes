/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.util.crash;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class CrashReport {
    public final String description;
    public final Throwable exception;

    public CrashReport(String description, Throwable exception) {
        this.description = description;
        this.exception = exception;
    }
}


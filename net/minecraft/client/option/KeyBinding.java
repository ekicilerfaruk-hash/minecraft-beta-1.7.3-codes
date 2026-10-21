/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.option;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class KeyBinding {
    public String translationKey;
    public int code;

    public KeyBinding(String translationKey, int code) {
        this.translationKey = translationKey;
        this.code = code;
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.sound.BlockSoundGroup;

final class GlassSoundGroup
extends BlockSoundGroup {
    GlassSoundGroup(String string, float f, float g) {
        super(string, f, g);
    }

    @Environment(value=EnvType.CLIENT)
    public String getBreakSound() {
        return "random.glass";
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.sound;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

public class BlockSoundGroup {
    public final String soundName;
    public final float volume;
    public final float pitch;

    public BlockSoundGroup(String soundName, float volume, float pitch) {
        this.soundName = soundName;
        this.volume = volume;
        this.pitch = pitch;
    }

    public float getVolume() {
        return this.volume;
    }

    public float getPitch() {
        return this.pitch;
    }

    @Environment(value=EnvType.CLIENT)
    public String getBreakSound() {
        return "step." + this.soundName;
    }

    public String getSound() {
        return "step." + this.soundName;
    }
}


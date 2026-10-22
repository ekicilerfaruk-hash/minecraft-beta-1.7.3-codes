/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.sound;

import java.net.URL;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class Sound {
    public String id;
    public URL soundFile;

    public Sound(String id, URL soundFile) {
        this.id = id;
        this.soundFile = soundFile;
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.resource.pack;

import java.io.InputStream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;

@Environment(value=EnvType.CLIENT)
public abstract class TexturePack {
    public String name;
    public String descriptionLine1;
    public String descriptionLine2;
    public String key;

    public void open() {
    }

    public void close() {
    }

    public void load(Minecraft minecraft) {
    }

    public void unload(Minecraft minecraft) {
    }

    public void bindIcon(Minecraft minecraft) {
    }

    public InputStream getResource(String path) {
        return TexturePack.class.getResourceAsStream(path);
    }
}


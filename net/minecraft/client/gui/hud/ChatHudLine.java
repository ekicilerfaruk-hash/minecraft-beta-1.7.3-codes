/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.gui.hud;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class ChatHudLine {
    public String text;
    public int age;

    public ChatHudLine(String text) {
        this.text = text;
        this.age = 0;
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.util;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.option.GameOptions;

@Environment(value=EnvType.CLIENT)
public class ScreenScaler {
    private int scaledWidth;
    private int scaledHeight;
    /**
     * scaledWidth before rounding to whole numbers
     */
    public double rawScaledWidth;
    /**
     * scaledHeight before rounding to whole numbers
     */
    public double rawScaledHeight;
    public int scaleFactor;

    public ScreenScaler(GameOptions options, int framebufferWidth, int framebufferHeight) {
        this.scaledWidth = framebufferWidth;
        this.scaledHeight = framebufferHeight;
        this.scaleFactor = 1;
        int n = options.guiScale;
        if (n == 0) {
            n = 1000;
        }
        while (this.scaleFactor < n && this.scaledWidth / (this.scaleFactor + 1) >= 320 && this.scaledHeight / (this.scaleFactor + 1) >= 240) {
            ++this.scaleFactor;
        }
        this.rawScaledWidth = (double)this.scaledWidth / (double)this.scaleFactor;
        this.rawScaledHeight = (double)this.scaledHeight / (double)this.scaleFactor;
        this.scaledWidth = (int)Math.ceil(this.rawScaledWidth);
        this.scaledHeight = (int)Math.ceil(this.rawScaledHeight);
    }

    public int getScaledWidth() {
        return this.scaledWidth;
    }

    public int getScaledHeight() {
        return this.scaledHeight;
    }
}


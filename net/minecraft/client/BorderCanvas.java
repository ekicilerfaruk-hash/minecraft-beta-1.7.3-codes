/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client;

import java.awt.Canvas;
import java.awt.Dimension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
class BorderCanvas
extends Canvas {
    public BorderCanvas(int size) {
        this.setPreferredSize(new Dimension(size, size));
        this.setMinimumSize(new Dimension(size, size));
    }
}


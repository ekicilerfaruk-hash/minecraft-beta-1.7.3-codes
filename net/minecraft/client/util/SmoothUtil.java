/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.util;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class SmoothUtil {
    private float actualSum;
    private float smoothSum;
    private float movementLatency;

    public float smooth(float original, float smoother) {
        this.actualSum += original;
        original = (this.actualSum - this.smoothSum) * smoother;
        this.movementLatency += (original - this.movementLatency) * 0.5f;
        if (original > 0.0f && original > this.movementLatency || original < 0.0f && original < this.movementLatency) {
            original = this.movementLatency;
        }
        this.smoothSum += original;
        return original;
    }
}


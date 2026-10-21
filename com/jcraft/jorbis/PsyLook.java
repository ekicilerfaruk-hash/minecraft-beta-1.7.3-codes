/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package com.jcraft.jorbis;

import com.jcraft.jorbis.PsyInfo;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
class PsyLook {
    int n;
    PsyInfo vi;
    float[][][] tonecurves;
    float[][] peakatt;
    float[][][] noisecurves;
    float[] ath;
    int[] octave;

    PsyLook() {
    }

    void init(PsyInfo psyInfo, int i, int j) {
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.NbtElement;
import net.modificationstation.stationapi.api.nbt.StationNbtEnd;

/**
 * <p>Interface {@link net.modificationstation.stationapi.api.nbt.StationNbtEnd} injected by mod station-nbt-v0</p>
 */
public class NbtEnd
extends NbtElement
implements StationNbtEnd {
    void read(DataInput input) {
    }

    void write(DataOutput output) {
    }

    public byte getType() {
        return 0;
    }

    public String toString() {
        return "END";
    }
}


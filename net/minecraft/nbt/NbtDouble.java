/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.NbtElement;
import net.modificationstation.stationapi.api.nbt.StationNbtDouble;

/**
 * <p>Interface {@link net.modificationstation.stationapi.api.nbt.StationNbtDouble} injected by mod station-nbt-v0</p>
 */
public class NbtDouble
extends NbtElement
implements StationNbtDouble {
    public double value;

    public NbtDouble() {
    }

    public NbtDouble(double value) {
        this.value = value;
    }

    void write(DataOutput output) {
        output.writeDouble(this.value);
    }

    void read(DataInput input) {
        this.value = input.readDouble();
    }

    public byte getType() {
        return 6;
    }

    public String toString() {
        return "" + this.value;
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.NbtElement;
import net.modificationstation.stationapi.api.nbt.StationNbtFloat;

/**
 * <p>Interface {@link net.modificationstation.stationapi.api.nbt.StationNbtFloat} injected by mod station-nbt-v0</p>
 */
public class NbtFloat
extends NbtElement
implements StationNbtFloat {
    public float value;

    public NbtFloat() {
    }

    public NbtFloat(float value) {
        this.value = value;
    }

    void write(DataOutput output) {
        output.writeFloat(this.value);
    }

    void read(DataInput input) {
        this.value = input.readFloat();
    }

    public byte getType() {
        return 5;
    }

    public String toString() {
        return "" + this.value;
    }
}


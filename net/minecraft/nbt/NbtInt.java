/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.NbtElement;
import net.modificationstation.stationapi.api.nbt.StationNbtInt;

/**
 * <p>Interface {@link net.modificationstation.stationapi.api.nbt.StationNbtInt} injected by mod station-nbt-v0</p>
 */
public class NbtInt
extends NbtElement
implements StationNbtInt {
    public int value;

    public NbtInt() {
    }

    public NbtInt(int value) {
        this.value = value;
    }

    void write(DataOutput output) {
        output.writeInt(this.value);
    }

    void read(DataInput input) {
        this.value = input.readInt();
    }

    public byte getType() {
        return 3;
    }

    public String toString() {
        return "" + this.value;
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.NbtElement;
import net.modificationstation.stationapi.api.nbt.StationNbtByteArray;

/**
 * <p>Interface {@link net.modificationstation.stationapi.api.nbt.StationNbtByteArray} injected by mod station-nbt-v0</p>
 */
public class NbtByteArray
extends NbtElement
implements StationNbtByteArray {
    public byte[] value;

    public NbtByteArray() {
    }

    public NbtByteArray(byte[] value) {
        this.value = value;
    }

    void write(DataOutput output) {
        output.writeInt(this.value.length);
        output.write(this.value);
    }

    void read(DataInput input) {
        int n = input.readInt();
        this.value = new byte[n];
        input.readFully(this.value);
    }

    public byte getType() {
        return 7;
    }

    public String toString() {
        return "[" + this.value.length + " bytes]";
    }
}


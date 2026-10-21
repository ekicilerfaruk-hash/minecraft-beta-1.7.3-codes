/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.NbtElement;
import net.modificationstation.stationapi.api.nbt.StationNbtByte;

/**
 * <p>Interface {@link net.modificationstation.stationapi.api.nbt.StationNbtByte} injected by mod station-nbt-v0</p>
 */
public class NbtByte
extends NbtElement
implements StationNbtByte {
    public byte value;

    public NbtByte() {
    }

    public NbtByte(byte value) {
        this.value = value;
    }

    void write(DataOutput output) {
        output.writeByte(this.value);
    }

    void read(DataInput input) {
        this.value = input.readByte();
    }

    public byte getType() {
        return 1;
    }

    public String toString() {
        return "" + this.value;
    }
}


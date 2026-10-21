/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.NbtElement;
import net.modificationstation.stationapi.api.nbt.StationNbtShort;

/**
 * <p>Interface {@link net.modificationstation.stationapi.api.nbt.StationNbtShort} injected by mod station-nbt-v0</p>
 */
public class NbtShort
extends NbtElement
implements StationNbtShort {
    public short value;

    public NbtShort() {
    }

    public NbtShort(short value) {
        this.value = value;
    }

    void write(DataOutput output) {
        output.writeShort(this.value);
    }

    void read(DataInput input) {
        this.value = input.readShort();
    }

    public byte getType() {
        return 2;
    }

    public String toString() {
        return "" + this.value;
    }
}


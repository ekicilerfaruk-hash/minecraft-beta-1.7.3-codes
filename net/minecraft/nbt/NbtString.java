/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.NbtElement;
import net.modificationstation.stationapi.api.nbt.StationNbtString;

/**
 * <p>Interface {@link net.modificationstation.stationapi.api.nbt.StationNbtString} injected by mod station-nbt-v0</p>
 */
public class NbtString
extends NbtElement
implements StationNbtString {
    public String value;

    public NbtString() {
    }

    public NbtString(String value) {
        this.value = value;
        if (value == null) {
            throw new IllegalArgumentException("Empty string not allowed");
        }
    }

    void write(DataOutput output) {
        output.writeUTF(this.value);
    }

    void read(DataInput input) {
        this.value = input.readUTF();
    }

    public byte getType() {
        return 8;
    }

    public String toString() {
        return "" + this.value;
    }
}


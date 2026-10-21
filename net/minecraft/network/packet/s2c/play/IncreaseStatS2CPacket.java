/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.network.packet.s2c.play;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.NetworkHandler;
import net.minecraft.network.packet.Packet;

public class IncreaseStatS2CPacket
extends Packet {
    public int statId;
    public int amount;

    public IncreaseStatS2CPacket() {
    }

    @Environment(value=EnvType.SERVER)
    public IncreaseStatS2CPacket(int statId, int amount) {
        this.statId = statId;
        this.amount = amount;
    }

    public void apply(NetworkHandler networkHandler) {
        networkHandler.onIncreaseStat(this);
    }

    public void read(DataInputStream stream) {
        this.statId = stream.readInt();
        this.amount = stream.readByte();
    }

    public void write(DataOutputStream stream) {
        stream.writeInt(this.statId);
        stream.writeByte(this.amount);
    }

    public int size() {
        return 6;
    }
}


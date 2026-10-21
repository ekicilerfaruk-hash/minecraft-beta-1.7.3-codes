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

public class OpenScreenS2CPacket
extends Packet {
    public int syncId;
    public int screenHandlerId;
    public String name;
    public int size;

    public OpenScreenS2CPacket() {
    }

    @Environment(value=EnvType.SERVER)
    public OpenScreenS2CPacket(int syncId, int screenHandlerId, String name, int size) {
        this.syncId = syncId;
        this.screenHandlerId = screenHandlerId;
        this.name = name;
        this.size = size;
    }

    public void apply(NetworkHandler networkHandler) {
        networkHandler.onOpenScreen(this);
    }

    public void read(DataInputStream stream) {
        this.syncId = stream.readByte();
        this.screenHandlerId = stream.readByte();
        this.name = stream.readUTF();
        this.size = stream.readByte();
    }

    public void write(DataOutputStream stream) {
        stream.writeByte(this.syncId);
        stream.writeByte(this.screenHandlerId);
        stream.writeUTF(this.name);
        stream.writeByte(this.size);
    }

    public int size() {
        return 3 + this.name.length();
    }
}


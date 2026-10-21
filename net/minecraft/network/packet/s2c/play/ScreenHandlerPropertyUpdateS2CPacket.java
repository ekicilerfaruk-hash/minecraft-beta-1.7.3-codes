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

public class ScreenHandlerPropertyUpdateS2CPacket
extends Packet {
    public int syncId;
    public int propertyId;
    public int value;

    public ScreenHandlerPropertyUpdateS2CPacket() {
    }

    @Environment(value=EnvType.SERVER)
    public ScreenHandlerPropertyUpdateS2CPacket(int syncId, int propertyId, int value) {
        this.syncId = syncId;
        this.propertyId = propertyId;
        this.value = value;
    }

    public void apply(NetworkHandler networkHandler) {
        networkHandler.onScreenHandlerPropertyUpdate(this);
    }

    public void read(DataInputStream stream) {
        this.syncId = stream.readByte();
        this.propertyId = stream.readShort();
        this.value = stream.readShort();
    }

    public void write(DataOutputStream stream) {
        stream.writeByte(this.syncId);
        stream.writeShort(this.propertyId);
        stream.writeShort(this.value);
    }

    public int size() {
        return 5;
    }
}


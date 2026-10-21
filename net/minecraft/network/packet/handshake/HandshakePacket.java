/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.network.packet.handshake;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import net.minecraft.network.NetworkHandler;
import net.minecraft.network.packet.Packet;

public class HandshakePacket
extends Packet {
    /**
     * In a C2S context this is the username while in an S2C context this is the connection hash.
     */
    public String name;

    public HandshakePacket() {
    }

    public HandshakePacket(String name) {
        this.name = name;
    }

    public void read(DataInputStream stream) {
        this.name = HandshakePacket.readString(stream, 32);
    }

    public void write(DataOutputStream stream) {
        HandshakePacket.writeString(this.name, stream);
    }

    public void apply(NetworkHandler networkHandler) {
        networkHandler.onHandshake(this);
    }

    public int size() {
        return 4 + this.name.length() + 4;
    }
}


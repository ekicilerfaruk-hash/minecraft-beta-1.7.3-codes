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

public class ChunkStatusUpdateS2CPacket
extends Packet {
    public int x;
    public int z;
    public boolean load;

    public ChunkStatusUpdateS2CPacket() {
        this.worldPacket = false;
    }

    @Environment(value=EnvType.SERVER)
    public ChunkStatusUpdateS2CPacket(int x, int z, boolean load) {
        this.worldPacket = false;
        this.x = x;
        this.z = z;
        this.load = load;
    }

    public void read(DataInputStream stream) {
        this.x = stream.readInt();
        this.z = stream.readInt();
        this.load = stream.read() != 0;
    }

    public void write(DataOutputStream stream) {
        stream.writeInt(this.x);
        stream.writeInt(this.z);
        stream.write(this.load ? 1 : 0);
    }

    public void apply(NetworkHandler networkHandler) {
        networkHandler.onChunkStatusUpdate(this);
    }

    public int size() {
        return 9;
    }
}


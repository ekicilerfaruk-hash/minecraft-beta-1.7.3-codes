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

public class HealthUpdateS2CPacket
extends Packet {
    public int health;

    public HealthUpdateS2CPacket() {
    }

    @Environment(value=EnvType.SERVER)
    public HealthUpdateS2CPacket(int health) {
        this.health = health;
    }

    public void read(DataInputStream stream) {
        this.health = stream.readShort();
    }

    public void write(DataOutputStream stream) {
        stream.writeShort(this.health);
    }

    public void apply(NetworkHandler networkHandler) {
        networkHandler.onHealthUpdate(this);
    }

    public int size() {
        return 2;
    }
}


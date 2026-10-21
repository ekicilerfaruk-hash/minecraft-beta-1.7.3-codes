/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.network.packet;

import net.minecraft.network.packet.SubPacketTracker;

class PacketTracker {
    private int count;
    private long size;

    private PacketTracker() {
    }

    public void update(int size) {
        ++this.count;
        this.size += (long)size;
    }

    /* synthetic */ PacketTracker(SubPacketTracker subPacketTracker) {
        this();
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package com.jcraft.jogg;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class Packet {
    public byte[] packet_base;
    public int packet;
    public int bytes;
    public int b_o_s;
    public int e_o_s;
    public long granulepos;
    public long packetno;
}


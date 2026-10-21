/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.Vec3d;

@Environment(value=EnvType.CLIENT)
public class Vertex {
    public Vec3d pos;
    public float u;
    public float v;

    public Vertex(float x, float y, float z, float u, float v) {
        this(Vec3d.create(x, y, z), u, v);
    }

    public Vertex remap(float u, float v) {
        return new Vertex(this, u, v);
    }

    public Vertex(Vertex vertex, float u, float v) {
        this.pos = vertex.pos;
        this.u = u;
        this.v = v;
    }

    public Vertex(Vec3d pos, float u, float v) {
        this.pos = pos;
        this.u = u;
        this.v = v;
    }
}


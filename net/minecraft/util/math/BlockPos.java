/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.util.math;

import net.modificationstation.stationapi.api.util.math.StationBlockPos;

/**
 * <p>Interface {@link net.modificationstation.stationapi.api.util.math.StationBlockPos} injected by mod station-maths-v0</p>
 */
public class BlockPos
implements StationBlockPos {
    public final int x;
    public final int y;
    public final int z;

    public BlockPos(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean equals(Object o) {
        if (o instanceof BlockPos) {
            BlockPos blockPos = (BlockPos)o;
            return blockPos.x == this.x && blockPos.y == this.y && blockPos.z == this.z;
        }
        return false;
    }

    public int hashCode() {
        return this.x * 8976890 + this.y * 981131 + this.z;
    }
}


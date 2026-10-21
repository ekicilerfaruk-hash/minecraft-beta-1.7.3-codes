/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SandstoneBlock
extends Block {
    public SandstoneBlock(int id) {
        super(id, 192, Material.STONE);
    }

    public int getTexture(int side) {
        if (side == 1) {
            return this.textureId - 16;
        }
        if (side == 0) {
            return this.textureId + 16;
        }
        return this.textureId;
    }
}


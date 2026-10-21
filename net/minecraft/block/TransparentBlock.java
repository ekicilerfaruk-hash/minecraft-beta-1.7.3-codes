/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.BlockView;

public class TransparentBlock
extends Block {
    protected boolean renderSides;

    public TransparentBlock(int id, int textureId, Material material, boolean renderSides) {
        super(id, textureId, material);
        this.renderSides = renderSides;
    }

    public boolean isOpaque() {
        return false;
    }

    @Environment(value=EnvType.CLIENT)
    public boolean isSideVisible(BlockView blockView, int x, int y, int z, int side) {
        int n = blockView.getBlockId(x, y, z);
        if (!this.renderSides && n == this.id) {
            return false;
        }
        return super.isSideVisible(blockView, x, y, z, side);
    }
}


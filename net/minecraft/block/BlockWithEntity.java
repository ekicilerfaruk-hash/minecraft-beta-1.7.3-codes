/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public abstract class BlockWithEntity
extends Block {
    protected BlockWithEntity(int i, Material material) {
        super(i, material);
        BlockWithEntity.BLOCKS_WITH_ENTITY[i] = true;
    }

    protected BlockWithEntity(int i, int j, Material material) {
        super(i, j, material);
        BlockWithEntity.BLOCKS_WITH_ENTITY[i] = true;
    }

    public void onPlaced(World world, int x, int y, int z) {
        super.onPlaced(world, x, y, z);
        world.setBlockEntity(x, y, z, this.createBlockEntity());
    }

    public void onBreak(World world, int x, int y, int z) {
        super.onBreak(world, x, y, z);
        world.removeBlockEntity(x, y, z);
    }

    protected abstract BlockEntity createBlockEntity();
}


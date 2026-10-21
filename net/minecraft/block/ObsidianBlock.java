/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.StoneBlock;

public class ObsidianBlock
extends StoneBlock {
    public ObsidianBlock(int i, int j) {
        super(i, j);
    }

    public int getDroppedItemCount(Random random) {
        return 1;
    }

    public int getDroppedItemId(int blockMeta, Random random) {
        return Block.OBSIDIAN.id;
    }
}


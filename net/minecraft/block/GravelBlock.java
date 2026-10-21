/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.SandBlock;
import net.minecraft.item.Item;

public class GravelBlock
extends SandBlock {
    public GravelBlock(int i, int j) {
        super(i, j);
    }

    public int getDroppedItemId(int blockMeta, Random random) {
        if (random.nextInt(10) == 0) {
            return Item.FLINT.id;
        }
        return this.id;
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.item;

import net.minecraft.item.BlockItem;

public class PistonBlockItem
extends BlockItem {
    public PistonBlockItem(int i) {
        super(i);
    }

    public int getPlacementMetadata(int meta) {
        return 7;
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.item;

import net.minecraft.item.FoodItem;

public class StackableFoodItem
extends FoodItem {
    public StackableFoodItem(int id, int healthRestored, boolean meat, int maxCount) {
        super(id, healthRestored, meat);
        this.maxCount = maxCount;
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.recipe;

import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;

public interface CraftingRecipe {
    public boolean matches(CraftingInventory var1);

    public ItemStack craft(CraftingInventory var1);

    public int getSize();

    public ItemStack getOutput();
}


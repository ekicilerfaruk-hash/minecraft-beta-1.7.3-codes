/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public interface Inventory {
    public int size();

    public ItemStack getStack(int var1);

    public ItemStack removeStack(int var1, int var2);

    public void setStack(int var1, ItemStack var2);

    public String getName();

    public int getMaxCountPerStack();

    public void markDirty();

    public boolean canPlayerUse(PlayerEntity var1);
}


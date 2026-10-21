/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.inventory;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.inventory.SimpleInventory;

@Environment(value=EnvType.CLIENT)
public interface InventoryListener {
    public void onInventoryChanged(SimpleInventory var1);
}


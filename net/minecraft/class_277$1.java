/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft;

import net.minecraft.block.Block;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;

class class_277$1
extends Slot {
    final /* synthetic */ int field_1127;
    final /* synthetic */ PlayerScreenHandler field_1128;

    class_277$1(PlayerScreenHandler playerScreenHandler, Inventory inventory, int i, int j, int k, int l) {
        this.field_1128 = playerScreenHandler;
        this.field_1127 = l;
        super(inventory, i, j, k);
    }

    public int getMaxItemCount() {
        return 1;
    }

    public boolean canInsert(ItemStack stack) {
        if (stack.getItem() instanceof ArmorItem) {
            return ((ArmorItem)stack.getItem()).equipmentSlot == this.field_1127;
        }
        if (stack.getItem().id == Block.PUMPKIN.id) {
            return this.field_1127 == 0;
        }
        return false;
    }
}


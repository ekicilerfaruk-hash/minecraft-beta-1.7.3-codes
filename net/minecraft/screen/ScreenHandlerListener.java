/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.screen;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;

public interface ScreenHandlerListener {
    /**
     * Update contents of all slots, in a list of itemStacks the size of the screenHandler's inventory.
     */
    @Environment(value=EnvType.SERVER)
    public void onContentsUpdate(ScreenHandler var1, List var2);

    /**
     * Update a ScreenHandler's slot with a different item stack
     */
    public void onSlotUpdate(ScreenHandler var1, int var2, ItemStack var3);

    /**
     * Passes integers from Server Screen Handler to Client Screen Handler so that animations can be visible, e.g. Smelting Progress, Fuel left for rendering
     * 
     * @param syncId is an arbitrary integer specific to this screenHandler, used as an identifier for a specific property. Set this to any int, as long as it is consistent. Normally starts at 0 going up
     * @param trackedValue is an integer that is synced to the client
     */
    public void onPropertyUpdate(ScreenHandler var1, int var2, int var3);
}


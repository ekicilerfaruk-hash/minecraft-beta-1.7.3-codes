/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.stat;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.stat.Stat;

public class ItemOrBlockStat
extends Stat {
    private final int itemOrBlockId;

    public ItemOrBlockStat(int statId, String translationKey, int itemIdOrBlockId) {
        super(statId, translationKey);
        this.itemOrBlockId = itemIdOrBlockId;
    }

    @Environment(value=EnvType.CLIENT)
    public int getItemOrBlockId() {
        return this.itemOrBlockId;
    }
}


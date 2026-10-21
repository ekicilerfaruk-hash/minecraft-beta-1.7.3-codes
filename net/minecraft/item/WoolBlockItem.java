/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.WoolBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeItem;
import net.minecraft.item.ItemStack;

public class WoolBlockItem
extends BlockItem {
    public WoolBlockItem(int i) {
        super(i);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Environment(value=EnvType.CLIENT)
    public int getTextureId(int damage) {
        return Block.WOOL.getTexture(2, WoolBlock.getBlockMeta(damage));
    }

    public int getPlacementMetadata(int meta) {
        return meta;
    }

    @Environment(value=EnvType.CLIENT)
    public String getTranslationKey(ItemStack stack) {
        return super.getTranslationKey() + "." + DyeItem.names[WoolBlock.getBlockMeta(stack.getDamage())];
    }
}


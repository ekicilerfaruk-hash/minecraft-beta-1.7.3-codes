/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.server.world;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.player.PlayerEntity;

@Environment(value=EnvType.SERVER)
public interface PlayerSaveHandler {
    public void savePlayerData(PlayerEntity var1);

    public void loadPlayerData(PlayerEntity var1);
}


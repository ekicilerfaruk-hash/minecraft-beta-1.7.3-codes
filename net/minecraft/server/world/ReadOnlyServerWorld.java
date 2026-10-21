/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.server.world;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.ServerWorld;
import net.minecraft.world.storage.WorldStorage;

@Environment(value=EnvType.SERVER)
public class ReadOnlyServerWorld
extends ServerWorld {
    public ReadOnlyServerWorld(MinecraftServer server, WorldStorage storage, String saveName, int dimension, long seed, ServerWorld delegate) {
        super(server, storage, saveName, dimension, seed);
        this.persistentStateManager = delegate.persistentStateManager;
    }
}


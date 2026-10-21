/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.EnvironmentInterface;
import net.fabricmc.api.EnvironmentInterfaces;
import net.minecraft.entity.SpawnableEntity;

@EnvironmentInterfaces(value={@EnvironmentInterface(value=EnvType.SERVER, itf=SpawnableEntity.class)})
public interface Monster
extends SpawnableEntity {
}


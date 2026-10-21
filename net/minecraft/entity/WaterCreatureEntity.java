/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.EnvironmentInterface;
import net.fabricmc.api.EnvironmentInterfaces;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnableEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;

@EnvironmentInterfaces(value={@EnvironmentInterface(value=EnvType.SERVER, itf=SpawnableEntity.class)})
public class WaterCreatureEntity
extends MobEntity
implements SpawnableEntity {
    public WaterCreatureEntity(World world) {
        super(world);
    }

    public boolean canBreatheInWater() {
        return true;
    }

    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
    }

    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
    }

    public boolean canSpawn() {
        return this.world.canSpawnEntity(this.boundingBox);
    }

    public int getMinAmbientSoundDelay() {
        return 120;
    }
}


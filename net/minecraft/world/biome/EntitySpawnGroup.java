/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.world.biome;

public class EntitySpawnGroup {
    /**
     * Class of the {@code Entity} assigned to this {@code EntitySpawnGroup}
     */
    public Class clazz;
    public int amount;

    public EntitySpawnGroup(Class clazz, int amount) {
        this.clazz = clazz;
        this.amount = amount;
    }
}


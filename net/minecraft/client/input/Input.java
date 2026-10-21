/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.input;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.player.PlayerEntity;

@Environment(value=EnvType.CLIENT)
public class Input {
    public float movementSideways = 0.0f;
    public float movementForward = 0.0f;
    public boolean unused = false;
    public boolean jumping = false;
    public boolean sneaking = false;

    public void update(PlayerEntity player) {
    }

    public void reset() {
    }

    public void updateKey(int key, boolean keyDown) {
    }
}


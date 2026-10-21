/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package argo.saj;

import argo.saj.ThingWithPosition;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class InvalidSyntaxException
extends Exception {
    private final int column;
    private final int row;

    InvalidSyntaxException(String string, ThingWithPosition thingWithPosition) {
        super("At line " + thingWithPosition.getRow() + ", column " + thingWithPosition.getColumn() + ":  " + string);
        this.column = thingWithPosition.getColumn();
        this.row = thingWithPosition.getRow();
    }

    InvalidSyntaxException(String string, Throwable throwable, ThingWithPosition thingWithPosition) {
        super("At line " + thingWithPosition.getRow() + ", column " + thingWithPosition.getColumn() + ":  " + string, throwable);
        this.column = thingWithPosition.getColumn();
        this.row = thingWithPosition.getRow();
    }
}


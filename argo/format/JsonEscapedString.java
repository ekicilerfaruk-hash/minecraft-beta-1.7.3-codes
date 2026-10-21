/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package argo.format;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class JsonEscapedString {
    private final String escapedString;

    JsonEscapedString(String string) {
        this.escapedString = string.replace("\\", "\\\\").replace("\"", "\\\"").replace("\b", "\\b").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }

    public String toString() {
        return this.escapedString;
    }
}


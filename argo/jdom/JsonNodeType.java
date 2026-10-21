/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package argo.jdom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public enum JsonNodeType {
    OBJECT,
    ARRAY,
    STRING,
    NUMBER,
    TRUE,
    FALSE,
    NULL;

}


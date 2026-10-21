/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package argo.format;

import argo.jdom.JsonRootNode;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface JsonFormatter {
    public String format(JsonRootNode var1);
}


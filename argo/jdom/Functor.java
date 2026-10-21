/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package argo.jdom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
interface Functor {
    public boolean matchesNode(Object var1);

    public Object applyTo(Object var1);

    public String shortForm();
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package argo.jdom;

import argo.jdom.ChainedFunctor;
import argo.jdom.Functor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class JsonNodeSelector {
    final Functor valueGetter;

    JsonNodeSelector(Functor functor) {
        this.valueGetter = functor;
    }

    public boolean matches(Object object) {
        return this.valueGetter.matchesNode(object);
    }

    public Object getValue(Object object) {
        return this.valueGetter.applyTo(object);
    }

    public JsonNodeSelector with(JsonNodeSelector jsonNodeSelector) {
        return new JsonNodeSelector(new ChainedFunctor(this, jsonNodeSelector));
    }

    String shortForm() {
        return this.valueGetter.shortForm();
    }

    public String toString() {
        return this.valueGetter.toString();
    }
}


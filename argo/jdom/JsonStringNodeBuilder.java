/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package argo.jdom;

import argo.jdom.JsonNodeBuilder;
import argo.jdom.JsonNodeFactories;
import argo.jdom.JsonStringNode;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class JsonStringNodeBuilder
implements JsonNodeBuilder {
    private final String value;

    JsonStringNodeBuilder(String string) {
        this.value = string;
    }

    public JsonStringNode build() {
        return JsonNodeFactories.aJsonString(this.value);
    }
}


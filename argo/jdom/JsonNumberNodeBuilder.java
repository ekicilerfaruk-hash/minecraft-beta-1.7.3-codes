/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package argo.jdom;

import argo.jdom.JsonNode;
import argo.jdom.JsonNodeBuilder;
import argo.jdom.JsonNodeFactories;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class JsonNumberNodeBuilder
implements JsonNodeBuilder {
    private final JsonNode value;

    JsonNumberNodeBuilder(String string) {
        this.value = JsonNodeFactories.aJsonNumber(string);
    }

    public JsonNode build() {
        return this.value;
    }
}


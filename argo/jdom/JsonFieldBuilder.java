/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package argo.jdom;

import argo.jdom.JsonNode;
import argo.jdom.JsonNodeBuilder;
import argo.jdom.JsonStringNode;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class JsonFieldBuilder {
    private JsonNodeBuilder keyBuilder;
    private JsonNodeBuilder valueBuilder;

    private JsonFieldBuilder() {
    }

    static JsonFieldBuilder aJsonFieldBuilder() {
        return new JsonFieldBuilder();
    }

    JsonFieldBuilder withKey(JsonNodeBuilder jsonNodeBuilder) {
        this.keyBuilder = jsonNodeBuilder;
        return this;
    }

    JsonFieldBuilder withValue(JsonNodeBuilder jsonNodeBuilder) {
        this.valueBuilder = jsonNodeBuilder;
        return this;
    }

    JsonStringNode buildKey() {
        return (JsonStringNode)this.keyBuilder.build();
    }

    JsonNode buildValue() {
        return this.valueBuilder.build();
    }
}


/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package argo.jdom;

import argo.jdom.JsonNode;
import argo.jdom.JsonNodeType;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class JsonConstants
extends JsonNode {
    static final JsonConstants NULL = new JsonConstants(JsonNodeType.NULL);
    static final JsonConstants TRUE = new JsonConstants(JsonNodeType.TRUE);
    static final JsonConstants FALSE = new JsonConstants(JsonNodeType.FALSE);
    private final JsonNodeType jsonNodeType;

    private JsonConstants(JsonNodeType jsonNodeType) {
        this.jsonNodeType = jsonNodeType;
    }

    public JsonNodeType getType() {
        return this.jsonNodeType;
    }

    public String getText() {
        throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
    }

    public Map getFields() {
        throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
    }

    public List getElements() {
        throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
    }
}


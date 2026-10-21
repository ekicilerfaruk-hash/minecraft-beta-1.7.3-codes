/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package argo.jdom;

import argo.jdom.JsonListenerToJdomAdapter;
import argo.jdom.JsonRootNode;
import argo.saj.SajParser;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class JdomParser {
    public JsonRootNode parse(Reader reader) {
        JsonListenerToJdomAdapter jsonListenerToJdomAdapter = new JsonListenerToJdomAdapter();
        new SajParser().parse(reader, jsonListenerToJdomAdapter);
        return jsonListenerToJdomAdapter.getDocument();
    }

    public JsonRootNode parse(String string) {
        JsonRootNode jsonRootNode;
        try {
            jsonRootNode = this.parse(new StringReader(string));
        } catch (IOException iOException) {
            throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", iOException);
        }
        return jsonRootNode;
    }
}


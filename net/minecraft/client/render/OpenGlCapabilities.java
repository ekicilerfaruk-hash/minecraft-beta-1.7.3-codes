/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.lwjgl.opengl.GLContext;

@Environment(value=EnvType.CLIENT)
public class OpenGlCapabilities {
    private static boolean USE_OCCLUSION_QUERY = true;

    public boolean glArbOcclusionQuery() {
        return USE_OCCLUSION_QUERY && GLContext.getCapabilities().GL_ARB_occlusion_query;
    }
}


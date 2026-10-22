/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.client.resource.language;

import net.minecraft.client.resource.language.TranslationStorage;

public class I18n {
    private static TranslationStorage translations = TranslationStorage.getInstance();

    public static String getTranslation(String name) {
        return translations.get(name);
    }

    public static String getTranslation(String name, Object ... args) {
        return translations.get(name, args);
    }
}


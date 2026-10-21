/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.stat;

import net.minecraft.stat.Stat;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;

public class SimpleStat
extends Stat {
    public SimpleStat(int i, String string, StatFormatter statFormatter) {
        super(i, string, statFormatter);
    }

    public SimpleStat(int i, String string) {
        super(i, string);
    }

    public Stat addStat() {
        super.addStat();
        Stats.GENERAL_STATS.add(this);
        return this;
    }
}


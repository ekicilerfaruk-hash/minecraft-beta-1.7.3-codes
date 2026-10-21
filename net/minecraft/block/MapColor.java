/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft.block;

public class MapColor {
    public static final MapColor[] COLORS = new MapColor[16];
    /**
     * RGB: 0, 0, 0
     */
    public static final MapColor CLEAR = new MapColor(0, 0);
    /**
     * RGB: 127, 178, 56
     */
    public static final MapColor PALE_GREEN = new MapColor(1, 8368696);
    /**
     * RGB: 247, 233, 163
     */
    public static final MapColor PALE_YELLOW = new MapColor(2, 16247203);
    /**
     * RGB: 167, 167, 167
     */
    public static final MapColor LIGHT_GRAY = new MapColor(3, 0xA7A7A7);
    /**
     * RGB: 255, 0, 0
     */
    public static final MapColor RED = new MapColor(4, 0xFF0000);
    /**
     * RGB: 160, 160, 255
     */
    public static final MapColor LIGHT_BLUE = new MapColor(5, 0xA0A0FF);
    /**
     * RGB: 167, 167, 167
     * Duplicate of LIGHT_GRAY
     */
    public static final MapColor LIGHT_GRAY2 = new MapColor(6, 0xA7A7A7);
    /**
     * RGB: 0, 124, 0
     */
    public static final MapColor GREEN = new MapColor(7, 31744);
    /**
     * RGB: 255, 255, 255
     */
    public static final MapColor WHITE = new MapColor(8, 0xFFFFFF);
    /**
     * RGB: 164, 168, 184
     */
    public static final MapColor SILVER = new MapColor(9, 10791096);
    /**
     * RGB: 183, 106, 47
     */
    public static final MapColor ORANGE = new MapColor(10, 12020271);
    /**
     * RGB: 112, 112, 112
     */
    public static final MapColor GRAY = new MapColor(11, 0x707070);
    /**
     * RGB: 64, 64, 255
     */
    public static final MapColor BLUE = new MapColor(12, 0x4040FF);
    /**
     * RGB: 104, 83, 50
     */
    public static final MapColor BROWN = new MapColor(13, 6837042);
    public final int color;
    public final int id;

    private MapColor(int id, int color) {
        this.id = id;
        this.color = color;
        MapColor.COLORS[id] = this;
    }
}


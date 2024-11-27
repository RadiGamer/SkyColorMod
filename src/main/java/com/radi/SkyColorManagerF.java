package com.radi;

public class SkyColorManagerF {
    private static int customSkyColor = 0xFFFFFF;

    public static int getSkyColor() {
        return customSkyColor;
    }

    public static void setSkyColor(int newColor) {
        customSkyColor = newColor;
    }
}

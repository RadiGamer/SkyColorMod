package com.radi;

public class SkyColorManager {
    private static int currentColor = 0x87CEEB;

    public static void setSkyColor(int color) {
        currentColor = color;
    }

    public static int getSkyColor() {
        return currentColor;
    }
}
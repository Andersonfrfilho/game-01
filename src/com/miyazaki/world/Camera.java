package com.miyazaki.world;

public class Camera {
    public static int x = 10;
    public static int y = 10;

    public static int clamp(int atual, int min, int max) {
        if (atual < min) {
            atual = min;
        }

        if (atual > max) {
            atual = max;
        }

        return atual;
    }
}

package com.example.map;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Map {
    
    static int height = 20; // grid tiles
    static int width = 20;
    static int squareSize = 30; // pixels

    private Canvas canvas;
    private GraphicsContext gc;
    private AnimationTimer animationTimer;

    public Map(){}

    public Map(Canvas canvas) {
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
    }

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        Map.height = height;
    }

    public static int getWidth() {
        return width;
    }

    public static void setWidth(int width) {
        Map.width = width;
    }

    public static int getSquareSize() {
        return squareSize;
    }

    public static void setSquareSize(int squareSize) {
        Map.squareSize = squareSize;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public GraphicsContext getGc() {
        return gc;
    }

    public void setGc(GraphicsContext gc) {
        this.gc = gc;
    }

    public AnimationTimer getAnimationTimer() {
        return animationTimer;
    }

    public void setAnimationTimer(AnimationTimer animationTimer) {
        this.animationTimer = animationTimer;
    }


}

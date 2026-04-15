package com.example.map;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Map {
    
    int gameSpeed = 60;
    int height = 20; // grid tiles
    int width = 20;
    int squareSize = 30; // pixels

    private Canvas canvas;
    private GraphicsContext gc;
    private AnimationTimer animationTimer;

    public Map(){}

    public Map(Canvas canvas) {
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
    }
    
    public int getGameSpeed() {
        return gameSpeed;
    }

    public void setGameSpeed(int gameSpeed) {
        this.gameSpeed = gameSpeed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSquareSize() {
        return squareSize;
    }

    public void setSquareSize(int squareSize) {
        this.squareSize = squareSize;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public GraphicsContext getGc() {
        return gc;
    }

    public AnimationTimer getAnimationTimer() {
        return animationTimer;
    }

}

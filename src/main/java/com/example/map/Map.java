package com.example.map;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Map {
    
    protected int height = 20; // grid tiles
    protected int width = 20;
    protected int squareSize = 30; // pixels

    protected Canvas mapCanvas;
    protected GraphicsContext graphicsContext;

    public Map(){}

    public Map(Canvas canvas) {
        this.mapCanvas = canvas;
        this.graphicsContext = canvas.getGraphicsContext2D();
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

    public Canvas getMapCanvas() {
        return mapCanvas;
    }

    public void setMapCanvas(Canvas canvas) {
        this.mapCanvas = canvas;
    }

    public GraphicsContext getGraphicsContext() {
        return graphicsContext;
    }

    public void setGraphicsContext(GraphicsContext gc) {
        this.graphicsContext = gc;
    }
}

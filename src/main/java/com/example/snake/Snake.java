package com.example.snake;

import javafx.scene.paint.Color;

public class Snake {
    
    // ArrayList<>
    // int length = 5;
    Color color = Color.GREEN;
    String direction = "DOWN";
    double[] pos = {0, 0};

    public Snake() {}

    public Snake(String direction, double[] pos) {
        this.direction = direction;
        this.pos = pos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double[] getPos() {
        return pos;
    }

    public void setPos(double[] pos) {
        this.pos[0] = pos[0];
        this.pos[1] = pos[1];
    }
}

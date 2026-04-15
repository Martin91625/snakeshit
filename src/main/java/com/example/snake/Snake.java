package com.example.snake;

import javafx.scene.paint.Color;

public class Snake {
    
    // ArrayList<>
    // int length = 5;
    Color color = Color.GREEN;
    String direction = "RIGHT";
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

    public void setPos(double posx, double posy) {
        this.pos[0] = posx;
        this.pos[1] = posy;
    }
}

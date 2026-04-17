package com.example.snake;

import javafx.scene.paint.Color;

public class Snake {
    
    private int length = 2;
    private Color color = Color.GREEN;
    private String direction = "RIGHT";
    private String nextDirection = "RIGHT";
    private final int[] position = {0, 0};

    public void applyNextDirection() {
        if (
            (direction.equals("UP") && nextDirection.equals("DOWN")) ||
            (direction.equals("DOWN") && nextDirection.equals("UP")) ||
            (direction.equals("LEFT") && nextDirection.equals("RIGHT")) ||
            (direction.equals("RIGHT") && nextDirection.equals("LEFT"))
        ) {
            return;
        }
        direction = nextDirection;
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

    public String getNextDirection() {
        return nextDirection;
    }

    public void setNextDirection(String nextDirection) {
        this.nextDirection = nextDirection;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] pos) {
        this.position[0] = pos[0];
        this.position[1] = pos[1];
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
package com.example.snake;

import javafx.scene.paint.Color;

public class Snake {
    
    // ArrayList<>
    // int length = 5;
    Color color = Color.GREEN;
    private String direction = "RIGHT";
    private String nextDirection = "RIGHT";
    int[] pos = {0, 0};

    public Snake() {}

    public Snake(String direction, int[] pos) {
        this.direction = direction;
        this.pos = pos;
    }

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

    public int[] getPos() {
        return pos;
    }

    public void setPos(int[] pos) {
        this.pos[0] = pos[0];
        this.pos[1] = pos[1];
    }
}

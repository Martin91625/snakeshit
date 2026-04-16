package com.example.snake;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class SnakeControl {

    private final Snake snake;

    public SnakeControl(Snake snake) {
        this.snake = snake;
    }

    public int[] moveSnake(int mapWidth, int mapHeight, int squareSize) {
        int[] pos = {0, 0};
        pos[0] = snake.getPosition()[0];
        pos[1] = snake.getPosition()[1];
        String dir = snake.getDirection();
        switch (dir) {
            case "RIGHT" -> pos[0] += squareSize;
            case "LEFT" -> pos[0] -= squareSize;
            case "UP" -> pos[1] -= squareSize;
            case "DOWN" -> pos[1] += squareSize;
            default -> {}
        }
        if (pos[0] > mapWidth - squareSize) {
            pos[0] = 0;
        }
        if (pos[0] < 0) {
            pos[0] = mapWidth - squareSize; 
        }
        if (pos[1] > mapHeight - squareSize) {
            pos[1] = 0;
        }
        if (pos[1] < 0) {
            pos[1] = mapHeight - squareSize;
        }
        snake.setPosition(pos);
        return snake.getPosition();
    }

    public void initChangeDirListener(Scene gameRoot) {
        gameRoot.setOnKeyPressed(e -> {
            String current = snake.getNextDirection();
            KeyCode code = e.getCode();
            if (code == KeyCode.W && !current.equals("DOWN"))
                snake.setNextDirection("UP");
            else if (code == KeyCode.S && !current.equals("UP"))
                snake.setNextDirection("DOWN");
            else if (code == KeyCode.A && !current.equals("RIGHT"))
                snake.setNextDirection("LEFT");
            else if (code == KeyCode.D && !current.equals("LEFT"))
                snake.setNextDirection("RIGHT");
        });
    }
}


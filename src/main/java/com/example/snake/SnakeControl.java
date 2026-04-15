package com.example.snake;

import java.util.InputMismatchException;

import com.example.map.Map;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class SnakeControl {
    
    Map map = new Map();
    int squareSize = map.getSquareSize();
    int mapWidth = map.getWidth() * squareSize;
    int mapHeight = map.getHeight() * squareSize;
    int gameSpeed = map.getGameSpeed();
    Snake snake = new Snake();

    public double[] moveSnake(double dt) {
        double[] pos = {0, 0};
        pos[0] = snake.getPos()[0];
        pos[1] = snake.getPos()[1];
        String dir = snake.getDirection();
        switch (dir) {
            case "RIGHT" -> pos[0] += gameSpeed * dt;
            case "LEFT" -> pos[0] -= gameSpeed * dt;
            case "UP" -> pos[1] -= gameSpeed * dt;
            case "DOWN" -> pos[1] += gameSpeed * dt;
            default -> throw new InputMismatchException();
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
        snake.setPos(pos);
        return snake.getPos();
    }

    public void initChangeDirListener(Scene gameRoot) {
        gameRoot.setOnKeyPressed(e -> {
            String current = snake.getDirection();
            KeyCode code = e.getCode();
            if (code == KeyCode.W && !current.equals("DOWN"))
                snake.setDirection("UP");
            else if (code == KeyCode.S && !current.equals("UP"))
                snake.setDirection("DOWN");
            else if (code == KeyCode.A && !current.equals("RIGHT"))
                snake.setDirection("LEFT");
            else if (code == KeyCode.D && !current.equals("LEFT"))
                snake.setDirection("RIGHT");
        });
    }
}


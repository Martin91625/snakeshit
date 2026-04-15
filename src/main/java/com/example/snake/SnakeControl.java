package com.example.snake;

import java.util.InputMismatchException;

import com.example.map.Map;

public class SnakeControl extends Snake{
    
    Map map = new Map();
    int gameSpeed = map.getGameSpeed();
    Snake snake = new Snake();

    public void moveSnake() {
        double[] pos = snake.getPos();
        String dir = snake.getDirection();
        double dt = map.getDeltaTime();
        switch (dir) {
            case "RIGHT" -> snake.setPos(pos[0] + gameSpeed * dt, pos[1]);
            case "LEFT" -> snake.setPos(pos[0] - gameSpeed * dt, pos[1]);
            case "UP" -> snake.setPos(pos[0], pos[1] - gameSpeed * dt);
            case "DOWN" -> snake.setPos(pos[0], pos[1] + gameSpeed * dt);
            default -> throw new InputMismatchException();
        }
    }

    public void changeDir() {
        
    }
}

package com.example.map;

import com.example.snake.Snake;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Map {
    
    int gameSpeed = 1;
    int height = 20; // understood in grid tiles
    int width = 20;
    int squareSize = 30; // pixels
    Snake snake = new Snake();

    private Canvas canvas;
    private GraphicsContext gc;
    private AnimationTimer animationTimer;

    public Map(Canvas canvas) {
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
    }
    
    private void render(GraphicsContext gc) {
        //System.out.println("rendering");
        clearScreen();
        gc.setFill(Color.WHITE);
        gc.fillRect(snake.getPos()[0], snake.getPos()[1], squareSize, squareSize);
    }

    private void update(double dt) {
        //System.out.println("updating");
        double[] pos = snake.getPos();
        String dir = snake.getDirection();
        
        switch (dir) {
            case "RIGHT" -> snake.setPos(pos[0] + gameSpeed * dt, pos[1]);
            case "LEFT" -> snake.setPos(pos[0] - gameSpeed * dt, pos[1]);
            case "UP" -> snake.setPos(pos[0], pos[1] - gameSpeed * dt);
            case "DOWN" -> snake.setPos(pos[0], pos[1] + gameSpeed * dt);
            default -> throw new AssertionError();
        }
    }

    private void clearScreen() {
        //System.out.println("clearing screen");
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0,height*squareSize, width*squareSize);
    }

    private void initGameLoop(GraphicsContext gc) {
        animationTimer = new AnimationTimer() {
            long lastTime = 0;

            @Override
            public void handle(long now){
                if (lastTime == 0) {
                    lastTime = now;
                    return;
                }
                double deltaTime = (now - lastTime) / 1_000_000_000.0;
                lastTime = now;

                update(deltaTime);
                render(gc);
            }
        };
    }
    public void startGameLoop() {
        initGameLoop(gc);
        animationTimer.start();
    }
    public void stopGameLoop() {
        animationTimer.stop();
    }
}

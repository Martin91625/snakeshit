package com.example.map;

import com.example.snake.Snake;
import com.example.snake.SnakeControl;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MapRenderer extends Map{

    Snake snake = new Snake();
    SnakeControl snakeControl = new SnakeControl();
    GraphicsContext gc;
    AnimationTimer animationTimer;
    double deltaTime;

    public MapRenderer(Canvas canvas) {
        super(canvas);
        gc = super.getGc();
        animationTimer = super.getAnimationTimer();
    }

    private void render(GraphicsContext gc) {
        //System.out.println("rendering");
        clearScreen();
        gc.setFill(Color.WHITE);
        gc.fillRect(snake.getPos()[0], snake.getPos()[1], squareSize, squareSize);
    }

    private void update() {
        //System.out.println("updating");
        double[] pos = snakeControl.moveSnake(deltaTime);     
        snake.setPos(pos);        
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
                deltaTime = (now - lastTime) / 1_000_000_000.0;
                lastTime = now;

                update();
                render(gc);
            }
        };
    }
    public void startGameLoop(Scene gameRoot) {
        initGameLoop(gc);
        snakeControl.initChangeDirListener(gameRoot);
        animationTimer.start();
    }
    public void stopGameLoop() {
        animationTimer.stop();
    }

    
}

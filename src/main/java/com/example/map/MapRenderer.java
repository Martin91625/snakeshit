package com.example.map;

import com.example.snake.Snake;
import com.example.snake.SnakeControl;
import com.example.snake.SnakeFood;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class MapRenderer extends Map{

    final Snake snake = new Snake();
    final SnakeControl snakeControl = new SnakeControl(snake);
    //final SnakeBody snakeBody = new SnakeBody(snake);
    final SnakeFood snakeFood = new SnakeFood(width, height, squareSize);

    AnimationTimer animationTimer;
    double deltaTime;
    private double accumulator = 0;
    private final double timeDiff = 0.5; // seconds

    public MapRenderer(Canvas canvas) {
        super(canvas);
        this.startGameLoop();
    }

    private void render() {
        //System.out.println("rendering");
        clearScreen();

        if(snakeFood.isEaten(snake.getPosition())) {
            snakeFood.setRandomFoodPos(width, height, squareSize);
            snakeFood.setCurrentColor(snakeFood.randomFoodColor());
        }

        graphicsContext.setFill(snake.getColor());
        graphicsContext.fillRect(snake.getPosition()[0], snake.getPosition()[1], squareSize, squareSize);

        graphicsContext.setFill(snakeFood.getCurrentColor());
        graphicsContext.fillRect(snakeFood.getFoodPos()[0], snakeFood.getFoodPos()[1], squareSize, squareSize);
    }

    private void update() {
        //System.out.println("updating");
        snake.applyNextDirection();
        int[] pos = snakeControl.moveSnake(width * squareSize, height * squareSize, squareSize);     
        snake.setPosition(pos);
  
    }

    private void clearScreen() {
        //System.out.println("clearing screen");
        graphicsContext.setFill(Color.BLACK);
        graphicsContext.fillRect(0, 0,height * squareSize, width * squareSize);
    }

    private void initGameLoop() {
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

                accumulator += deltaTime;

                while(accumulator >= timeDiff) {
                    update();
                    accumulator -= timeDiff;
                }
                render();
            }
        };
    }
    public final void startGameLoop() {
        initGameLoop();
        animationTimer.start();
    }
    public final void stopGameLoop() {
        animationTimer.stop();
    }
}

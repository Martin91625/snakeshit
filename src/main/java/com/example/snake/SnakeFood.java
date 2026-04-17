package com.example.snake;

import java.util.Random;

import javafx.scene.paint.Color;

public class SnakeFood extends Snake{
    
    private final Random random = new Random();

    private int[] foodPos;

    private final Color[] foodColors = {Color.PURPLE, Color.LIME, Color.RED, Color.BLUE, Color.YELLOW};
    private Color currentColor = Color.YELLOW;

    public SnakeFood(int width, int height, int squareSize) {
        setRandomFoodPos(width, height, squareSize);
    }

    public final int[] getFoodPos() {
        return foodPos;
    }

    public final void setFoodPos(int[] foodPos) {
        this.foodPos = foodPos;
    }

    public final void setRandomFoodPos(int width, int height, int squareSize) {
        int foodPosX = random.nextInt(width) * squareSize;
        int foodPosY = random.nextInt(height) * squareSize;
        
        int[] newFoodPos = {foodPosX, foodPosY};
        setFoodPos(newFoodPos);
    }

    public boolean isEaten(int[] position){
        return foodPos[0] == position[0] && foodPos[1] == position[1]; 
          
    }

    public Color randomFoodColor() {
        return foodColors[random.nextInt(foodColors.length)];
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }
}

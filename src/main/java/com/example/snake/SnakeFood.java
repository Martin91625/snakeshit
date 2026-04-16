package com.example.snake;

public class SnakeFood {
    
    private int[] foodPos;

    public SnakeFood(int posX, int posY) {
        this.foodPos[0] = posX;
        this.foodPos[1] = posY;
    }

    public int[] getFoodPos() {
        return foodPos;
    }

    public void setFoodPos(int[] foodPos) {
        this.foodPos = foodPos;
    }

    public void setRandomPos() {
        this.foodPos[0] = (int)(Math.random());
        this.foodPos[1] = (int)(Math.random());
    }
    
}

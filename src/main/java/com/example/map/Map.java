package com.example.map;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Map {
    
    static int height = 20; // understood in grid tiles
    static int width = 20;
    static int squareSize = 30; // pixels

    static Canvas canvas = new Canvas(height*squareSize, width*squareSize);
    static GraphicsContext gc = canvas.getGraphicsContext2D();
    

    public static void drawTest() {
        int[] pos = {0, 0};
        Paint paint = Color.BLACK;
        gc.setFill(paint);
        AnimationTimer animate = new AnimationTimer(){
           
            @Override
            public void handle(long arg0) {
                while(pos[0] < 600){
                    canvas.setVisible(true);
                    System.out.println("mükszik");
                    gc.fillRect(pos[0], pos[1], squareSize, squareSize);
                    pos[0] += squareSize;
                    pos[1] += squareSize;
                }
            }
        };
        animate.start();
    }
}

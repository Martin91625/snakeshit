package com.example.map;

import com.example.App;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Map {
    
    static int height = 20; // understood in grid tiles
    static int width = 20;
    static int squareSize = 30; // pixels

    static Canvas canvas = new Canvas(height*squareSize, width*squareSize);
    static GraphicsContext gc = canvas.getGraphicsContext2D();
    
    private static void render() {
        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root);
        App._stage.setScene(scene);
        App._stage.show();
    }
    private static int[] update(double dt, int[] pos) {    
        pos[0] += 1 * dt;    
        gc.fillRect(pos[0], pos[1], squareSize, squareSize);
        pos[0] += squareSize;
        //pos[1] += squareSize;
        return pos;
    }
    public static void drawTest() {
        int[] pos = {0, 0};
        Paint paint = Color.BLACK;
        gc.setFill(paint);
        AnimationTimer animate = new AnimationTimer(){
           private long lastTime = 0;
            @Override
            public void handle(long now) {
                do {
                    if (lastTime == 0) {
                    lastTime = now;
                    return;
                    }
                    double deltaSeconds = (now - lastTime) / 1_000_000_000.0;
                    lastTime = now;             
                    int[] newPos = update(deltaSeconds, pos);
                    pos[0] = newPos[0];
                    pos[1] = newPos[1];
                    render();
                } while (pos[0] < 600);
                
            }
        };
        animate.start();
    }
}

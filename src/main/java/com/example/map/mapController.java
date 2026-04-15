package com.example.map;

import com.example.App;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;

public class mapController {

    @FXML
    private Canvas canvas;

    private final Scene gameRoot = App._scene;
    
    @FXML
    public void initialize(){
        MapRenderer map = new MapRenderer(canvas);
        map.startGameLoop(gameRoot);
    }
}

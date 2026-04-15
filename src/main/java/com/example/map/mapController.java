package com.example.map;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;

public class mapController {

    @FXML
    private Pane gameRoot;
    
    @FXML
    private Canvas canvas;

    @FXML
    void initialize(){
        MapRenderer map = new MapRenderer(canvas);
        map.startGameLoop();
    }
}

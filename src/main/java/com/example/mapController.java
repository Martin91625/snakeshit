package com.example;

import com.example.map.Map;

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
        gameRoot.getChildren().add(canvas);
        Map map = new Map(canvas);
        map.startGameLoop();
    }
}

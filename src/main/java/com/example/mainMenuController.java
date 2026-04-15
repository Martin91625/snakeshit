package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class mainMenuController {

    /* @FXML
    private Button playButton;

    void initialize() {
        playButton.setOnMouseClicked(e -> {
            App.setRoot("map");
        });
     }*/
    @FXML
    public void onClickPlayButton(ActionEvent event) {
        App.setRoot("map");
    } 

}

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class mainMenuController {

    @FXML
    void onClickPlayButton(ActionEvent event) {
        App.setRoot("map");
    }

}

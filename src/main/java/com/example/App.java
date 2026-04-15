package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private static Scene scene;
    public static Scene _scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("mainMenu"), 600, 600);
        stage.setScene(scene);
        stage.show();
        _scene = scene;
    }

    public static void setRoot(String fxml) {
        try {
            trySetRoot(fxml);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("\nHiba az fxml fájl betöltése közben");

        }
    }

    private static void trySetRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
        _scene = scene;
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
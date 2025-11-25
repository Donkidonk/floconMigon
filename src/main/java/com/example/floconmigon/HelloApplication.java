package com.example.floconmigon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();                     // Conteneur
        Scene scene = new Scene(pane, 320, 240);    // Scene avec root + dimensions

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}

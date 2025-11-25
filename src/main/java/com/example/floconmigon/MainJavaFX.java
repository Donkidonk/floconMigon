package com.example.floconmigon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainJavaFX extends Application {

    @Override
    public void start(Stage stage) {

        Pane r = new Pane();

        Scene scene = new Scene(r, 800, 600);
        stage.setTitle("Hello FX");


      Personnages p1 = new Personnages();

        Canvas canvas = new Canvas(800, 600);

        GraphicsContext gc= canvas.getGraphicsContext2D();

        gc.setFill(Color.RED);
        gc.fillRect(0, 0, 800, 600);

        p1.draw(gc);
        r.getChildren().add(canvas);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

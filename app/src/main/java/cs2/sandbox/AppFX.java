package cs2.sandbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/** A minimal JavaFX example: opens a window and draws a few shapes on a canvas. */
public class AppFX extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.CORNFLOWERBLUE);
        gc.fillOval(50, 50, 120, 120);

        gc.setFill(Color.TOMATO);
        gc.fillRect(200, 100, 150, 100);

        gc.setFill(Color.BLACK);
        gc.fillText("Hello, JavaFX!", 150, 250);

        stage.setTitle("CS2 Sandbox");
        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
    }
}

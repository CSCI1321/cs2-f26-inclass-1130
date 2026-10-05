package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FirstWindow extends Application {
  public void start(Stage stg) {
    Canvas canvas = new Canvas(500,800);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    g.setStroke(Color.MAGENTA);

    g.strokeRect(100,300, 100,400);
    g.fillOval(100,300, 100,400);

    g.setLineWidth(20);

    g.setFill(Color.GREEN);

    g.strokeLine(50,100, 300,500);
    g.fillText("Hellogjypq", 100,300);
  }
}

package cs2.graphics;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Animation extends Application {
  public void start(Stage stg) {
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.setTitle("Bounce Ball!");
    stg.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    AnimationTimer timer = new AnimationTimer() {
      double x = 100;
      double y = 150;
      public void handle(long t) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0,600,600);
        g.setFill(Color.ORANGERED);
        g.fillOval(x,y, 100,100);
        x+=3;
        if(x >= 600-100) {
          x-=3;
        }
      }
    };
    timer.start();
    

  }
  
}

package cs2.graphics;

import cs2.util.Vec2;
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
      // double x = 100;
      // double dx = 3;
      // double y = 150;
      // double dy = 1;
      Vec2 pos = new Vec2(100,150);
      Vec2 vel = Vec2.randVec2();
      
      public void handle(long t) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0,600,600);
        g.setFill(Color.ORANGERED);
        g.fillOval(pos.x,pos.y, 100,100);
        pos.addThis(vel);
        if(pos.x >= 600-100 || pos.x <= 0) {
          vel.x = -vel.x;
        }
        if(pos.y >= 600-100 || pos.y <= 0) {
          vel.y = -vel.y;
        }
      }
    };
    timer.start();
    

  }
  
}

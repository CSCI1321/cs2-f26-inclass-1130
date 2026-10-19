package cs2.particles;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ParticleSystemApp extends Application {
  public void start(Stage stg) {
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.setTitle("Particles");
    stg.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    //Particle p = new Particle(new Vec2(200,200), new Vec2(1,1));
    ParticleSystem ps = new ParticleSystem(new Vec2(200,200));
    
    AnimationTimer timer = new AnimationTimer() {
      public void handle(long t) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0, canvas.getWidth(),canvas.getHeight());
        ps.display(g);
        ps.update();
        ps.addParticle();
        ps.addForce(new Vec2(0,0.1));
      }
    };
    timer.start();

  }
}

package cs2.particles;

import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ParticleSystemApp extends Application {
  public static final Image STARPIC = new Image("file:star.png");

  public void start(Stage stg) {
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.setTitle("Particles");
    stg.show();

    Image img = new Image("file:star.jpg");

    GraphicsContext g = canvas.getGraphicsContext2D();

    //Particle p = new Particle(new Vec2(200,200), new Vec2(1,1));
    ArrayList<ParticleSystem> ps = new ArrayList<>();

    canvas.setOnMousePressed((MouseEvent e) -> {
      //ps.add(new ImageParticleSystem(new Vec2(e.getX(),e.getY()), STARPIC));
      ps.add(new ParticleSystem(new Vec2(e.getX(),e.getY())));
    });
    
    AnimationTimer timer = new AnimationTimer() {
      public void handle(long t) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0, canvas.getWidth(),canvas.getHeight());
        for(ParticleSystem s : ps) {
          s.update();
          s.display(g);
          s.addParticle();
          s.addForce(new Vec2(0,0.1));
        }
        //g.drawImage(img, 100, 100, 50,50);
      }
    };
    timer.start();

  }
}

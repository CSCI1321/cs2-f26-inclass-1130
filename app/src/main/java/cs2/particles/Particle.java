package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Particle {
  private Vec2 pos;
  private Vec2 vel;
  private Color col = Color.ORANGERED;
  
  public Particle(Vec2 p, Vec2 v) {
    pos = p; vel = v;
  }
  public void display(GraphicsContext g) {
    g.setFill(col);
    g.fillOval(pos.x,pos.y, 20,20);
  }
  public void update() {
    pos.addThis(vel);
  }
  public void addForce(Vec2 force) {
    vel.addThis(force);
  }

}

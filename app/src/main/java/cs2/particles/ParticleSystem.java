package cs2.particles;

import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;

public class ParticleSystem {
  private ArrayList<Particle> parts;
  private Vec2 origin;

  public ParticleSystem(Vec2 o) {
    parts = new ArrayList<Particle>();
    origin = o;
  }
  public void addParticle() {
    parts.add(new RoundParticle(origin.clone(), Vec2.randVec2()));
    parts.add(new SquareParticle(origin.clone(), Vec2.randVec2()));
  }
  public void display(GraphicsContext g) {
    for(int i=0; i<parts.size(); i++) {
      parts.get(i).display(g);
    }
  }
  public void update() {
    System.out.println(parts.size());
    for(Particle p : parts) {
      p.update();
    }
  }
  public void addForce(Vec2 force) {
    for(Particle p : parts) {
      p.addForce(force);
    }
  }

}

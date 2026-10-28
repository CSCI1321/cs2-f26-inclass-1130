package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.image.Image;

public class ImageParticleSystem extends ParticleSystem {
  private Image img;
  public ImageParticleSystem(Vec2 o, Image i) {
    super(o);
    img = i;
  }
  @Override 
  public void addParticle() {
    parts.add(new ImageParticle(origin.clone(), Vec2.randVec2(), img));
  }
}

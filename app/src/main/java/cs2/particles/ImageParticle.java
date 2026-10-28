package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ImageParticle extends Particle {
  private Image ipImage;

  public ImageParticle(Vec2 p, Vec2 v, Image i) {
    super(p,v);
    ipImage = i;
  }
  @Override 
  public void display(GraphicsContext g) {
    g.drawImage(ipImage, pos.x, pos.y);
  }
}

package cs2.particles;

import javafx.scene.paint.Color;

public class RainbowColor implements ColorPattern {
  private double hue = 0;
  public Color getColor() {
    hue += 3;
    return Color.hsb(hue, 0.9, 0.9);
  }
}

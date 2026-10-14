package cs2.util;

public class Vec2 {
  public double x;
  public double y;
  public Vec2(double ix, double iy) { x=ix; y=iy; }
  public Vec2() { x=0; y=0; }
  public static Vec2 randVec2() {
    return new Vec2(Math.random()*6-3,Math.random()*6-3);
  }
  public String toString() { return "("+x+","+y+")"; }
  public Vec2 add(Vec2 other) {
    return new Vec2(this.x+other.x, this.y+other.y);
  }
  public void addThis(Vec2 other) {
    this.x += other.x;
    this.y += other.y;
  }
}

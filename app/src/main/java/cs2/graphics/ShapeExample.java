package cs2.graphics;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ShapeExample extends Application {
  public void start(Stage stg) {
    Canvas canvas = new Canvas(400,600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.setTitle("Shapes!");
    stg.show();

    GraphicsContext g = canvas.getGraphicsContext2D();
    /*
    g.setFill(Color.BLUEVIOLET);
    g.fillRect(100,150, 200,300);
    g.fillOval(100,50, 200,200);
    g.setLineWidth(30);
    g.strokeLine(150,300,250,300);
    g.setFill(Color.WHITE);
    g.fillOval(100,100, 100,100);
    g.fillOval(200,100, 100,100);
    g.setFill(Color.BLACK);
    g.fillOval(140,140, 50,50);
    g.fillOval(240,140, 50,50);
    g.setFill(Color.ORANGERED);
    g.fillArc(100,400, 200,100, 0,270, ArcType.OPEN);
    g.strokeArc(100,400, 200,100, 0,270, ArcType.OPEN);
    double[] xs = {100, 200, 100, 250};
    double[] ys = {50, 50, 300, 200};
    g.strokePolygon(xs, ys, 4);
    
    g.setLineWidth(2);
    for(int x=0; x<400; x++) {
      g.setStroke(Color.rgb(0,(int)(x / 400.0 * 255),(int)(x / 400.0 * 255)));
      g.strokeLine(x,0 ,x,600);
    }
    */

    drawCircle(g, 200,300, 100);

  }

  public static void drawCircle(GraphicsContext g, double x, double y, double r) {
    g.strokeOval(x-r,y-r, r*2,r*2);
    if(r > 1) {
      drawCircle(g,x-r,y, r*0.5);
      drawCircle(g,x+r,y, r*0.5);
      drawCircle(g,x,y-r, r*0.5);
    }
  }

}

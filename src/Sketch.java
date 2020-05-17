import processing.core.PApplet;

import java.util.ArrayList;

public class Sketch extends PApplet {

    ArrayList<Shape> shapes = new ArrayList<Shape>();
    public void settings(){
        size(500,400);
    }

    public void setup(){
        shapes.add(new Circle(new Point(250.0, 310.0), 80.0));
        shapes.add(new Circle(new Point(250.0, 200.0), 60.0));
        shapes.add(new Circle(new Point(250.0, 120.0), 30.0));
        shapes.add(new Circle(new Point(242.0, 120.0), 6.0));
        shapes.add(new Circle(new Point(258.0, 120.0), 6.0));
        shapes.add(new Rectangle(new Point(230.0, 60.0), 80.0, 80.0 ));
        shapes.add(new Rectangle(new Point(220.0, 95.0), 120.0, 20.0 ));
    }

    public void draw(){
        for (Shape shape: shapes){
            shape.draw(this);
        }

    }

}


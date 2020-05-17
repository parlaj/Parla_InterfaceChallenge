import java.util.ArrayList;
import java.util.Collections;
import processing.core.PApplet;

class Main {

    private final static String[] OPTIONS = new String[] {"--present","Sketch"};

    public static void main(String[] args) {
        PApplet.main(OPTIONS);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        add(shapes);
        display(shapes);
        System.out.println(String.format("The total number of shapes created are: %d", Shape.getNumShapes()));
        Collections.sort(shapes);
        display(shapes);
        System.out.println(String.format("The total number of shapes created are: %d", Shape.getNumShapes()));

    }
    private static void add(ArrayList<Shape> shapes) {
        shapes.add(new Circle(new Point(200.0, 200.0), 50.0));
        shapes.add(new Circle(new Point(300.0, 300.0), 100.0));
        shapes.add(new Circle(new Point(150, 150), 75));
        shapes.add(new Rectangle(new Point(50.0, 50.0), 10.0, 40.0));
        shapes.add(new Rectangle(new Point(0.0, 0.0), 20.0, 20.0));
        shapes.add(new Rectangle(new Point(25.0, 25.0), 15.0, 30.0));
        shapes.add(new Triangle((new Point(60, 60)), 12, 12, 12));
    }

    private static void display(ArrayList<Shape> shapes) {
        for(Shape shape: shapes){
            System.out.println(shape);

        }
    }


}
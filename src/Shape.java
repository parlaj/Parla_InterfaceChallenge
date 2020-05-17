
abstract class Shape extends Sketch implements Comparable<Shape> {

    private Point position;
    private static int numShapes;
    private int id;


    public Shape(Point position){
        this.position=position;
        ++numShapes;
        setId(numShapes);
    }

    public Point getPosition() {
        return position;
    }
    public void setPosition(Point position) {
        this.position = position;
    }
    public static int getNumShapes(){
        return numShapes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Shape shape) {
        if (this.computeArea() != shape.computeArea())
            return (int) (this.computeArea() - shape.computeArea());
        else
            return (int) (this.getPerimeter() - shape.getPerimeter());

    }
    abstract public double computeArea();
    abstract public double getPerimeter();
    abstract public void draw(Sketch sketch);

    public String toString(){
        return String.format("Shape type: %s, ID: %d, Area: %f, Perimeter: %f", getClass().getName(),id, computeArea(),getPerimeter());
    }
}
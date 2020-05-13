public class Triangle extends Shape{
    private double base, sideA, sideB;

    public Triangle(Point position, double base, double sideA, double sideB) {
        super(position);
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public double computeArea() {
        double p = (sideA + sideB + base) / 2;
        if((sideA+sideB)>base && (sideA+base)>sideB && (sideB+base)>sideA) {

            return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - base));
        }
        return 0.00;
    }
    public double getPerimeter() {return sideA+sideB+base;}
}

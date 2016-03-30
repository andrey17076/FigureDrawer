public class Circle extends Ellipse {

    public double radius;

    public Circle(double x, double y) {
        super(x, y);
    }

    public void setRadius(double radius) {
        this.setHorizontalRadius(radius);
        this.setVerticalRadius(radius);
    }
}
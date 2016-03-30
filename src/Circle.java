import javafx.scene.paint.Color;

public class Circle extends Ellipse {
    public Circle(double x, double y, Color color) {
        super(x, y, color);
    }

    public void setRadius(double radius) {
        this.setHorizontalRadius(radius);
        this.setVerticalRadius(radius);
    }
}
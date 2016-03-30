public class Ellipse extends Shape {
    private Point center;
    private double horizontalRadius, verticalRadius;

    public Ellipse(double x, double y) {
        this.setCenter(x, y);
    }

    public void setCenter(double x, double y) {
        center = new Point(x, y);
    }

    public Point getCenter() {
        return center;
    }

    public void setHorizontalRadius(double horizontalRadius) {
        this.horizontalRadius = horizontalRadius;
    }

    public void setVerticalRadius(double verticalRadius) {
        this.verticalRadius = verticalRadius;
    }

    @Override
    public javafx.scene.shape.Shape getRawShape() {
        return new javafx.scene.shape.Ellipse(center.x, center.y, horizontalRadius, verticalRadius);
    }
}

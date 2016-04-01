package shapes;

import javafx.scene.paint.Color;

public class Ellipse extends Shape {
    private Point center;
    private double horizontalRadius, verticalRadius;

    public Ellipse(double x, double y, Color color) {
        super(color);
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
        javafx.scene.shape.Shape rawShape =
                new javafx.scene.shape.Ellipse(center.x, center.y, horizontalRadius, verticalRadius);
        rawShape.setFill(this.getColor());
        rawShape.setStroke(Color.BLACK);
        rawShape.setStrokeWidth(Shape.DEFAULT_STROKE_WIDTH);
        return rawShape;
    }
}

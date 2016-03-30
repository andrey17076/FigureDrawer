import javafx.scene.paint.Color;

public class Line extends Shape {
    private static final int DEFAULT_LINE_WIDTH = 5;
    private Point basePoint, endPoint;

    public Line(double baseX, double baseY, Color color) {
        super(color);
        basePoint = new Point(baseX, baseY);
        endPoint = basePoint;
    }

    public void setEndPoint(double x, double y) {
        endPoint = new Point(x, y);
    }

    @Override
    public javafx.scene.shape.Shape getRawShape() {
        javafx.scene.shape.Shape rawShape =
                new javafx.scene.shape.Line(basePoint.x, basePoint.y, endPoint.x, endPoint.y);
        rawShape.setStrokeWidth(DEFAULT_LINE_WIDTH);
        rawShape.setStroke(this.getColor());
        return rawShape;
    }
}
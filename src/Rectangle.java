import javafx.scene.paint.Color;

public class Rectangle extends Polygon {

    protected Point basePoint;
    protected static final int RECTANGLE_POINTS_QUANTITY = 4;

    public Rectangle(double baseX, double baseY, Color color) {
        super(baseX, baseY, color);
        basePoint = new Point(baseX, baseY);
    }

    public void setOppositePoint(double x, double y) {
        if (points.size() == RECTANGLE_POINTS_QUANTITY) {
            points.remove(points.size() - 1);
            points.remove(points.size() - 1);
            points.remove(points.size() - 1);
        }
        addPoint(basePoint.x, y);
        addPoint(x, y);
        addPoint(x, basePoint.y);
    }
}

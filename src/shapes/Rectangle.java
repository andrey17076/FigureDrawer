package shapes;

import javafx.scene.paint.Color;

public class Rectangle extends Polygon {

    Point basePoint;
    private static final int RECTANGLE_POINTS_QUANTITY = 4;

    public Rectangle(double baseX, double baseY, Color color) {
        super(baseX, baseY, color);
        basePoint = new Point(baseX, baseY);
    }

    void resetRectShape() {
        if (points.size() == RECTANGLE_POINTS_QUANTITY) {
            for (int i = 0; i < RECTANGLE_POINTS_QUANTITY - 1; i++) {
                removeLastPoint();
            }
        }
    }

    void setRectShape(double x, double y) {
        addPoint(basePoint.x, y);
        addPoint(x, y);
        addPoint(x, basePoint.y);
    }

    public void setOppositePoint(double x, double y) {
        resetRectShape();
        setRectShape(x, y);
    }
}

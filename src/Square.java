import javafx.scene.paint.Color;
public class Square extends Rectangle {

    public Square(double baseX, double baseY, Color color) {
        super(baseX, baseY, color);
    }


    public void setOppositePoint(double x, double y) {
        if (points.size() == RECTANGLE_POINTS_QUANTITY) {
            points.remove(points.size() - 1);
            points.remove(points.size() - 1);
            points.remove(points.size() - 1);
        }
        if (Math.abs(x - basePoint.x) < Math.abs(y - basePoint.y)) {
            if (y > basePoint.y) {
                y = basePoint.y + Math.abs(x - basePoint.x);
            } else {
                y = basePoint.y - Math.abs(x - basePoint.x);
            }
        } else {
            if (x > basePoint.x) {
                x = basePoint.x + Math.abs(y - basePoint.y);;
            } else {
                x = basePoint.x - Math.abs(y - basePoint.y);;
            }
        }

        addPoint(basePoint.x, y);
        addPoint(x, y);
        addPoint(x, basePoint.y);
    }
}

public class Rectangle extends Polygon {
    public Rectangle(Point basePoint, int width, int height) {
        addPoint(basePoint);
        addPoint(new Point(basePoint.x + height, basePoint.y));
        addPoint(new Point(basePoint.x + height, basePoint.y));
        addPoint(new Point(basePoint.x + height, basePoint.y + width));
        addPoint(new Point(basePoint.x, basePoint.y + width));
    }
}

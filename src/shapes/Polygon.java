package shapes;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Polygon extends Shape {
    ArrayList<Point> points = new ArrayList<>();

    public Polygon(double baseX, double baseY, Color color) {
        super(color);
        this.addPoint(baseX, baseY);
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public void removeLastPoint() {
        if (!points.isEmpty())
            points.remove(points.size() - 1);
    }

    @Override
    public javafx.scene.shape.Shape getRawShape() {
        double[] coordinates = new double[points.size() * 2];
        for (int i = 0; i < points.size(); i++) {
            coordinates[2 * i] = points.get(i).x;
            coordinates[2 * i + 1] = points.get(i).y;
        }

        javafx.scene.shape.Shape rawShape =
                new javafx.scene.shape.Polygon(coordinates);

        rawShape.setFill(this.getColor());
        rawShape.setStroke(Color.BLACK);
        rawShape.setStrokeWidth(Shape.DEFAULT_STROKE_WIDTH);

        return rawShape;
    }
}

import java.awt.*;
import java.util.ArrayList;

public class Polygon extends Figure{
    protected ArrayList<Point> Points;

    public Polygon() {
        Points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        Points.add(point);
    }

    @Override
    public void draw(Graphics g) {
        int[] vertexX = new int[Points.size()];
        int[] vertexY = new int[Points.size()];

        for (int i = 0; i < Points.size(); i++) {
            vertexX[i] = Points.get(i).x;
            vertexY[i] = Points.get(i).y;
        }
        g.drawPolygon(vertexX, vertexY, Points.size());
    }
}

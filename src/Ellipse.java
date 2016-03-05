import java.awt.*;

public class Ellipse extends Figure {
    protected Point center;
    protected int hRad, vRad;

    public Ellipse(Point center, int horizontalRadius, int verticalRadius) {
        this.center = new Point(center.x, center.y);
        hRad = horizontalRadius;
        vRad = verticalRadius;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(center.x - hRad, center.y - vRad, 2*vRad, 2*hRad);
    }
}

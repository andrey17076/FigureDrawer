import java.awt.*;

public class Line extends Figure {
    private Point basePoint, vectorPoint;

    public Line(Point basePoint, Point vectorPoint) {
        this.basePoint = basePoint;
        this.vectorPoint = vectorPoint;
    }

    @Override
    public void draw(Graphics g){
        g.drawLine(basePoint.x, basePoint.y, vectorPoint.x, vectorPoint.y);
    }
}
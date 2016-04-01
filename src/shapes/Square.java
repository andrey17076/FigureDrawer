package shapes;

import javafx.scene.paint.Color;

public class Square extends Rectangle {

    public Square(double baseX, double baseY, Color color) {
        super(baseX, baseY, color);
    }

    public void setOppositePoint(double x, double y) {
        resetRectShape();
        double weight = Math.abs(x - basePoint.x);
        double height = Math.abs(y - basePoint.y);

        if (weight < height)
            y = (y > basePoint.y) ? basePoint.y + weight : basePoint.y - weight;
        else
            x = (x > basePoint.x) ? basePoint.x + height : basePoint.x - height;

        setRectShape(x, y);
    }
}

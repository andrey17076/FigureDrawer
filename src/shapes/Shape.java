package shapes;

import javafx.scene.paint.Color;

public abstract class Shape {

    static final int DEFAULT_STROKE_WIDTH = 2;

    private Color color;

    Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract javafx.scene.shape.Shape getRawShape();
}
package drawtools;

import shapes.DrawField;
import shapes.Shape;


abstract class DrawTool {
    DrawField drawField;

    DrawTool(DrawField drawField) {
        this.drawField = drawField;
    }

    public abstract void handleDrawing();

    void draw(Shape shape) {
        drawField.add(shape);
    }

    void redraw(Shape shape) {
        drawField.removeLast();
        drawField.add(shape);
    }
}

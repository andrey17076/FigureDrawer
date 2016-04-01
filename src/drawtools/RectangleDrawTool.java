package drawtools;

import shapes.DrawField;
import shapes.Rectangle;

public class RectangleDrawTool extends DrawTool {
    public RectangleDrawTool(DrawField drawField) {
        super(drawField);
    }

    @Override
    public void handleDrawing() {
        drawField.getPane().setOnMousePressed(event -> {

            Rectangle rectangle = new Rectangle(event.getX(), event.getY(), drawField.getColor());
            draw(rectangle);

            drawField.getPane().setOnMouseDragged(event1 -> {
                rectangle.setOppositePoint(event1.getX(), event1.getY());
                redraw(rectangle);
            });
        });
    }
}

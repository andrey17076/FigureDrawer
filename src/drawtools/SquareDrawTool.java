package drawtools;

import shapes.DrawField;
import shapes.Square;

public class SquareDrawTool extends DrawTool {
    public SquareDrawTool(DrawField drawField) {
        super(drawField);
    }

    @Override
    public void handleDrawing() {
        drawField.getPane().setOnMousePressed(event -> {

            Square square = new Square(event.getX(), event.getY(), drawField.getColor());
            draw(square);

            drawField.getPane().setOnMouseDragged(event1 -> {
                square.setOppositePoint(event1.getX(), event1.getY());
                redraw(square);
            });
        });
    }
}

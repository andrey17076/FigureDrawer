package drawtools;

import shapes.DrawField;
import shapes.Line;

public class LineDrawTool extends DrawTool {

    public LineDrawTool(DrawField drawField) {
        super(drawField);
    }

    @Override
    public void handleDrawing() {
        drawField.getPane().setOnMousePressed(event -> {

            Line line = new Line(event.getX(), event.getY(), drawField.getColor());
            draw(line);

            drawField.getPane().setOnMouseDragged(event1 -> {
                line.setEndPoint(event1.getX(), event1.getY());
                redraw(line);
            });
        });
    }
}

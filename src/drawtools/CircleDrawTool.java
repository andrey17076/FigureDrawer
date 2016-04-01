package drawtools;

import shapes.Circle;
import shapes.DrawField;
import shapes.Point;

public class CircleDrawTool extends DrawTool {

    public CircleDrawTool(DrawField drawField) {
        super(drawField);
    }

    @Override
    public void handleDrawing() {
        drawField.getPane().setOnMousePressed(event -> {

            Circle circle = new Circle(event.getX(), event.getY(), drawField.getColor());
            draw(circle);

            drawField.getPane().setOnMouseDragged(event1 -> {
                Point center = circle.getCenter();
                circle.setRadius(Math.sqrt(
                        Math.pow(center.x - event1.getX(), 2) + Math.pow(center.y - event1.getY(), 2))
                );
                redraw(circle);
            });
        });
    }
}

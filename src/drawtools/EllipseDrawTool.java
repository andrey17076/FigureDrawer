package drawtools;

import shapes.DrawField;
import shapes.Ellipse;
import shapes.Point;

public class EllipseDrawTool extends DrawTool {

    public EllipseDrawTool(DrawField drawField) {
        super(drawField);
    }

    @Override
    public void handleDrawing() {
        drawField.getPane().setOnMousePressed(event -> {

            Ellipse ellipse= new Ellipse(event.getX(), event.getY(), drawField.getColor());
            draw(ellipse);

            drawField.getPane().setOnMouseDragged(event1 -> {
                Point center = ellipse.getCenter();
                ellipse.setHorizontalRadius(Math.abs(center.x - event1.getX()));
                ellipse.setVerticalRadius(Math.abs(center.y - event1.getY()));
                redraw(ellipse);
            });
        });
    }
}

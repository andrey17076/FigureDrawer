package drawtools;

import javafx.scene.input.MouseButton;
import shapes.DrawField;
import shapes.Polygon;

public class PolygonDrawTool extends DrawTool {

    private Polygon polygon;

    public PolygonDrawTool(DrawField drawField) {
        super(drawField);
    }

    @Override
    public void handleDrawing() {
        drawField.getPane().setOnMousePressed(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                polygon = new Polygon(event.getX(), event.getY(), drawField.getColor());
                draw(polygon);

                drawField.getPane().setOnMouseDragged(event1 -> {
                    polygon.setLastPoint(event1.getX(), event1.getY());
                    redraw(polygon);
                });
            }

            if (event.getButton().equals(MouseButton.SECONDARY)) {
                polygon.addPoint(event.getX(), event.getY());
                redraw(polygon);
            }
        });
    }
}

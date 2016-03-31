import javafx.scene.input.MouseButton;

public class PolygonDrawTool extends DrawTool {

    private Polygon polygon;

    public PolygonDrawTool(DrawField drawField) {
        super(drawField);
    }

    @Override
    public void handleDrawing() {
        this.getDrawField().getPane().setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                polygon = new Polygon(event.getX(), event.getY(), this.getDrawField().getColor());
                this.getDrawField().add(polygon);

                this.getDrawField().getPane().setOnMouseDragged(event1 -> {
                    polygon.setLastPoint(event1.getX(), event1.getY());
                    this.getDrawField().removeLast();
                    this.getDrawField().add(polygon);
                });
            }

            if (event.getButton().equals(MouseButton.SECONDARY)) {
                polygon.addPoint(event.getX(), event.getY());
                this.getDrawField().removeLast();
                this.getDrawField().add(polygon);
            }
        });
    }
}

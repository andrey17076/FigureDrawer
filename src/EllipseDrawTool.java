public class EllipseDrawTool extends DrawTool {

    public EllipseDrawTool(DrawField drawField) {
        super(drawField);
    }

    @Override
    public void handleDrawing() {
        this.getDrawField().getPane().setOnMousePressed(event -> {
            Ellipse ellipse= new Ellipse(event.getX(), event.getY());
            this.getDrawField().add(ellipse);
            this.getDrawField().getPane().setOnMouseDragged(event1 -> {
                Point center = ellipse.getCenter();
                ellipse.setHorizontalRadius(Math.abs(center.x - event1.getX()));
                ellipse.setVerticalRadius(Math.abs(center.y - event1.getY()));
                this.getDrawField().removeLast();
                this.getDrawField().add(ellipse);
            });
        });
    }
}

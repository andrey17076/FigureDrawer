public class CircleDrawTool extends DrawTool{

    public CircleDrawTool(DrawField drawField) {
        super(drawField);
    }

    @Override
    public void handleDrawing() {
        this.getDrawField().getPane().setOnMousePressed(event -> {
            Circle circle = new Circle(event.getX(), event.getY(), this.getDrawField().getColor());
            this.getDrawField().add(circle);
            this.getDrawField().getPane().setOnMouseDragged(event1 -> {
                Point center = circle.getCenter();
                circle.setRadius(Math.sqrt(
                        Math.pow(center.x - event1.getX(), 2) + Math.pow(center.y - event1.getY(), 2))
                );
                redraw(circle);
            });
        });
    }
}

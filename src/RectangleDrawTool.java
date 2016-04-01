public class RectangleDrawTool extends DrawTool{
    public RectangleDrawTool(DrawField drawField) {
        super(drawField);
    }

    @Override
    public void handleDrawing() {
        this.getDrawField().getPane().setOnMousePressed(event -> {
            Rectangle rectangle = new Rectangle(event.getX(), event.getY(), this.getDrawField().getColor());
            this.getDrawField().add(rectangle);
            this.getDrawField().getPane().setOnMouseDragged(event1 -> {
                rectangle.setOppositePoint(event1.getX(), event1.getY());
                this.getDrawField().removeLast();
                this.getDrawField().add(rectangle);
            });
        });
    }
}

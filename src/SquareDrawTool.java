public class SquareDrawTool extends DrawTool{
    public SquareDrawTool(DrawField drawField) {
        super(drawField);
    }

    @Override
    public void handleDrawing() {
        this.getDrawField().getPane().setOnMousePressed(event -> {
            Square square = new Square(event.getX(), event.getY(), this.getDrawField().getColor());
            this.getDrawField().add(square);
            this.getDrawField().getPane().setOnMouseDragged(event1 -> {
                square.setOppositePoint(event1.getX(), event1.getY());
                redraw(square);
            });
        });
    }
}

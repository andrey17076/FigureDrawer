public class LineDrawTool extends DrawTool {

    public LineDrawTool(DrawField drawField) {
        super(drawField);
    }

    @Override
    public void handleDrawing() {
        this.getDrawField().getPane().setOnMousePressed(event -> {
            Line line= new Line(event.getX(), event.getY(), this.getDrawField().getColor());
            this.getDrawField().add(line);
            this.getDrawField().getPane().setOnMouseDragged(event1 -> {
                line.setEndPoint(event1.getX(), event1.getY());
                this.getDrawField().removeLast();
                this.getDrawField().add(line);
            });
        });
    }
}

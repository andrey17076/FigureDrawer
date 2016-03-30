public abstract class DrawTool {
    private DrawField drawField;

    public DrawTool(DrawField drawField) {
        this.drawField = drawField;
    }

    public DrawField getDrawField() {
        return drawField;
    }

    public abstract void handleDrawing();
}

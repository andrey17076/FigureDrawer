package shapes;

import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

public class DrawField {
    private static Pane pane;
    private static ColorPicker colorPicker;
    private static int shapesCount = 0;

    public DrawField() {
        pane = new Pane();
        pane.setPadding(new Insets(20));
        pane.setStyle("-fx-background-color: white");
        pane.setMinWidth(Region.USE_COMPUTED_SIZE);

        colorPicker = new ColorPicker(Color.YELLOWGREEN);
        colorPicker.setMinWidth(140);
    }

    public Pane getPane() {
        return pane;
    }

    public Color getColor() {
        return colorPicker.getValue();
    }

    public ColorPicker getColorPicker() {
        return colorPicker;
    }

    public void add(Shape shape) {
        pane.getChildren().add(shapesCount++, shape.getRawShape());
    }

    public void removeLast() {
        pane.getChildren().remove(--shapesCount);
    }
}
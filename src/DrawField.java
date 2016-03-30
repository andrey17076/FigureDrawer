import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

public class DrawField {
    private static Pane pane;
    private static int shapesCount = 0;

    public DrawField() {
        pane = new Pane();
        pane.setPadding(new Insets(20));
        pane.setStyle("-fx-background-color: white");
        pane.setMinWidth(Region.USE_COMPUTED_SIZE);
    }

    public Pane getPane() {
        return pane;
    }

    public void add(Shape shape) {
        pane.getChildren().add(shapesCount++, shape.getRawShape());
    }

    public void removeLast() {
        pane.getChildren().remove(--shapesCount);
    }
}
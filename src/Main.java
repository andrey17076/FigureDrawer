import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Main extends Application{
//        Polygon polygon = new Polygon();
//        polygon.addPoint(new Point(500, 250));
//        polygon.addPoint(new Point(550, 200));
//        polygon.addPoint(new Point(600, 250));
//        Rectangle rectangle = new Rectangle(new Point(10, 400), 50, 100);
//        Square square = new Square(new Point(300, 400), 100);

    @Override
    public void start(Stage primaryStage) throws Exception {
        //DrawField
        DrawField drawField = new DrawField();

        //Buttons
        Hashtable<String, Button> buttons = new Hashtable<>();
        List<String> buttonNames = Arrays.asList("Ellipse", "Circle", "Line", "Polygon", "Rectangle", "Square");
        buttonNames.forEach(buttonName -> buttons.put(buttonName, new Button(buttonName)));

        buttons.get("Ellipse").setOnMouseClicked(event -> new EllipseDrawTool(drawField).handleDrawing());
        buttons.get("Circle").setOnMouseClicked(event -> new CircleDrawTool(drawField).handleDrawing());
        buttons.get("Line").setOnMouseClicked(event -> new LineDrawTool(drawField).handleDrawing());
        buttons.get("Polygon").setOnMouseClicked(event -> new PolygonDrawTool(drawField).handleDrawing());

        //Shape Panel
        VBox shapePanel = new VBox();
        shapePanel.setMaxWidth(140);
        shapePanel.setPadding(new Insets(10));
        shapePanel.setSpacing(10);
        shapePanel.getChildren().add(drawField.getColorPicker());

        //Put button on shape panel
        buttons.values().forEach(button -> {
            button.setMinWidth(140);
            shapePanel.getChildren().add(button);
        });

        //Main Layout
        SplitPane mainLayout = new SplitPane();
        mainLayout.setDividerPositions(Region.USE_COMPUTED_SIZE);
        mainLayout.getItems().addAll(shapePanel, drawField.getPane());

        //Primary Stage
        Scene scene = new Scene(mainLayout, 800, 600);
        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(300);
        primaryStage.setTitle("DrawField");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
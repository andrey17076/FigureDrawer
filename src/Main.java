import javafx.application.Application;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;

public class Main extends Application{
    private static Drawer figuresShapes = new Drawer();

    static {
        Line line = new Line(new Point(50, 50), new Point(100, 100));
        figuresShapes.add(line);

        Ellipse ellipse = new Ellipse(new Point(200, 200), 50, 100);
        figuresShapes.add(ellipse);

        Circle circle = new Circle(new Point(300, 300), 50);
        circle.setColor(Color.blue);
        figuresShapes.add(circle);

        Polygon polygon = new Polygon();
        polygon.addPoint(new Point(500, 250));
        polygon.addPoint(new Point(550, 200));
        polygon.addPoint(new Point(600, 250));
        polygon.addPoint(new Point(600, 300));
        polygon.addPoint(new Point(550, 300));
        polygon.setColor(Color.green);
        figuresShapes.add(polygon);

        Rectangle rectangle = new Rectangle(new Point(10, 400), 50, 100);
        rectangle.setColor(Color.red);
        figuresShapes.add(rectangle);

        Square square = new Square(new Point(300, 400), 100);
        figuresShapes.add(square);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Drawer");
        SplitPane mainLayout = new SplitPane();
        mainLayout.setDividerPositions(Region.USE_COMPUTED_SIZE);

        VBox figurePanel = new VBox();
        figurePanel.setPadding(new Insets(10));
        figurePanel.setSpacing(10);
        Hashtable<String, Button> buttons = new Hashtable<>();
        buttons.put("Ellipse", new Button());
        buttons.put("Circle", new Button());
        buttons.put("Line", new Button());
        buttons.put("Polygon", new Button());
        buttons.put("Rectangle", new Button());
        buttons.put("Square", new Button());

        buttons.keySet().forEach(key -> buttons.get(key).setText(key));
        buttons.values().forEach(value -> {
            value.setMinWidth(140);
            figurePanel.getChildren().add(value);
        });

        ColorPicker colorPicker = new ColorPicker();
        colorPicker.setMinWidth(140);
        figurePanel.getChildren().add(colorPicker);

        figurePanel.setMaxWidth(140);
        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(300);

        Pane drawField = new Pane();
        drawField.setStyle("-fx-background-color: white");
        drawField.setMinWidth(Region.USE_COMPUTED_SIZE);

        mainLayout.getItems().addAll(figurePanel, drawField);
        Scene scene = new Scene(mainLayout, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
//        JFrame mainWindow = new JFrame("FigureDrawer");
//        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        mainWindow.add(figuresShapes);
//        mainWindow.setSize(800, 600);
//        mainWindow.setVisible(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
import javax.swing.*;
import java.awt.*;

public class Main {
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

    public static void main(String[] args) {
        JFrame mainWindow = new JFrame("FigureDrawer");
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.add(figuresShapes);
        mainWindow.setSize(800, 600);
        mainWindow.setVisible(true);
    }
}
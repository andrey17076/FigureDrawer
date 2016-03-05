import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Drawer extends JPanel{
    private ArrayList<Figure> figureList = new ArrayList<>();

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        for (Figure figure : figureList) {
            g.setColor(figure.getColor());
            figure.draw(g);
        }
    }
    public void add(Figure f) {
        figureList.add(f);
    }
}
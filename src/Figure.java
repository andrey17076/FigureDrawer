import java.awt.*;

public abstract class Figure {
    private Color color;

    public Figure(){
        this.color = Color.black;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public abstract void draw(Graphics g);
}

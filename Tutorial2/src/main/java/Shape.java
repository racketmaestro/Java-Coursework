import java.awt.*;


public class Shape {
    protected Point coordinates;
    protected Color color;

    public Shape(Point coordinates, Color color) {
        this.coordinates = coordinates;
        this.color = color;
    }

    public void draw(Graphics g) {
    }
}

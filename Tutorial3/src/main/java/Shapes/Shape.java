package Shapes;

import java.awt.*;

interface Drawable{
    void draw(Graphics g);
}
public class Shape implements Drawable{
    protected Point coordinates;
    protected Color color;

    public Shape(Point coordinates, Color color) {
        this.coordinates = coordinates;
        this.color = color;
    }

    public void draw(Graphics g) {
    }
}

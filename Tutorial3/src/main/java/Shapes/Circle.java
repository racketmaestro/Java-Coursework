package Shapes;

import java.awt.*;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius, Point coordinates, Color color) {
        super(coordinates, color);
        this.radius = radius;
    }
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(coordinates.x, coordinates.y, radius, radius);
    }

}

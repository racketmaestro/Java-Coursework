package Shapes;

import Shapes.Shape;

import java.awt.*;

public class Rect extends Shape {

    private int width;
    private int height;

    public Rect(int width, int height, Point coordinates, Color color) {
        super(coordinates, color); // refer to the superclass Shapes.Shape
        // super is passing the coordinates and color parameters
        // received by the Shapes.Rect constructor
        // to the Shapes.Shape constructor.
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(coordinates.x, coordinates.y, width, height);
    }
}

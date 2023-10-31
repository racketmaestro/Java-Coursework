package shapes;

import java.awt.*;

public class Square extends Shape{

    private int length;

    public Square(int length, Point coordinates, Color color) {
        super(coordinates, color); // refer to the superclass shapes.Shape
        // super is passing the coordinates and color parameters
        // received by the shapes.Rect constructor
        // to the shapes.Shape constructor.
        this.length = length;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(coordinates.x, coordinates.y, length, length);
    }
}

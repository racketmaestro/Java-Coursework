package shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    public ArrayList<Shape> shapes = new ArrayList<shapes.Shape>();

    void addCircle(Circle circle) {
        shapes.add(circle);
    }
    void addRectangle(Rect rectangle) {
        shapes.add(rectangle);
    }
    void addSquare(Square square) {
        shapes.add(square);
    }

    void drawShapes(Graphics g) {
        for(Shape shape:shapes) {
            shape.draw(g);
        }
    }


}

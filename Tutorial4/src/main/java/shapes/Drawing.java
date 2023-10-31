package shapes;

import shapes.Circle;
import shapes.Rect;
import shapes.Shape;

import java.awt.*;
import java.util.ArrayList;


public class Drawing extends Canvas {

    private ShapeDB shapeDB;

    public Drawing(ShapeDB shapeDB) {
        this.shapeDB = shapeDB;
    }

    public void paint(Graphics g) {
        shapeDB.drawShapes(g);
    }
    // Methods in Drawing that call the appropriate method in ShapeDB
    public void addCircleToDB(Circle circle) {
        shapeDB.addCircle(circle);
    }

    public void addRectToDB(Rect rectangle) {
        shapeDB.addRectangle(rectangle);
    }

    public void addSquareToDB(Square square) {
        shapeDB.addSquare(square);
    }

}

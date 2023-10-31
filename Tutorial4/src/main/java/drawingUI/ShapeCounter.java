package drawingUI;

import shapes.Circle;
import shapes.Rect;
import shapes.ShapeDB;
import shapes.Square;

import javax.swing.*;
import java.awt.*;

public class ShapeCounter extends JPanel {
    private JLabel circleCountLabel;
    private JLabel rectCountLabel;
    private JLabel squareCountLabel;
    private ShapeDB shapeDB;

    public ShapeCounter(ShapeDB shapeDB) {
        this.shapeDB = shapeDB;
        this.setLayout(new GridLayout(3,1));
        circleCountLabel = new JLabel("Circles: " + getCircleCount());
        rectCountLabel = new JLabel("Rectangles: " + getRectCount());
        squareCountLabel = new JLabel("Squares: " + getSquareCount());

        add(circleCountLabel);
        add(rectCountLabel);
        add(squareCountLabel);
    }

    private int getCircleCount() {
        return (int) shapeDB.shapes.stream().filter(s -> s instanceof Circle).count();
    }

    private int getRectCount() {
        return (int) shapeDB.shapes.stream().filter(s -> s instanceof Rect).count();
    }

    private int getSquareCount() {
        return (int) shapeDB.shapes.stream().filter(s -> s instanceof Square).count();
    }

    public void updateCounters() {
        circleCountLabel.setText("Circles: " + getCircleCount());
        rectCountLabel.setText("Rectangles: " + getRectCount());
        squareCountLabel.setText("Squares: " + getSquareCount());
    }
}


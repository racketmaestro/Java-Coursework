import Shapes.Circle;
import Shapes.Rect;
import Shapes.Shape;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

class DrawingCanvas extends Canvas {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private ControlPanel controlPanel;  // Reference to the control panel

    public DrawingCanvas(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;

        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(400, 400));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Get the selected color, shape, and size from the control panel
                Color color = controlPanel.getSelectedColor();
                String shapeType = controlPanel.getSelectedShape();
                int size = controlPanel.getSelectedSize();

                // Add a shape to the list based on the selected values
                if ("Circle".equals(shapeType)) { // use .equals to compare string content in Java.
                    // == operator should only be used when you want to compare object references,
                    // not their content.
                    shapes.add(new Circle(size, e.getPoint(), color));
                } else if ("Square".equals(shapeType)) {
                    // Assuming the size is used as both width and height for simplicity
                    shapes.add(new Rect(size, size, e.getPoint(), color));
                }

                repaint();  // Redraw the canvas to show the new shape
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        for (Shapes.Shape shape : shapes) {
            shape.draw(g);
        }
    }
}


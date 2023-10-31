package drawingUI;
import shapes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class DrawingUIController {
    // Field initialization. Use field initialization when you want to set a default
    // value for a field that doesn't depend on external factors.
    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    ShapeSelector sSel = new ShapeSelector();
    ColourSelector cSel = new ColourSelector();
    CircleDimsSelector circleDimSel = new CircleDimsSelector();
    SquareDimsSelector squareDimSel = new SquareDimsSelector();
    RectDimsSelector rectDimsSelector = new RectDimsSelector();
    ShapeDB shapeDB = new ShapeDB();
    Drawing drawing = new Drawing(shapeDB);
    ShapeCounter shapeCounter = new ShapeCounter(shapeDB);

    public DrawingUIController() {

        // Use constructor initialization when the initial value of a field depends
        // on some parameters or other dynamic factors at the time of object creation.
        controlsPanel.setLayout(new GridLayout(3,1));
        mainPanel.setLayout(new GridLayout(2,1));
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(circleDimSel);
        controlsPanel.add(squareDimSel);
        controlsPanel.add(rectDimsSelector);
        controlsPanel.add(shapeCounter);

        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
                Point clickedPoint = e.getPoint();  // Get the point of the mouse click
                String selectedShape = sSel.getSelectedShape();
                Color selectedColour = cSel.getCurrentColour();

                if ("Circle".equals(selectedShape)){
                    int radius = circleDimSel.getCurrentRadius();
                    Circle circle = new Circle(radius, clickedPoint, selectedColour);
                    drawing.addCircleToDB(circle);
                } else if ("Square".equals(selectedShape)) {
                    int length = squareDimSel.getCurrentLength();
                    Square square = new Square(length, clickedPoint, selectedColour);
                    drawing.addSquareToDB(square);
                } else if ("Rectangle".equals(selectedShape)) {
                    int[] dimensions = rectDimsSelector.getCurrentDim();
                    Rect rect = new Rect(dimensions[0],dimensions[1],clickedPoint, selectedColour);
                    drawing.addRectToDB(rect);
                }
                  // Add the circle to the Drawing's shapes
                drawing.repaint();  // Repaint to show the new circle
                shapeCounter.updateCounters();
                System.out.println("mouse clicked");
            }
            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        mainPanel.add(drawing);
        mainPanel.add(controlsPanel);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}

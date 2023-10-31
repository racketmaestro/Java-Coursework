import drawingUI.DrawingUIController;
import shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    static GraphicsConfiguration gc;

    public static void main(String[] args) {
        JFrame frame = new JFrame(gc);    // Create a new JFrame
        frame.setSize(500, 600);

        DrawingUIController drawingUIController = new DrawingUIController();
        frame.add(drawingUIController.getMainPanel());
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }
}


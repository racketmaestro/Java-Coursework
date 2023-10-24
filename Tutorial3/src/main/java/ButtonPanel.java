import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    public ButtonPanel() {
        setLayout(new BorderLayout());

        // Create a top panel to hold button and controlPanel
        JPanel topPanel = new JPanel(new FlowLayout());

        // Create button, controlPanel, and drawingCanvas
        JButton button = new JButton("Press Here");
        ControlPanel controlPanel = new ControlPanel();
        DrawingCanvas drawingCanvas = new DrawingCanvas(controlPanel);

        // Add button and controlPanel to topPanel
        topPanel.add(button);
        topPanel.add(controlPanel);

        // Add topPanel to the NORTH region and drawingCanvas to the CENTER region
        add(topPanel, BorderLayout.NORTH);
        add(drawingCanvas, BorderLayout.CENTER);
    }
}


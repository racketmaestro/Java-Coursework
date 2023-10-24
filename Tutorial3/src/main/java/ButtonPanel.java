import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    public ButtonPanel() {
        JButton button = new JButton("Press Here");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("button pressed");
            }
        });
        ControlPanel controlPanel = new ControlPanel();
        DrawingCanvas drawingCanvas = new DrawingCanvas(controlPanel);
        this.setLayout(new GridLayout(1,2));

        this.add(controlPanel);
        this.add(drawingCanvas);
    }
}

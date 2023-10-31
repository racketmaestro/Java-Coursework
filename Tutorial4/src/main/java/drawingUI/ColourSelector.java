package drawingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColourSelector extends JPanel {
    Color currentColour;
    public ColourSelector() {
        currentColour = Color.black;
        JButton btn1 = new JButton("Colour");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColour = JColorChooser.showDialog(
                        btn1, "Choose Colour", currentColour);
                currentColour=newColour;
                btn1.setBackground(currentColour);
            }
        });

        this.add(btn1);
    }

    public Color getCurrentColour() {
        return currentColour;
    }
}

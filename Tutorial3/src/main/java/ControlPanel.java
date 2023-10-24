import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private JSlider redSlider, greenSlider, blueSlider, sizeSlider;
    private JComboBox<String> shapeSelector;

    public ControlPanel() {
        setLayout(new GridLayout(7, 1)); // 7 rows for components

        // RGB Sliders with labels
        redSlider = new JSlider(0, 255);
        greenSlider = new JSlider(0, 255);
        blueSlider = new JSlider(0, 255);

        addLabeledSlider("Red:", redSlider);
        addLabeledSlider("Green:", greenSlider);
        addLabeledSlider("Blue:", blueSlider);

        // Shapes.Shape selector dropdown
        String[] shapes = {"Circle","Square"};
        shapeSelector = new JComboBox<>(shapes);
        add(shapeSelector);

        // Size slider with label
        sizeSlider = new JSlider(10, 100);
        addLabeledSlider("Size:", sizeSlider);
    }

    private void addLabeledSlider(String labelText, JSlider slider) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel(labelText);
        panel.add(label, BorderLayout.WEST);
        panel.add(slider, BorderLayout.CENTER);
        add(panel);
    }

    // Getter methods to access the selected values
    public Color getSelectedColor() {
        return new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue());
    } // Returns a Color class, not an array!! Color class takes 3 values for R G B

    public String getSelectedShape() {
        return (String) shapeSelector.getSelectedItem();
    }

    public int getSelectedSize() {
        return sizeSlider.getValue();
    }
}


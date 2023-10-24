import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private JSlider redSlider, greenSlider, blueSlider, sizeSlider;
    private JComboBox<String> shapeSelector;

    public ControlPanel() {
        setLayout(new GridLayout(8, 1)); // 8 components (3 RGB labels, 3 RGB sliders, 1 shape selector, 1 size slider)

        // RGB Sliders with labels
        redSlider = new JSlider(0, 255);
        greenSlider = new JSlider(0, 255);
        blueSlider = new JSlider(0, 255);

        JLabel redLabel = new JLabel("Red:");
        JLabel greenLabel = new JLabel("Green:");
        JLabel blueLabel = new JLabel("Blue:");

        // Shape selector dropdown
        String[] shapes = {"Circle","Square"};
        shapeSelector = new JComboBox<>(shapes);

        // Size slider with label
        sizeSlider = new JSlider(10, 100);
        JLabel sizeLabel = new JLabel("Size:");

        // Add components to the panel
        add(redLabel);
        add(redSlider);

        add(greenLabel);
        add(greenSlider);

        add(blueLabel);
        add(blueSlider);

        add(shapeSelector);

        add(sizeLabel);
        add(sizeSlider);
    }

    // Getter methods to access the selected values
    public Color getSelectedColor() {
        return new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue());
    }

    public String getSelectedShape() {
        return (String) shapeSelector.getSelectedItem();
    }

    public int getSelectedSize() {
        return sizeSlider.getValue();
    }
}


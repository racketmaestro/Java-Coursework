package drawingUI;

import javax.swing.*;

public class ShapeSelector extends JPanel {
    private JRadioButton bCirc;
    private JRadioButton bRect;
    private JRadioButton bSquare;

    public ShapeSelector() {
        bCirc = new JRadioButton("Circle");  // Added label for clarity
        bRect = new JRadioButton("Rectangle");
        bSquare = new JRadioButton("Square");

        bCirc.setSelected(true);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(bCirc);
        buttonGroup.add(bRect);
        buttonGroup.add(bSquare);

        this.add(bCirc);
        this.add(bRect);
        this.add(bSquare);
    }

    public String getSelectedShape() {
        if (bCirc.isSelected()) {
            return "Circle";
        } else if (bRect.isSelected()) {
            return "Rectangle";
        } else if (bSquare.isSelected()) {
            return "Square";
        } else {
            return "None";  // or throw an exception or any other desired behavior
        }
    }
}

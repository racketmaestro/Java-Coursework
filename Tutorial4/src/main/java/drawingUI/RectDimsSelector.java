package drawingUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectDimsSelector extends JPanel {
    private JSlider lengthSlider;
    private JSlider widthSlider;
    public RectDimsSelector()    {
        JPanel controls=new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label=new JLabel("Rectangle Dimensions");
        lengthSlider=new JSlider(1,100);
        widthSlider = new JSlider(1,100);
        controls.add(label);
        controls.add(lengthSlider);
        controls.add(widthSlider);
        add(controls);
    }


    public int[] getCurrentDim() {
        int[] dimensions = new int[2];
        dimensions[0] = lengthSlider.getValue();
        dimensions[1] = widthSlider.getValue();
        return dimensions;
    }
}

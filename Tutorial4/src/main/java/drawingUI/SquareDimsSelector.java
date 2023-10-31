package drawingUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareDimsSelector extends JPanel {
    private JSlider dimSlider;
    public SquareDimsSelector()    {
        JPanel controls=new JPanel();
        controls.setLayout(new GridLayout(2,1));
        JLabel label=new JLabel("Square Length");
        dimSlider=new JSlider(1,100);
        controls.add(label);
        controls.add(dimSlider);
        add(controls);
    }


    public int getCurrentLength() {
        return dimSlider.getValue();
    }
}

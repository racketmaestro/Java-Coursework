package drawingUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleDimsSelector extends JPanel {
    private JSlider dimSlider;
    public CircleDimsSelector()    {
        JPanel controls=new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label=new JLabel(" Circle Radius");
        dimSlider=new JSlider(1,100);
        controls.add(label);
        controls.add(dimSlider);
        add(controls);
    }


    public int getCurrentRadius() {
        return dimSlider.getValue();
    }
}

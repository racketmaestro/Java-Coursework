import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) { // specific line that JVM recognises as the entry point to application
        Frame frame=new Frame("My window");
        Drawing drawing = new Drawing();
        frame.add(drawing);
        drawing.setSize(300,300);
        drawing.setBackground(Color.red);

        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}

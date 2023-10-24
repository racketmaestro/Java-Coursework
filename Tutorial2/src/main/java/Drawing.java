import java.awt.*;
import java.util.ArrayList;


public class Drawing extends Canvas {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public Drawing(){
        Circle circle = new Circle(50, new Point(100,100), Color.green );
        Rect rectangle = new Rect(70,30,new Point(40,40),Color.white);
        shapes.add(circle);
        shapes.add(rectangle);
    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(0, 0, 100, 100);

        for(Shape shape:shapes) {
            shape.draw(g);
        }
    }

}

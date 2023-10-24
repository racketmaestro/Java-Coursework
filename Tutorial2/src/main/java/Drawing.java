import java.awt.*;


public class Drawing extends Canvas {

    Circle circle = new Circle(50, new Point(100,100), Color.green );
    Rect rectangle = new Rect(70,30,new Point(40,40),Color.white);
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(0, 0, 100, 100);

        circle.draw(g);
        rectangle.draw(g);
    }

}

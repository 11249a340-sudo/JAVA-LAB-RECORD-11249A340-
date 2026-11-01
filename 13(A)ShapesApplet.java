
import java.applet.Applet;
import java.awt.*;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {

        // Draw Rectangle
        g.drawRect(50, 50, 100, 60);
        g.drawString("Rectangle", 65, 130);

        // Draw Circle
        g.drawOval(200, 50, 70, 70);
        g.drawString("Circle", 215, 140);

        // Draw Line
        g.drawLine(50, 180, 180, 180);
        g.drawString("Line", 100, 200);

        // Draw Triangle
        int x[] = {250, 200, 300};
        int y[] = {170, 250, 250};

        g.drawPolygon(x, y, 3);
        g.drawString("Triangle", 225, 270);
    }
}

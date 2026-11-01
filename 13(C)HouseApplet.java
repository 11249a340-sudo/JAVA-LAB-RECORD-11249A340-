
import java.applet.Applet;
import java.awt.*;

public class HouseApplet extends Applet {
    public void paint(Graphics g) {

        // Draw House Body
        g.setColor(Color.YELLOW);
        g.fillRect(100, 150, 200, 150);

        // Draw Roof
        g.setColor(Color.RED);
        int x[] = {80, 200, 320};
        int y[] = {150, 50, 150};
        g.fillPolygon(x, y, 3);

        // Draw Door
        g.setColor(Color.BLUE);
        g.fillRect(175, 220, 50, 80);

        // Draw Left Window
        g.setColor(Color.WHITE);
        g.fillRect(120, 180, 40, 40);

        // Draw Right Window
        g.fillRect(240, 180, 40, 40);

        // Draw Window Borders
        g.setColor(Color.BLACK);
        g.drawRect(120, 180, 40, 40);
        g.drawRect(240, 180, 40, 40);

        // Display Message
        g.drawString("My House", 170, 330);
    }
}

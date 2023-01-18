import java.awt.*;
import java.awt.event.*;

public class MouseTracker extends Frame implements MouseMotionListener {

    int x = 0;
    int y = 0;

    public MouseTracker() {
        // Add a mouse motion listener to the frame
        addMouseMotionListener(this);

        // Set the size of the frame and make it visible
        setSize(300,300);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        // Update the mouse coordinates when the mouse is dragged
        x = e.getX();
        y = e.getY();

        // Redraw the frame
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        // Update the mouse coordinates when the mouse is moved
        x = e.getX();
        y = e.getY();

        // Redraw the frame
        repaint();
    }

    public void paint(Graphics g) {
        // Draw the mouse coordinates
        Image img2 = Toolkit.getDefaultToolkit().getImage("Board Layout.jpg"); /*the image cannot be in the SRC folder*/
        g.drawImage(img2, 0, 0, 600, 600 , this);
        g.drawString("Mouse Coordinates: (" + x + ", " + y + ")", 650, 50);
    }

    public static void main(String[] args) {
        new MouseTracker();
    }
}

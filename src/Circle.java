import java.awt.*;

public class Circle {
    private int x;
    private int y;
    private int radius;
    private Color col;

    public Circle(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.col = color;
    }

    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
    public void draw(Graphics g) {
        g.drawOval(x, y, radius, radius);
        g.fillOval(x, y, radius, radius);
        g.setColor(col);
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}

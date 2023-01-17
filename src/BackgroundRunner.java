import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BackgroundRunner extends JPanel {

	private BackgroundRunner panel;
	private Circle red, blue, green, yellow, black;
	private Image backgroundImage;

	public BackgroundRunner() {
		try {
			backgroundImage = ImageIO.read(new File("Board Layout.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		red = new Circle(600, 600, 0,Color.red);
		blue = new Circle(32, 525, 40,Color.blue);

		yellow = new Circle(32, 525, 40,Color.yellow);
		green = new Circle(32, 525, 40,Color.green);
		black = new Circle(32,525,40,Color.BLACK);


	}


	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, 600, 600, this);
		red.draw(g);
		blue.draw(g);
		yellow.draw(g);
		green.draw(g);
		black.draw(g);
	}

	public static void main(String[] args) throws InterruptedException {

	}


	public static void redMove(BackgroundRunner panel){
		while (panel.blue.getx() < 525) {
			panel.blue.move(1, 0);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.blue.gety() > 34) {
			panel.blue.move(0, -1);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.blue.getx() > 32) {
			panel.blue.move(-1, 0);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.blue.gety() < 525) {
			panel.blue.move(0, 1);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void blueMove(BackgroundRunner panel){
		while (panel.yellow.getx() < 525) {
			panel.yellow.move(1, 0);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.yellow.gety() > 34) {
			panel.yellow.move(0, -1);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.yellow.getx() > 32) {
			panel.yellow.move(-1, 0);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.yellow.gety() < 525) {
			panel.yellow.move(0, 1);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void yellowMove(BackgroundRunner panel){
		while (panel.green.getx() < 525) {
			panel.green.move(1, 0);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.green.gety() > 34) {
			panel.green.move(0, -1);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.green.getx() > 32) {
			panel.green.move(-1, 0);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.green.gety() < 525) {
			panel.green.move(0, 1);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void greenMove(BackgroundRunner panel){
		while (panel.black.getx() < 525) {
			panel.black.move(1, 0);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.black.gety() > 34) {
			panel.black.move(0, -1);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.black.getx() > 32) {
			panel.black.move(-1, 0);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.black.gety() < 525) {
			panel.black.move(0, 1);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void drawImage( Graphics window){
		Image img2 = Toolkit.getDefaultToolkit().getImage("Board Layout.jpg"); /*the image cannot be in the SRC folder*/
		window.drawImage(img2, 0, 0, 600, 600 , this);
	}



}

//			panel.drawImage(frame.getGraphics());





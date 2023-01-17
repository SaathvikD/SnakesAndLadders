import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class Background extends JPanel
{
	public void paintComponent( Graphics window )
	{
		boolean a = true;
		Scanner keyboard = new Scanner( System.in );
		Graphics2D g2 = (Graphics2D) window;
		Image img2 = Toolkit.getDefaultToolkit().getImage("Board Layout.jpg"); /*the image cannot be in the SRC folder*/
		g2.drawImage(img2, 0, 0, 600, 600 , this);

	}
}
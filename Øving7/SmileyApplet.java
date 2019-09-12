import java.awt.*;
import javax.swing.*;


public class SmileyApplet extends JApplet {
	public void init() {
		add(new Tegning());
	}
}

class Tegning extends JPanel {
	public void paintComponent(Graphics tegneflate) {
		super.paintComponent(tegneflate);
		Font skrift = new Font("SansSerif", Font.BOLD,15);
		tegneflate.setFont(skrift);
		tegneflate.drawString("Smiley:",105,20);
		setBackground(Color.WHITE);
		tegneflate.setColor(Color.YELLOW);
		tegneflate.fillOval(40,30,180,180); //X, Y, bredde, høyde //HODET
		tegneflate.setColor(Color.BLACK);
		tegneflate.fillOval(80,70,25,20); //Øye 1
		tegneflate.fillOval(160,70,25,20); // Øye 2
		tegneflate.drawArc(90, 120, 80, 60, 0, -180); //int x, int y , int width, int height, int start angle, int arcangle
	}
}
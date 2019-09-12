import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;

class Vindu extends JFrame {
	public Vindu(String tittel) {
		setTitle(tittel);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tegning tegningen = new Tegning();
		add(tegningen);
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
		//tegneflate.fillRect(120,120, 20,20);
		tegneflate.drawLine(120,135,135,135);
		tegneflate.drawLine(120,135,128,120);
		tegneflate.drawLine(128,120,135,135);
		tegneflate.drawArc(90, 120, 80, 60, 0, -180); //int x, int y , int width, int height, int start angle, int arcangle
	}
}

class Smiley {
	public static void main(String[] args) {
		Vindu etVindu = new Vindu("Smiley");
		etVindu.setVisible(true);
	}
}
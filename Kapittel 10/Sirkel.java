import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Vindu extends JFrame {
	public Vindu(String tittel) {
		setTitle(tittel);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tegning tegningen = new Tegning();
		add(tegningen);
	}
}

class Tegning extends JPanel {
	public void paintComponent(Graphics tegneflate) {
		super.paintComponent(tegneflate);
		setBackground(Color.white);
		tegneflate.setColor(Color.red);
		tegneflate.drawOval(40,30,165,85);
		tegneflate.setColor(Color.gray);
		tegneflate.drawString("Her er løsningen", 75,75);
	}
}

class Sirkel {
	public static void main(String[] args) {
		Vindu etVindu = new Vindu("Smiley");
		etVindu.setVisible(true);
	}
}
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Vindu extends JFrame {
  public Vindu(String tittel) {
    setTitle(tittel);
    setSize(200,120);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Tegning tegningen = new Tegning();
    add(tegningen);
  }
}

class Tegning extends JPanel {
  public void paintComponent(Graphics tegneflate) {
    super.paintComponent(tegneflate);
    setBackground(Color.ORANGE);
    tegneflate.drawString("Hei hei", 50,50);
    tegneflate.drawOval(40,30,55,40);
  }
}


}
class GrafikkEksempel {
  public static void main(String[] args) {
    Vindu etVindu = new Vindu("Enkel grafikK");
    etVindu.setVisible(true);
  }
}

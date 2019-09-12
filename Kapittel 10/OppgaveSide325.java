import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Vindu extends JFrame {
  public Vindu(String tittel) {
    setTitle(tittel);
    setSize(200,120);C:\Programmering\Kapittel 10\FargeDemo.java
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Tegning tegningen = new Tegning();
    add(tegningen);
  }C:\Programmering\Kapittel 10\FargeDemo.java
}

class Tegning extends JPanel {
  public void paintComponent(Graphics tegneflate) {
    super.paintComponent(tegneflate);
    setBackground(Color.WHITE);
    tegneflate.drawString("Her er løsningen", 50,50);
    tegneflate.drawRect(40,40,200,150);
  }
}



class OppgaveSide325 {
  public static void main(String[] args) {
      Vindu etVindu = new Vindu("Svar");
      etVindu.setVisible(true);
  }

}

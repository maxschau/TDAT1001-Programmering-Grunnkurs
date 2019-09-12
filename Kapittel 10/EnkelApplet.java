import javax.swing.*;
import java.awt.*;

public class EnkelApplet extends JApplet {
  public void init() {
    add(new Tegning());
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

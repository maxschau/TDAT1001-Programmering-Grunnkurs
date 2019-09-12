
import java.util.Random;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxto
 */
public class testing123 {
    public static void main(String[] args) {
    String navnLest = showInputDialog("Skriv inn et navn");
    showMessageDialog(null, "Du skrev inn " + navnLest + "!");
    Random tilf = new Random();
    for (int i = 0; i < 15; i++) {
    showMessageDialog(null, tilf.nextInt(10) + 1);
    }
    }
    
}

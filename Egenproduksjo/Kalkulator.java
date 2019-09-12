import static javax.swing.JOptionPane.*;

class Kalkulator {
  public static void main(String[]args) {
      String tallLest = showInputDialog("Skriv inn tall");
      int tall1 = Integer.parseInt(tallLest);

      String tallLest2 = showInputDialog("Skriv inn tall");
      int tall2 = Integer.parseInt(tallLest2);

      int sum = tall1 + tall2;

      System.out.println(tall1 + " + " + tall2 + " = " + sum);




  }
}

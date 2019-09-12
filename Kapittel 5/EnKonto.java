import static javax.swing.JOptionPane.*;

class EnKonto {
  public static void main(String[] args) {

    /* Vi oppretter et objekt av klassen Konto. Objektet heter olesKonto */
    Konto olesKonto = new Konto(123456676756L, "Ole Olsen", 2300.50);
    //olesKonto.utførTransaksjon(1000.0); //Setter inn 1000 kroner
    //double saldo = olesKonto.getSaldo();
    //System.out.println("Etter innskudd er saldoen lik: " + saldo);

    String tallLest = showInputDialog("Skriv inn beløp");

    while (tallLest != null) {
		double tall = Double.parseDouble(tallLest);
		olesKonto.utførTransaksjon(tall);
		double saldo = olesKonto.getSaldo();
		if (saldo >= 0) {
			showMessageDialog(null, "Den nye saldoen er: " + saldo);
		} else {
			showMessageDialog(null, "Saldoen er negativ. Den er totalt: " + saldo);
		}

		tallLest = showInputDialog("Skriv inn beløp");
	}





  }
}
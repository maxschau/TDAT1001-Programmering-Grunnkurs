import static javax.swing.JOptionPane.*;
class Lonnsberegning {
	public static void main(String[]args) {
	Ansatt enAnsatt = new Ansatt(12345, "Anne Vik", 400);
	String antTimerLest = showInputDialog("Antall timer, avslutt med Esc: ");

	while (antTimerLest != null) {
		double antTimer = Double.parseDouble(antTimerLest);
		double bruttol�nn = enAnsatt.beregnBruttol�nn(antTimer);
		String utskrift = "Antall timer: " + antTimer + " gir bruttol�nn: " + bruttol�nn;
		double skatt = enAnsatt.beregnSkattetrekk(antTimer);
		utskrift += (" og skattetrekk: " + skatt);
		showMessageDialog(null, utskrift);
		antTimerLest= showInputDialog("Antall timer, avslutt med esc");


	}//While

	}//main
}//class
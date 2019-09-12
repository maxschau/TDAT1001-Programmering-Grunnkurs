import static javax.swing.JOptionPane.*;

class Arealberegning3 {
	public static void main(String[]args) {
	String lengdeLest = showInputDialog("Skriv inn lengden");
	String breddeLest = showInputDialog("Skriv inn bredden");
		double lengde = Double.parseDouble(lengdeLest);
		double bredde = Double.parseDouble(breddeLest);


	if(lengde > 0.0 && bredde > 0.0) {
	double areal = lengde * bredde;
	showMessageDialog(null, "Arealet er " + areal + " kvadratmeter.");
	}else {
	showMessageDialog(null, "Du har skrevet inn ugyldige verdier");
		}
	}
}
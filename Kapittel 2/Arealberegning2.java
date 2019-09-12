import static javax.swing.JOptionPane.*;

class Arealberegning2 {
	public static void main(String[]args) {
	String lengdeLest = showInputDialog("Skriv inn lengden");
	String breddeLest = showInputDialog("Skriv inn bredden");
	double lengde = Double.parseDouble(lengdeLest);
	double bredde = Double.parseDouble(breddeLest);
	double areal = lengde * bredde;
	String utskrift = "Arealet av rektangelet er " + areal + " kvadratmeter.";
	//System.out.println(utskrift);
	showMessageDialog(null,utskrift);

	}


}
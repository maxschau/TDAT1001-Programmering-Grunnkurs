import static javax.swing.JOptionPane.*;

class oppgave1 {
	public static void main(String[]args) {

	double tommer = Double.parseDouble(showInputDialog("Skriv inn tommer"));

	if (tommer > 0.0) { //Om det er gyldig verdi
		double centimeter = tommer * 2.54;
		showMessageDialog(null, tommer + " tommer er det samme som " + centimeter +" centimeter.");
	}else {
		showMessageDialog(null, "Du har skrevet inn en ugyldig verdi");
	}
}
}
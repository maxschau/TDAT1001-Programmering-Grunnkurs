import static javax.swing.JOptionPane.*;
class EnSirkel {
	public static void main(String[]args) {
		String tallLest = showInputDialog("Skriv inn radius");

		while (tallLest != null) {
			double tall = Double.parseDouble(tallLest);

			if (tall > 0) {
				Sirkel sirkel1 = new Sirkel(tall);
				double areal = sirkel1.beregnAreal();
				showMessageDialog(null, "Arealet er: " + areal);
			} else {
			tallLest = showInputDialog("Skriv inn radius");
			}
		tallLest = showInputDialog("Skriv inn radius");
		}//while

	}//main
}//Class
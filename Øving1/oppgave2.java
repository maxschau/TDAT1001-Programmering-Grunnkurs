import static javax.swing.JOptionPane.*;

	class oppgave2 {
	public static void main(String[]args) {

		int timer = Integer.parseInt(showInputDialog("Skriv inn timer"));
		int minutter = Integer.parseInt(showInputDialog("Skriv inn minutter"));
		int sekunder = Integer.parseInt(showInputDialog("Skriv inn sekunder"));

		if (timer >= 0.0 && minutter >= 0.0 && sekunder >= 0.0) { //Om det er gyldige verdier
			int antallSekunder = ((timer * 3600) + (minutter * 60) + sekunder);
			showMessageDialog(null, timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder blir totalt " + antallSekunder + " sekunder.");
			} else { //Ved ugyldige verdier
			showMessageDialog(null, "Du har skrevet inn en ugyldig verdi");
			}
		}
	}
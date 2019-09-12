import static javax.swing.JOptionPane.*;
	class oppgave4 {
		public static void main(String[]args) {

			double prisPerGramA = 35.90 / 450;
			double prisPerGramB = 39.50 / 500;

			if (prisPerGramA < prisPerGramB) {
				showMessageDialog(null, "Merke A er billigst, og koster " + prisPerGramA + " kroner per gram.");
			} else {
				showMessageDialog(null, "Merke B er billigst, og koster " + prisPerGramB + " kroner per gram.");
			}
		}
	}
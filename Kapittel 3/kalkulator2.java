import static javax.swing.JOptionPane.*;

	class kalkulator2 {
		public static void main(String[]args) {
		double tall1 = Double.parseDouble(showInputDialog("Tall 1: "));
		double tall2 = Double.parseDouble(showInputDialog("Tall 2: "));

		String utskrift = "";
			if (tall1 < tall2) {
				double svar = tall2 - tall1;
				utskrift = utskrift + "Det første tallet er minst. Differansen er " + svar + ".";
			} else {
				double svar = tall1 - tall2;
				utskrift = utskrift + "Det førset tallet er størst, eller tallene er like. " + "Differansen er " + svar + ".";
				}

			showMessageDialog(null, utskrift);
			}
		}
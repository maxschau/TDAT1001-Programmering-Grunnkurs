import static javax.swing.JOptionPane.*;

	class kalkulator4 {
		public static void main(String[]args) {

			int tall1 = Integer.parseInt(showInputDialog("Tall 1: "));
			int tall2 = Integer.parseInt(showInputDialog("Tall 1: "));

			int valg = showConfirmDialog(null, "Pluss?", "Kalkulator", YES_OPTION); //(Null, spørsmålet, navn på boksen, ??)

			int svar = 0;
			if (valg == YES_OPTION) {
				svar = tall1 + tall2;
			} else {
				svar = tall1 - tall2;
				}
			showMessageDialog(null, svar);
		}
	}
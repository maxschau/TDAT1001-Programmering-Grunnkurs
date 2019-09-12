import static javax.swing.JOptionPane.*;

	class SumMedGrense {
		public static void main(String[]args) {
			final int GRENSE = 10;
			boolean grenseN�dd = false;
			int sum = 0;
			String tallLest = showInputDialog("Skriv inn ett tall av gangen, avslutt med Esc: ");
			while (tallLest != null && !grenseN�dd) { //S� lenge tallLest ikke er lik null og grensen ikke er n�dd
				int tall = Integer.parseInt(tallLest);
				sum += tall;
				if (sum > GRENSE) {
					grenseN�dd = true;
				} else {
					tallLest = showInputDialog("Skriv ett tall av gangen, avslutt med Esc: ");
				}
			}
			if (grenseN�dd) {
				showMessageDialog(null, "Summen er " + sum + ".");
				showMessageDialog(null, "Du ble avsluttet grunnen til at grensen ble n�dd");
			} else{
				showMessageDialog(null, "Summen er " + sum + ".");
				showMessageDialog(null, "Du ble avsluttet da du trykket Escape");
			}
		}
	}
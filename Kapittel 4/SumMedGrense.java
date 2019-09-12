import static javax.swing.JOptionPane.*;

	class SumMedGrense {
		public static void main(String[]args) {
			final int GRENSE = 10;
			boolean grenseNådd = false;
			int sum = 0;
			String tallLest = showInputDialog("Skriv inn ett tall av gangen, avslutt med Esc: ");
			while (tallLest != null && !grenseNådd) { //Så lenge tallLest ikke er lik null og grensen ikke er nådd
				int tall = Integer.parseInt(tallLest);
				sum += tall;
				if (sum > GRENSE) {
					grenseNådd = true;
				} else {
					tallLest = showInputDialog("Skriv ett tall av gangen, avslutt med Esc: ");
				}
			}
			if (grenseNådd) {
				showMessageDialog(null, "Summen er " + sum + ".");
				showMessageDialog(null, "Du ble avsluttet grunnen til at grensen ble nådd");
			} else{
				showMessageDialog(null, "Summen er " + sum + ".");
				showMessageDialog(null, "Du ble avsluttet da du trykket Escape");
			}
		}
	}
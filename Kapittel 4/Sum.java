import static javax.swing.JOptionPane.*;

	class Sum {
		public static void main(String[]args) {
			int sum = 0;
			int antallKjoring = 0;
			String tallLest = showInputDialog("Skriv tall, avslutt med esc");
			while (tallLest != null) {
				int tall = Integer.parseInt(tallLest);
				sum += tall;
				antallKjoring ++;
				tallLest = showInputDialog("Skriv tall, avslutt med esc.");
			}
		double gjennomsnitt = sum / antallKjoring;
		showMessageDialog(null, "Summen er " + sum + ".");
		showMessageDialog(null, "Gjennomsnittet er: " + gjennomsnitt + ".");

		}
	}
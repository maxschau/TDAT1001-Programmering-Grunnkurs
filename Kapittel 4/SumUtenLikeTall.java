import static javax.swing.JOptionPane.*;
	class SumUtenLikeTall {
		public static void main(String[]args) {
			int antallTallSummert = 0;
			int antallTallSummert2 = 0;
			int sum = 0;
			int sum2 = 0;
			String forrigeTallLest = "";
			String tallLest = showInputDialog("Skriv ett tall av gangen, avslutt med Esc: ");

			/*Gå i løkke så lenge som esc ikke er tastet */
			while (tallLest != null) {//Så lenge ikke er escape er tastet kjører metoden. Om esc blir tastet vil tallLest == null.
			antallTallSummert2 ++;
			int tall = Integer.parseInt(tallLest);
			sum2 += tall;
				if (!tallLest.equals(forrigeTallLest)) { //Dersom tallet bruker har tastet inn ikke er lik det forrige tallet kjøres metoden.
					tall = Integer.parseInt(tallLest);
					sum += tall;
					antallTallSummert ++;
				}
				forrigeTallLest = tallLest;
				tallLest = showInputDialog("Skriv ett tall av gangen, avslutt med Esc: ");
			}
			//double gjennomsnitt = (double)sum / (double)antallTallSummert;
			//showMessageDialog(null, "Gjennomsnittet er: " + gjennomsnitt + ".");
			double gjennomsnitt = (double)sum / (double)antallTallSummert;
			showMessageDialog(null, "Gjennomsnittet er: " + gjennomsnitt + ".");
			double gjennomsnitt2 = (double)sum2 / (double)antallTallSummert2;
			showMessageDialog(null, "Gjennomsnittet er: " + gjennomsnitt2 + ".");
			showMessageDialog(null, "Summen er " + sum + ". Vi har summert " + antallTallSummert + " tall.");
		}
	}
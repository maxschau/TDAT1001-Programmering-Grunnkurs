import static javax.swing.JOptionPane.*;
class Arrangement_klient implements java.io.serializable {
	public static void main(String[] args) {


		String valgLest = showInputDialog("Valg: " + "\n" + "1. Opprett nytt arrangement. " + "\n" + "2. Registrer ny øvelse " + "\n" + "3. Avslutt");
		int valg = Integer.parseInt(valgLest);
		Arrangement a1 = null;

		while (valg != 1 && valg != 2 && valg !=3) {
			valgLest = showInputDialog("Valg: " + "\n" + "1. Opprett nytt arrangement. " + "\n" + "2. Registrer ny øvelse " + "\n" + "3. Avslutt");
			valg = Integer.parseInt(valgLest);
		}
		if (valg == 1) {
			String navn = showInputDialog("Skriv inn navnet på arrangementet");
			int MAKS_ANTALL = Integer.parseInt(showInputDialog("Skriv inn maks antall:"));

			if (a1 != null) {
				int svar = showConfirmDialog(null, "Alt vil bli slettet om du fortsetter", "Warning", YES_NO_OPTION);
				if (svar == YES_OPTION) {
					a1 = new Arrangement(navn, MAKS_ANTALL);
				}
			}
		} else if (valg == 2) {
			String navn = showInputDialog("Skriv inn navn på øvelsen");
			int antallOvelser = Integer.parseInt(showInputDialog("Skriv inn antall øvelser"));

		} else {
			return;
		}







	}
}
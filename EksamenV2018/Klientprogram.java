import static javax.swing.JOptionPane.*;

class Klientprogram {
	public static void main(String[] args) {
		//Antar at et objekt av klassen utstilling eksisterer. Antar ogs� at dette inneholder flere kunstverk


		//Velger � la bruker skrive inn et nummer for � avgj�re hva bruker �nsker � gj�re.
		String valgLest = showInputDialog("1: List alle kunstverk: " + "\n" + "2: Legg til nytt kunstverk" + "\n" + "3: Avslutt");
		int valg = Integer.parseInt(valgLest);
		while (valg !=3) {
			if (valg == 1) {
				showMessageDialog(null, u1.toString());
			}
			if (valg == 2) {
				String navn = showInputDialog("Skriv inn navnet til kunstverket");
				String type = showInputDialog("Skriv inn typen");
				int antallKopier = Integer.parseInt(showInputDialog("Skriv inn antall kopier"));
				int nr = Integer.parseInt(showInputDialog("Skriv inn nummer"));
				String fornavn = showInputDialog("Skriv inn fornavn til kunstner");
				String etternavn = showInputDialog("Skriv inn etternavn til kunstner");
				Kunstverk kunstverk1 = new Kunstverk(navn, type, antallKopier, nr, fornavn, etternavn);
			}
			String valgLest = showInputDialog("1: List alle kunstverk: " + "\n" + "2: Legg til nytt kunstverk" + "\n" + "3: Avslutt");
			int valg = Integer.parseInt(valgLest);

		}
	}
}
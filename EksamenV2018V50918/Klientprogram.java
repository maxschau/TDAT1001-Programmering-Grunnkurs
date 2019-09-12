import static javax.swing.JOptionPane.*;
class Klientprogram {
	public static void main(String[] args) {

		//Antar at objektet U1 av klassen Utstilling eksisterer. Bruker U1 til å utføre metodene.

		Navn n1 = new Navn("Max", "Schau");
		Navn n2 = new Navn("Simon", "Årdal");
		Navn n3 = new Navn("Anders", "Rompehull");

		Kunstverk k1 = new Kunstverk("Rompen", "Maleri", 2, 3, n1);
		Kunstverk k2 = new Kunstverk("Bæsjen", "Skulptur", 2, 3, n2);
		Kunstverk k3 = new Kunstverk("Tisen", "VetIkke", 2, 3, n3);
		Kunstverk[] rolig = {k1,k2,k3};

		Utstilling U1 = new Utstilling("SjokoladeKake", rolig);

		Kunstverk[] tab = U1.sorter();
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}




		String valgLest = showInputDialog("Valg: " + "\n" + "1. List alle kunstverk" + "\n" + "2. Legg til nytt kunstverk" + "\n" + "3. Avslutt");
		int valg = Integer.parseInt(valgLest);

		while (valg != 3) {
			while (valg != 1 && valg != 2) {
				valgLest = showInputDialog("Valg: " + "\n" + "1. List alle kunstverk" + "\n" + "2. Legg til nytt kunstverk" + "\n" + "3. Avslutt");
				valg = Integer.parseInt(valgLest);
			}

			if (valg == 1) { //List alle kunstverk
				showMessageDialog(null, U1.toString()); //Viser toString til utstillingen med tilhørende kunstverk, altså alle kunstverk
				valgLest = showInputDialog("Valg: " + "\n" + "1. List alle kunstverk" + "\n" + "2. Legg til nytt kunstverk" + "\n" + "3. Avslutt");
				valg = Integer.parseInt(valgLest);
			}else if (valg ==2) {
				String navn = showInputDialog("Skriv inn navnet");
				String type = showInputDialog("Skriv inn typen");
				int antKopier = Integer.parseInt(showInputDialog("Skriv inn antall kopier"));
				int nr = Integer.parseInt(showInputDialog("Skriv inn nummeret"));
				String fornavn = showInputDialog("Skriv inn fornavnet til kustneren");
				String etternavn = showInputDialog("Skriv inn etternavnet til kunstneren");

				valgLest = showInputDialog("Valg: " + "\n" + "1. List alle kunstverk" + "\n" + "2. Legg til nytt kunstverk" + "\n" + "3. Avslutt");
				valg = Integer.parseInt(valgLest);

				Kunstverk nyK = new Kunstverk(navn, type, antKopier, nr, new Navn(fornavn,etternavn));
				U1.leggTilKunstverk(nyK);
			}else {
				return;
			}
		}


	}
}
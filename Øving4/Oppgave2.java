import static javax.swing.JOptionPane.*;
class Oppgave2 {
  public static void main(String[] args) {

		Valuta dollar = new Valuta("Dollar", 8.30);
		Valuta euro = new Valuta("Euro", 9.70);
		Valuta svenskeKr = new Valuta("Svenske kroner", 1.07);

		String valgLest = showInputDialog("Velg valuta: \n 1: Dollar \n 2: Euro \n 3: Svenske kroner \n 4: Avslutt");
		int valg = Integer.parseInt(valgLest);


		while (valg <= 0 || valg >=5) { //Om valget er utenfor mengden programmet kjører i
			valgLest =showInputDialog("Velg valuta: \n 1: Dollar \n 2: Euro \n 3: Svenske kroner \n 4: Avslutt");
			valg = Integer.parseInt(valgLest);
		}
		while (valg >= 1 && valg <= 3) {
			String tallLest = showInputDialog("Hvor mye vil du gjøre om til nok?");
				while (tallLest != null) {
					double tall = Double.parseDouble(tallLest);
					if (valg == 1) { //Dollar
						showMessageDialog(null, tall + " dollar er " + dollar.regnOmTilNok(tall) + " kroner.");
					} else if (valg == 2) {//Euro
						showMessageDialog(null, tall + " euro er " + dollar.regnOmTilNok(tall) + " kroner.");
					} else { //Svenske
						showMessageDialog(null, tall + " svenske kroner er " + dollar.regnOmTilNok(tall) + " kroner.");
					} //If
				tallLest = showInputDialog("Hvor mye vil du gjøre om til nok?");
				} //while
				valgLest =showInputDialog("Velg valuta: \n 1: Dollar \n 2: Euro \n 3: Svenske kroner \n 4: Avslutt");
				valg = Integer.parseInt(valgLest);
		}//While

	} // main
} //Class
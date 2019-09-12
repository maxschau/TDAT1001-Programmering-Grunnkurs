class Klientprogram {
	public static void main (String[] args){
		String[] muligheter = {"Nytt alfabet","Legg til ord", "Bokstaver ord", "Skriv alfabet til fil", "Skriv alfabetet på skjerm","Sorter alfabetet", "Avslutt"};
		final int NYTT_ALFABET = 0;
		final int LEGG_TIL_ORD = 1;
		final int BOKSTAVER_ORD = 2;
		final int SKRIV_TIL_FIL = 3;
		final int LIST_ALFATBET = 4;
		final int SORTER = 5;
		final int AVSLUTT = 6;

		int valg = showOptionDialog(null, "Velg", "Eksamen juni 2017", YES_NO_OPTION, INFORMATION_MESSAGE, null, muligheter, muligheter[0]);

		Bokstaveringsalfabet ba = null;

		while (valg != AVSLUTT){
			switch (valg){
				case NYTT_ALFABET:
					/* OPPGAVE 2 a) skal inn her */
					String valgLest = showInputDialog("Skriv inn 1 for legge inn fra fil. Skriv inn 2 for å skrive inn ord direkte");
					int valg = Integer.parseInt(valgLest);
					while (valg != 1 || valg != 2) { //Dersom valget ikke er gyldig
						String valgLest = showInputDialog("Skriv inn 1 for legge inn fra fil. Skriv inn 2 for å skrive inn ord direkte");
						int valg = Integer.parseInt(valgLest);
					}
					if (valg == 1) {
						String filnavn = showInputDialog("Filnavn: ");
						if (filnavn == null) {
							throw new IllegalArgumentException("Ikke gyldig filnavn");
						}
						ba = new Bokstaveringsalfabet(filnavn);
					} else {
						String navn = showInputDialog("Navn på alfabet: ");
						String skilletegnLest = showInputDialog("Skriv inn skilletegn: ");
						char skilletegn = Char.parseChar(skilletegnLest);
						String alfabet = showInputDialog("Skriv inn alfabetet med skilletegn");
						if (navn == null || skilletegnLest == null || alfabet == null) {
							throw new IllegalArgumentException("Ikke gyldig respons");
						}
						ba = new Bokstaveringsalfabet(navn, alfabet, skilletegn);
					}
					break;
				case LEGG_TIL_ORD:
					break;
				case BOKSTAVER_ORD:
					String tekst = showInputDialog("Skriv inn tekst for å få den fonetiske bokstaveringen");
					while (tekst == null) {
						String tekst = showInputDialog("Skriv inn tekst for å få den fonetiske bokstaveringen");
					}
					String resultat = ba.konverter(tekst);
					showMessageDialog(null, resultat);
					break;
				case SKRIV_TIL_FIL: // ikke en del av oppgaven
					break;
				case LIST_ALFATBET:
					break;
				case SORTER:
					break;
				default: break;
			}
		valg = showOptionDialog(null, "Velg", "Eksamen juni 2017", YES_NO_OPTION, INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
		}
	}
}
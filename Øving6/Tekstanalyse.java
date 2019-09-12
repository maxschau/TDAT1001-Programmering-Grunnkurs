import static javax.swing.JOptionPane.*;
class Tekstanalyse {
	private int[] antallTegn = new int[30];
	private String tekst;

	public Tekstanalyse(String tekst) {
		this.antallTegn = antallTegn;
		this.tekst = tekst;
		tekst = tekst.toLowerCase(); //Gjør om til små bokstaver

		for (int i = 0; i < tekst.length(); i++){ //Kjører gjennom hele teksten
			char tegn = tekst.charAt(i);
			int verdi = tegn; //Gjør om fra string til int
			for (int j = 0; j < antallTegn.length; j++) {
				if (verdi == (97 + j)) {
					antallTegn[j] += 1; //Plusser på antall forekomster i tabellen. J representerer tallet sin indeks i tabellen.
				}
			}
			if (verdi == 230) {//Tegn = æ
				antallTegn[26] += 1;
			}
			if (verdi == 248) {//Tegm = ø
				antallTegn[27] += 1;
			}
			if (verdi == 229) {//Tegm = å
				antallTegn[28] += 1;
			}
			if (verdi == 46 || verdi == 44 || verdi == 32 ){ //Tegn = . eller , eller space
				antallTegn[29] += 1;
			}
		}
	}

	public int[] getAntallTegn() {
		return antallTegn;
	}

	public int finnAntallForskjelligeBokstaver() {
		int teller = 0;
		for (int i = 0; i < 29; i++) {
			if (antallTegn[i] > 0) { //Hvis det er en eller flere forekomster av tallet skal telleren økes.
				teller += 1;
			}
		}
		return teller;
	}

	public int finnAntallBokstaver() {
		int teller = 0;
		for (int i = 0; i < 29; i++) {
			if (antallTegn[i] > 0) {
				teller += antallTegn[i]; //Plusser på antall forekomster av de ulike bokstavene.
			}
		}
		return teller;
	}

	public String finnProsIkkeBokstaver() {
		double antall = finnAntallBokstaver() + antallTegn[29]; //Total antall tegn
		double pros = (antallTegn[29]/antall)*100; //Regner ut prosenten
		java.util.Formatter f = new java.util.Formatter(); //FOrmaterer
		f.format("%.2f", pros);
		return f.toString();
	}

	public int finnAntallForekomster(String bokstav) { //Bokstaven som parameter
		bokstav = bokstav.toLowerCase();
		char bokstav1 = bokstav.charAt(0);
		int tegn = bokstav1; //Gjør om til integer
		int antall = 0;
		for (int i = 0; i < antallTegn.length; i++) {
			if (tegn == (97 + i)) { //Dersom parameteren er lik unicode coden.
				antall = antallTegn[i];
			}
			if (tegn == 230) {//Æ
				antall = antallTegn[26];
			}
			if (tegn == 248) {
				antall = antallTegn[27];
			}
			if (tegn == 229) {
				antall = antallTegn[28];
			}
		}
		return antall;
	}

	public String finnFlestForekomster() {
		String utskrift = "";
		int forsteForekomst = finnForsteForekomst(); //Finner den første bokstaven som det finnes en eller flere forekomster av.
		int flestForekomst = finnAntallForekomsterUnicode(forsteForekomst); //Setter den med hittil mest flest forekomster
		String bokstav = "";
		for (int i = 0; i < antallTegn.length - 4; i++) {
			if (finnAntallForekomsterUnicode(97 + i) >= flestForekomst) { //Sjekker om det neste tallet er større enn hittil flest forekomster
				flestForekomst = finnAntallForekomsterUnicode(97 + i); //Ender i så fall flestForekomst
				bokstav = Character.toString((char)(97+i));
				utskrift += (bokstav) + ", ";
			}//if
		}

			if (finnAntallForekomsterUnicode(230) >= flestForekomst) {//Æ
				flestForekomst = finnAntallForekomsterUnicode(230);
				bokstav = Character.toString((char)(230));
				utskrift += (bokstav) + ", ";
				}
			if (finnAntallForekomsterUnicode(248) >= flestForekomst) {
				flestForekomst = finnAntallForekomsterUnicode(248);
				bokstav = Character.toString((char)(248));
				utskrift += (bokstav) + ", ";
			}
			if (finnAntallForekomsterUnicode(229) >= flestForekomst) {
				flestForekomst = finnAntallForekomsterUnicode(229);
				bokstav = Character.toString((char)(229));
				utskrift += (bokstav) + ", ";
			}

	return utskrift;

	}


	public int finnAntallForekomsterUnicode(int unicode) { //Finner antall forekomster ved hjelp av Unicode istedenfor bokstavet
		int antall = 0;
			for (int i = 0; i < antallTegn.length; i++) {
				if (unicode == (97 + i)) {
					antall = antallTegn[i];
				}
			}
			if (unicode == (230)) {
				antall = antallTegn[26];
			}
			if (unicode == (248)) {
				antall = antallTegn[27];
			}
			if (unicode == (229)) {
				antall = antallTegn[28];
			}
		return antall;
	}

	public int finnForsteForekomst() {
		int forsteForekomst = 0;
		for (int i = 0; i < antallTegn.length; i++) {
			if (finnAntallForekomsterUnicode(97 + i) >= 1) {
				forsteForekomst = 97 + i;
			}
		}
		if (finnAntallForekomsterUnicode(230) >= 1) {
			forsteForekomst = 230;
		}
		if (finnAntallForekomsterUnicode(248) >= 1) {
			forsteForekomst = 248;
		}
		if (finnAntallForekomsterUnicode(229) >= 1) {
			forsteForekomst = 229;
		}
		return forsteForekomst;
	}
}
class Tekstbehandling {
	private String tekst;

	public Tekstbehandling(String tekst) {
		this.tekst = tekst;
	}

	public int finnAntallOrd() {
		int teller = 0;
		String[] ord = tekst.split(" ");
		return ord.length;
	}

	public double finnGjennomsnittLengde() {
		String nyTekst = tekst.toLowerCase();
		double antallBokstaver = 0;
		for (int i = 0; i < tekst.length(); i++) {
			int verdi = nyTekst.charAt(i);
			if ((verdi >= 97 && verdi <= 122) || verdi == 230 || verdi == 248 || verdi == 229) {
				antallBokstaver ++;
			}
		}
		return antallBokstaver / finnAntallOrd();
	}

	public double gjennomsnittPerPeriode() {
		String perioder[] = tekst.split("[.,?:]");
		double antallOrd = finnAntallOrd();
		return antallOrd / perioder.length;
	}


	public String erstatte(String nyTekst, String eksisterendeTekst) {
		nyTekst = nyTekst.toLowerCase();
		eksisterendeTekst = eksisterendeTekst.toLowerCase();
		String nyesteTekst = tekst.toLowerCase();
		nyesteTekst = tekst.replaceAll((" " + nyTekst + " "), (" " + eksisterendeTekst + " ")); //Legger til mellomrom foran slik at den kun bytter ut et helt ord, og ikke deler av et ord
		return nyesteTekst;

	}

	public String getString() {
		return tekst;
	}

	public String storeBokstaver() {
		return tekst.toUpperCase();
	}
}
class Idrettsgren implements java.io.Serializable {
	private String navn;
	private Ovelse[] ovelser;
	private final int MAKS_ANTALL;
	private int antallReg;

	public Idrettsgren(String navn, int MAKS_ANTALL) {
		this.navn = navn;
		this.MAKS_ANTALL = MAKS_ANTALL;
		this.ovelser = new Ovelse[MAKS_ANTALL]; //Oppretten tom tabell
		antallReg = 0;
	}

	public Idrettsgren(String navn, Ovelse[] ovelser) {
		this.navn = navn;
		this.ovelser = ovelser;
		this.MAKS_ANTALL = ovelser.length;
		this.antallReg = ovelser.length;
	}

	public String getNavn() {
		return navn;
	}

	public String toString() {
		String resultat = navn + "\n";
		for (int i = 0; i < ovelser.length; i++) {
			resultat += ovelser[i].toString() + "\n";
		}
		return resultat;
	}

	public boolean regNyOvelse(Ovelse ovelse) {
		if (ovelse == null) {
			throw new IllegalArgumentException("Ugyldig argument");
		}
		//Sjekker at det er plass i tabellen
		if(antallReg >= MAKS_ANTALL) {
			return false;
		}

		//Sjekker at ovelsen ikke er lik noen av elementene i tabellen
		for (int i = 0; i < antallReg; i++) {
			if (ovelse.equals(ovelser[i])) { //Dersom ovelse er likt et av elementene i tabellen ovelser
				return false;
			}
		}
		ovelser[antallReg] = ovelse; //registrerer nye ovelsen
		antallReg++; //Oppdateren telleren
		return true;
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Idrettsgren)) { //Dersom objektet ikke er av klassen Idrettsgren returneres false
			return false;
		}
		if (this == obj) { //Dersom this er lik objektet sendt inn som parameter returneres true. De er dermed samme
			return true;
		}

		Idrettsgren instance = (Idrettsgren) obj; //Caster objektet slik at det er av klassen Idrettsgren
		if (instance.getNavn().equals(navn)) {
			return true;
		}

		return false;
	}

}
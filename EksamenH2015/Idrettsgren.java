class Idrettsgren implements java.io.serializable {
	private String navn;
	private static int MAKS_ANTALL; //Final, kan ikke endres senere
	private Ovelse[] ovelser;
	private int antallReg;

	public Idrettsgren(String navn, int MAKS_ANTALL) { //Lager en konstruktør som tar i mot MAKS_ANTALL
		this.navn = navn;
		ovelser = new Ovelse[MAKS_ANTALL];
		antallReg = 0;
	}
	public Idrettsgren(String navn, Ovelse[] ovelser1) { //Lager en konstruktør som tar imot en ferdig fyllt tabell
		this.navn = navn;
		ovelser = new Ovelse[ovelser1.length];
		for (int i = 0; i < ovelser.length; i++) {
			this.ovelser[i] = new Ovelse(ovelser1[i].getBeskrivelse(), ovelser1[i].getKjonn());
		}

	}

	public String getNavn() {
		return navn;
	}

	public String toString() {
		String resultat = navn;
		for (int i = 0; i < ovelser.length; i++) {
			resultat += ovelser[i].toString();
		}
		return resultat;
	}

	//E:
	public boolean regNyOvelse(String beskrivelse, String kjonn) {
		if (beskrivelse == null || kjonn == null) { //Sjekker om parameterne er gyldige
			throw new IllegalArgumentException("Ugyldig(e) paramter(e)");
		}
		//Sjekker om tabellen er full
		if (antallReg >= ovelser.length) {
			return false;
		}
		Ovelse o = new Ovelse(beskrivelse, kjonn);
		if (sjekkTabell(o)) { //Dersom det eksisterer fra før av
			return false;
		}

		ovelser[antallReg] = o;
		antallReg++;
		return true;

	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Idrettsgren)) { //Sjekker at objektet er av klassen Idrettsgren
			return false;
		}

		if (this == obj) { //Dersom this er lik objektet vi sammenligner med returneres true
			return true;
		}

		Idrettsgren instance = (Idrettsgren) obj; //Caster objektet til klassen Idrettsgren
		if (instance.getNavn().equals(navn)) { //Dersom både beskrivelse og kjonn er like returneres true
			return true;
		}
		return false; //Returnere false om de ikke er like
	}


	//Hjelpemetode til regNyOvelse
	private boolean sjekkTabell(Ovelse o1) {
		for (int i = 0; i < ovelser.length; i++) {
			if (ovelser[i].equals(o1)) { //Dersom et av elementene i tabellen er likt o1-objektet returneres true
				return true;
			}
		}
		return false; //returnerer false dersom det ikke eksiterer i tabellen
	}






}
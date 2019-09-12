class Ord implements java.io.Serializable {
	private String navn;
	private String[] definisjoner;
	private int antallReg;

	public Ord(String navn) {
		this.navn = navn;
		this.definisjoner = new String[0]; //Oppretter et tomt array som kan fylles p�
		this.antallReg = 0; //Teller som inneholder antall registrerte i tabellen
	}

	public Ord(String navn, String[] definisjoner) {
		this.navn = navn;
		this.definisjoner = definisjoner;
		this.antallReg = definisjoner.length;
	}

	public String getNavn() {
		return navn;
	}
	public String[] getDefinisjoner() {
		return definisjoner;
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Ord)) { //Dersom obj ikke er av klassen Ord returneres false
			return false;
		}

		if (this == obj) { //En kjapp m�te � returnere true dersom vi sammenligner to objekter som er identiske
			return true;
		}

		Ord instance = (Ord) obj; //Caster obj til klassen Ord for � f� tilgant til Ords metoder
		if (navn.equals(instance.getNavn())) { //Dersom this.navn er lik objektets navn er objektene like. Da returneres true
			return true;
		}
		return false; //Returnerer false dersom objektene ikke er like
	}

	public String toString() {
		String resultat = navn + "\n";
		for (int i = 0; i < definisjoner.length; i++) {
			resultat += (i+1) + ". " + definisjoner[i] + "\n";
		}
		return resultat;
	}

	public boolean leggTilDefinisjon(String nyDefinisjon) {
		//Sjekker f�rst at definisjonen ikke er registrert fra f�r av
		for (int i= 0; i < definisjoner.length; i++) {
			if (nyDefinisjon.equals(definisjoner[i])){ //Returnerer false dersom definisjonen allerede eksisterer i tabellen
				return false;
			}
		}

		//Dersom den ikke eksisterer fra f�r av registreres definisjonen
		utvidTabell();
		definisjoner[antallReg] = nyDefinisjon;
		antallReg++;
		return true; //Returnerer true dersom registreringen gikk bra
	}


	private void utvidTabell() {
		String nyTab[] = new String[definisjoner.length + 1]; //Oppretter en tabell med lengde 1 st�rre enn den opprinnelige tabellen
		for (int i = 0; i < definisjoner.length; i++) {
			nyTab[i] = definisjoner[i]; //Velger grunn kopiering av tabellen.
		}
		definisjoner = nyTab; //Setter definisjoner lik nyTab slik at definisjoner er utvidet med 1.
	}
}
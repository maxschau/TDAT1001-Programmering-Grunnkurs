class Ord implements java.io.Serializable{
	//A:
	private String navn;
	private String[] definisjoner;
	private int antallReg;

	//B:
	public Ord(String navn, String[] definisjoner) {
		this.navn = navn;
		this.definisjoner = definisjoner;
		antallReg = definisjoner.length;


	}

	public Ord(String navn) {
		this.navn = navn;
		this.definisjoner = new String[0];
		antallReg = 0;

	}
	//C:

	public String getNavn() {
		return navn;
	}

	public String[] getDefinisjoner() {
		return definisjoner;
	}


	//D:
	public boolean equals(Object obj) {
		if (!(obj instanceof Ord)) { //Dersom objektet ikke er av klassen Ord returneres false
			return false;
		}
		if (this == obj) { //Hvis vi sammenligner eksakt samme objekt
			return true;
		}

		Ord instance = (Ord) obj; //Caster objektet til klassen Ord
		if ((instance.getNavn()).equals(navn)) { //Dersom navnet er likt
			return true;
		}
		return false;
	}

	//E:
	public String toString() {
		String resultat = navn + ':' + "\n";
		for (int i = 0; i < definisjoner.length; i++) {
			resultat += (i+1) + definisjoner[i] + "\n";
		}
		return resultat;
	}

	//G:
	public boolean leggTilDefinisjon(String nyDefinisjon) {
		if (sokTabell(nyDefinisjon)) { //Dersom den eksisterer fra før av
			return false;
		}
		utvidTabell(); //Utvid tabellen
		definisjoner[antallReg + 1] = nyDefinisjon;
		antallReg++;
		return true;
	}


	private boolean sokTabell(String sokeOrd) { //Lager en privat hjelpemetode for å søke gjennom tabellen
		for (int i = 0; i < definisjoner.length; i++) { //Går gjennom definisjoner-tabellen
			if (sokeOrd.equals(definisjoner[i])) { //Hvis ordet er likt ordet i tabellen returneres true
				return true;
			}
		}
		return false; //Ellers returner false;
	}

	//F:
	private void utvidTabell() {
		String[] nyTab = new String[definisjoner.length + 1]; //Oppretter en ny tabell med definisjoner sin lengde, og legger til en.
		for (int i = 0; i < definisjoner.length; i++) {
			nyTab[i] = definisjoner[i]; //Kopierer tabellen slik at NyTab blir fylt med definisjoner sine elementer
		}
		definisjoner = nyTab; //Definisjoner har nå blitt utvidet med 1.
	}




}
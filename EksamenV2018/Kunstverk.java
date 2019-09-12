class Kunstverk implements java.io.serializable {

	//Oppgave 2A:
	private final String navn;
	private final String type;
	private final int antallKopier;
	private final int nr;
	private final Navn kunstner;


	//Oppgave 2B:
	public Kunstverk(String navn, String type, int antallKopier, int nr, Navn kunstner) {
		this.navn = navn;
		this.type = type;
		this.antallKopier = antallKopier;
		this.nr = nr;
		this.kunstner = kunstner;
	}
	public Kunstverk(String navn, String type, int antallKopier, int nr, String fornavn, String etternavn) {
		this.navn = navn;
		this.type = type;
		this.antallKopier = antallKopier;
		this.nr = nr;
		this.kunstner = new Navn(fornavn, etternavn);
	}

	//Oppgave 2C:
	public String getNavn() {
		return navn;
	}

	public String getType() {
		return type;
	}

	public int getAntallKoper() {
		return antallKopier;
	}

	public int getNr() {
		return nr;
	}

	public Navn getKunstner() {
		return kunstner;
	}

	//Oppgave 2D:
	public boolean equals(Object obj) {
		if (!(obj instanceof Kunstverk)) { //Dersom objektet ikke er av klassen Kunstverk returneres false
			return false;
		}
		if (this == obj) { //Dersom objektet er this, altså det samme (peker på likt objekt)
			return true;
		}

		Kunstverk instance = (Kunstverk) obj; //Caster objektet til klassen kunstverk
		if (navn.equals(instance.getNavn()) && nr == instance.getNr() && kunstner.equals(instance.getKunstner())) { //Dersom navn, nr og kunstner er like returneres true
			return true;
		}
		return false; //Returnerer false dersom de ikke er like
	}

	public String toString() {
		String resultat = (nr + "/ " + antallKopier + " " + "'" + navn + "' " + kunstner.toString());
	}




}
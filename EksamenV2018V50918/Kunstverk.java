class Kunstverk implements java.io.Serializable{
	private String navn;
	private String type;
	private int antKopier;
	private int nr;
	private Navn kunstner; //Aggregering / Komposisjon???

	public Kunstverk(String navn, String type, int antKopier, int nr, Navn kunstner) {
		this.navn = navn;
		this.type = type;
		this.antKopier = antKopier;
		this.nr = nr;
		this.kunstner = new Navn(kunstner.getFornavn(), kunstner.getEtternavn()); //Velger komposisjon
	}

	public String getNavn() {
		return navn;
	}

	public String getType() {
		return type;
	}

	public int getAntKopier() {
		return antKopier;
	}

	public int getNr() {
		return nr;
	}

	public Navn getKunstner() {
		return kunstner;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Kunstverk)) { //Dersom objektet ikke er av klassen Kunstverk returneres false
			return false;
		}

		if (this == obj) { //Dersom obj == this, altså det er det samme returneres true
			return true;
		}

		Kunstverk instance = (Kunstverk) obj; //Caster objektet til klassen Kunstverk
		if (instance.getNr() == nr && instance.getNavn().equals(navn) && instance.getKunstner().equals(kunstner)) {
			return true;
		}
		return false;
	}

	public String toString() {
		String resultat = nr + "/" + antKopier + " " + navn + " " + type + " " + kunstner.toString();
		return resultat;
	}



}
class Navn {
	private String fornavn;
	private String etternavn;

	public Navn(String fornavn, String etternavn) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public String toString() {
		return etternavn + ", " + fornavn;
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Navn)) { //Dersom objektet ikke er av klassen Navn
			return false;
		}
		if (this == obj) { //Dersom objektene peker på samme
			return true;
		}

		Navn instance = (Navn) obj; //Caster objektet til klassen Navn
		if (instance.getFornavn().equals(fornavn) && instance.getEtternavn().equals(etternavn)) { //Dersom både fornavn og etternavn er like returneres true
			//Kunne også brukt toLowerCase, men velger å anta at man skriver navnene slik reglene for gramatikk sier.
			return true;
		}
		return false; //returner false dersom de ikke er like
	}

	public int compareTo(Navn navn1) {
		if (toString().compareTo(navn1) > 0) {
			return -1;
		} else if(toString().compareTo(navn1) < 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
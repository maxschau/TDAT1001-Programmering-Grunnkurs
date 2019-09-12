class Ovelse implements java.io.serializable {
	//Oppgave 1B:
	private String beskrivelse;
	private String kjonn;

	public Ovelse(String beskrivelse, String kjonn) {
		this.beskrivelse = beskrivelse;
		this.kjonn = kjonn;
	}

	public String getBeskrivelse() {
		return beskrivelse;
	}

	public String getKjonn() {
		return kjonn;
	}

	public String toString() {
		return beskrivelse + " " + kjonn;
	}

	//Oppgave 1C:
	public boolean equals(Object obj) {
		if(!(obj instanceof Ovelse)) { //Sjekker at objektet er av klassen Ovelse
			return false;
		}

		if (this == obj) { //Dersom this er lik objektet vi sammenligner med returneres true
			return true;
		}

		Ovelse instance = (Ovelse) obj; //Caster objektet til klassen Ovelse
		if (instance.getBeskrivelse().equals(beskrivelse) && instance.getKjonn().equals(kjonn)) { //Dersom både beskrivelse og kjonn er like returneres true
			return true;
		}
		return false; //Returnere false om de ikke er like
	}






}
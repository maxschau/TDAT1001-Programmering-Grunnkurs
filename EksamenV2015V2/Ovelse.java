class Ovelse implements java.io.Serializable {
	private String beskrivelse;
	private String kjonn;

	public Ovelse(String beskrivelse, String kjonn) {
		this.beskrivelse = beskrivelse;
		this.kjonn = kjonn;
	}
	//SET_METODER

	public String getBeskrivelse() {
		return beskrivelse;
	}

	public String getKjonn() {
		return kjonn;
	}

	public String toString() {
		return beskrivelse + " " + kjonn;
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Ovelse)) { //Dersom objektet ikke er av klassen Ovelse returneres false
			return false;
		}
		if (this == obj) { //Dersom this er lik objektet sendt inn som parameter returneres true. De er dermed samme
			return true;
		}

		Ovelse instance = (Ovelse) obj; //Caster objektet slik at det er av klassen Ovelse
		if (beskrivelse.equals(instance.getBeskrivelse()) && kjonn.equals(instance.getKjonn())) {
			return true;
		}
		return false;
	}
}
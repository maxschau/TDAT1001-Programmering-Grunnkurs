class Ovelse {
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
}
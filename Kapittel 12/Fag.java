class Fag {
	private final String fagkode;
	private final String fagnavn;
	private int antStud = 0;

	public Fag(String fagkode, String fagnavn) {
		if (fagkode == null || fagkode.trim().equals("") || 
		fagnavn == null || fagkode.trim().equals("")) {
			throw new IllegalArgumentException("Fagkode og fagnavn må oppgis");
		}
		this.fagkode = fagkode;
		this.fagnavn = fagnavn;
	}

	public String getFagkode() {
		return fagkode;
	}

	public String getFagnavn() {
		return fagnavn;
	}

	public int getAntStud() {
		return antStud;
	}

	public void setAntStud(int nyAntStud) {
		if (nyAntStud < 0) {
			throw new IllegalArgumentException("Antall studenter kan ikke være negativ");
		}
		this.antStud = nyAntStud;
	}

	public boolean equals(Object objekt) {
		if (!(objekt instanceof Fag)) { //Hvis det ikke er instance of Fag
			return false;
		}
		if (this == objekt) { //Dersom de er samme objektet
			return true;
		}
		Fag f = (Fag) objekt; //Caster objektet til Fag klassen
		return (fagkode.equals(f.getFagkode()));
	}

	public String toString() {
		return "Kode: " + fagkode + ", Navn: " + fagnavn + ", " + antStud + " studenter.";
	}
}
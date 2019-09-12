class Visittkort {
	private Navn navn;
	private int TLFMobil;
	private int TLFJobb;
	private String epost;

	public Visittkort(Navn navn, int TLFMobil, int TLFJobb, String epost) {
		this.navn = navn; //Aggregering
		this.TLFMobil = TLFMobil;
		this.TLFJobb = TLFJobb;
		this.epost = epost;
	}

	//Avgjør at det kun er nødvendig med tilgangsmetode til objektvariabelen navn.
	public Navn getNavn() {
		return navn;
	}

	public String toString() {
		String resultat = navn.toString() + "\n" + "Mobiltlf: " + TLFMobil + "\n" + "Tlf jobb: " + TLFJobb + "\n" + "Epost: " + epost;
		return resultat;
	}



}
class Mobil {
	private String modell;
	Visittkort[] visittkortliste;
	private int final antVisittKort;
	private int egetNr;

	public Mobil(String modell, int antVisittKort, int egetNr) {
		this.modell = modell;
		this.egetNr = egetNr;
		this.antVisittKort = antVisittKort;
		this.visittkortliste = new Visittkort[antVisittKort]; //Oppretter en tabell med lengde lik Maks antall
		int antReg = 0;
	}

	public String toString() {
		String resultat = modell + ", " + egetNr + "\n" + "Visittkortliste: " + "\n";
		for (int i = 0; i <= antReg; i++) {
			resultat += visittkortliste[i].toString();
			resultat += "+n" + "---------------";
		}
		return resultat;
	}

	public boolean regNyttVisittkort(Visittkort k1) {
		if (k1 == null) {
			throw new IllegalArgumentException("Ugyldig argument");
		}
		if (antReg >= antVisittKort) {

		}
	}

}
class Belegg{
	private static final double GRENSE = 0.02;

	private final String navn;
	private final double prisPrM;
	private final double bredde;

	public Belegg(String navn, double prisPrM, double bredde) {
		if (navn == null || navn.trim().equals("")) {
			throw new IllegalArgumentException("Beleggets navn må være oppgitt");
		}
		if (prisPrM <= 0.0 || bredde <= 0.0) {
			throw new IllegalArgumentException("Både pris og bredde må være positive tall.\n" + 
			"Inndata til konstruktøren var: pris = " + prisPrM + ", bredde= " + bredde);
		}
		this.navn = navn;
		this.prisPrM = prisPrM;
		this.bredde = bredde;
	}

	public String getNavn() {
		return navn;
	}

	public double getPrisPrM() {
		return prisPrM;
	}

	public double getBredde() {
		return bredde;
	}

	public double beregnAntMeter(Flate flaten) {
		double lengdeFlate = flaten.getLengde();
		double breddeFlate = flaten.getBredde();

		int antBredder = (int)(lengdeFlate/bredde);
		double rest = lengdeFlate%bredde;
		if(rest >= GRENSE) {
			antBredder++;
		}
		return antBredder * breddeFlate;
	}

	public double beregnTotalpris(Flate flaten) {
		return beregnAntMeter(flaten) *prisPrM;
	}
	/*To belegg defineres som identiske hvis de har samme navn*/

	public boolean equals(Object detAndre) {
		if (!(detAndre instanceof Belegg)) {
			return false; // RETUR. Raskt uthopp hvis feil objekttype
		}
		if(this== detAndre) {
			return true; //RETUR. Raskt uthopp hvis samme objekt
		}
		Belegg belegg = (Belegg) detAndre;
		return (navn.equals(belegg.navn)); //RETUR. Sammenligner navn
	}

	public String toString() {
		java.util.Formatter f  = new java.util.Formatter();
		f.format("Belegg: %s, pris kr %.2f pr.m, bredde: %2f m.", navn, prisPrM, bredde);
		return f.toString();
	}
}
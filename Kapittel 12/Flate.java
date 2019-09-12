class Flate {
	private final String navn;
	private final double bredde;
	private final double lengde;

	public Flate(String navn, double lengde, double bredde) {
		this.navn = navn;
		this.lengde = lengde;
		this.bredde = bredde;
	}

	public String getNavn(){
		return navn;
	}

	public double getLengde() {
		return lengde;
	}

	public double getBredde() {
		return bredde;
	}

	public double beregnAreal() {
		return bredde * lengde;
	}

	public double beregnOmkrets() {
		return 2.0 * (lengde + bredde);
	}

	public String toString() {
		java.util.Formatter f = new java.util.Formatter();
		f.format("Flate: %s, bredde: %.2f m, lengde: %.2f m.",navn, bredde, lengde);
		return f.toString();
	}
}

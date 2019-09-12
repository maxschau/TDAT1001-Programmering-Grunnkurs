class Ansatt {

	public static final double MAKS_SK_PROS = 60.0; //Static forteller at dette er noe som er felles for alle objektene av klassen
	private final int ansattnr;
	private final String navn;
	private double timelønn;
	private double skatteprosent = MAKS_SK_PROS;

	public Ansatt(int ansattnr, String navn, double timelønn) {
		this.ansattnr = ansattnr;
		this.navn = navn;
		this.timelønn = timelønn;
	}

	public Ansatt(int ansattnr, String navn){
		this.ansattnr = ansattnr;
		this.navn = navn;
		this.timelønn = 0.0;
	}

	public int getAnsattnr() {
		return ansattnr;
	}

	public String getNavn() {
		return navn;
	}

	public double getTimelønn() {
		return timelønn;
	}

	public double getSkatteprosent() {
		return skatteprosent;
	}

	public void setTimelønn(double nyTimelønn) {
		timelønn = nyTimelønn;
	}

	public void setSkatteprosent(double nySkattepros) {
		skatteprosent = nySkattepros;
	}

	public double beregnBruttolønn(double antTimer) {
		return antTimer * timelønn;
	}

	public double beregnSkattetrekk(double antTimer) {
		return beregnBruttolønn(antTimer) * skatteprosent / 100.0;
	}

	public double beregnNettolønn (double antTimer) {
		return beregnBruttolønn(antTimer) - beregnSkattetrekk(antTimer);
	}

	public String toString() {
		return "Ansattnr,: " + ansattnr + ", navn: " + navn + ", timelønn: " + ", skatteprosent: " + skatteprosent;
	}


}
class Ansatt {

	public static final double MAKS_SK_PROS = 60.0; //Static forteller at dette er noe som er felles for alle objektene av klassen
	private final int ansattnr;
	private final String navn;
	private double timel�nn;
	private double skatteprosent = MAKS_SK_PROS;

	public Ansatt(int ansattnr, String navn, double timel�nn) {
		this.ansattnr = ansattnr;
		this.navn = navn;
		this.timel�nn = timel�nn;
	}

	public Ansatt(int ansattnr, String navn){
		this.ansattnr = ansattnr;
		this.navn = navn;
		this.timel�nn = 0.0;
	}

	public int getAnsattnr() {
		return ansattnr;
	}

	public String getNavn() {
		return navn;
	}

	public double getTimel�nn() {
		return timel�nn;
	}

	public double getSkatteprosent() {
		return skatteprosent;
	}

	public void setTimel�nn(double nyTimel�nn) {
		timel�nn = nyTimel�nn;
	}

	public void setSkatteprosent(double nySkattepros) {
		skatteprosent = nySkattepros;
	}

	public double beregnBruttol�nn(double antTimer) {
		return antTimer * timel�nn;
	}

	public double beregnSkattetrekk(double antTimer) {
		return beregnBruttol�nn(antTimer) * skatteprosent / 100.0;
	}

	public double beregnNettol�nn (double antTimer) {
		return beregnBruttol�nn(antTimer) - beregnSkattetrekk(antTimer);
	}

	public String toString() {
		return "Ansattnr,: " + ansattnr + ", navn: " + navn + ", timel�nn: " + ", skatteprosent: " + skatteprosent;
	}


}
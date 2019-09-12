class Matvare {
	private final String navn;
	private final double energi;
	private final double fett;
	private final double karbohydrater;

	public Matvare(String navn, double energi, double fett, double karbohydrater) {
		this.navn = navn;
		this.energi = energi;
		this.fett = fett;
		this.karbohydrater = karbohydrater;
	}

	public String getNavn() {
		return navn;
	}

	public double getFett(double gram) {
			return ((fett/100.0) * gram);
	}

	public double getKarbohydrater(double gram) {
			return ((karbohydrater/100.0) * gram);
	}

	public double getEnergiKj(double gram) {
			return ((energi/100.0) * gram);
	}

	public double getEnergiKcal(double gram) {
			return (((energi/100.0) * gram) * 4.18);
	}

}
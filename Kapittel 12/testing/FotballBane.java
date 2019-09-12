class FotballBane {
	private String navn;
	private double lengde;
	private double bredde;
	private int kapasitet;

	public FotballBane(String navn, double lengde, double bredde, int kapasitet) {
		this.navn = navn;
		this.lengde = lengde;
		this.bredde = bredde;
		this.kapasitet = kapasitet;
	}

	public String getNavn() {
		return navn;
	}

	public double getLengde() {
		return lengde;
	}

	public double getBredde() {
		return bredde;
	}

	public int getKapasitet() {
		return kapasitet;
	}

	public double beregnAreal() {
		return lengde * bredde;
	}

}
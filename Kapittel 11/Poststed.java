class Poststed {
	private final String postnr;
	private final String sted;

	public Poststed(String postnr, String sted) {
		this.postnr = postnr.trim();
		this.sted = sted.trim();
	}

	public String getPostnr() {
		return postnr;
	}

	public String getSted() {
		return sted;
	}

	public String toString() {
		return postnr + " " + sted;
	}
}
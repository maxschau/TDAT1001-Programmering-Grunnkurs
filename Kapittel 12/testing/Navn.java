class Navn {
	private final String fornavn;
	private final String etternavn;

	public Navn(String fornavn, String etternavn) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
	}

	public String getFornavn() {
		return fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}

	public String getNavn() {
		return fornavn + " " + etternavn;
	}
}
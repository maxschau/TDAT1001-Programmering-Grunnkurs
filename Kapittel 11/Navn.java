class Navn {
	private String fornavn;
	private String etternavn;

	public Navn(String fornavn, String etternavn) {
		this.fornavn = fornavn.trim();
		this.etternavn = etternavn.trim();
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public String toString() {
		return fornavn + " " + etternavn;
	}
}


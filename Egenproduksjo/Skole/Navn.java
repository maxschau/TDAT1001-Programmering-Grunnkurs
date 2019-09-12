class Navn {
	private String fornavn;
	private String etternavn;

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

	public void setFornavn(String nyFornavn) {
		this.fornavn = nyFornavn;
	} 

	public void setEtternavn(String nyEtternavn) {
		this.etternavn = nyEtternavn;
	}
}

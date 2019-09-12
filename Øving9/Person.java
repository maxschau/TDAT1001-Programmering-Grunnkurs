class Person {
	private final String fornavn;
	private final String etternavn;
	private final int fAr;

	public Person(String fornavn, String etternavn, int fAr) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.fAr = fAr;
	}

	public String getFornavn() {
		return fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public int getFAr() {
		return fAr;
	}
}

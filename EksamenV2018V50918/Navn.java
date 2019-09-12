class Navn implements java.io.Serializable {
	private String fornavn;
	private String etternavn;

	public Navn(String fornavn, String etternavn) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
	}
	public void setFornavn(String newValue) {
		fornavn = newValue;
	}
	public void setEtternavn(String newValue) {
		etternavn = newValue;
	}
	public String getFornavn() {
		return fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public boolean equals(Object obj) {
		if (!(obj instanceof Navn)) { //Dersom objektet ikke er av klassen Navn returneres false
			return false;
		}
		if (this == obj) {
			return true;
		}

		Navn instance = (Navn) obj; //Caster objektet til klassen Navn
		if (instance.getFornavn().equals(fornavn) && instance.getEtternavn().equals(etternavn)) {
			return true;
		}
		return false;

	}
	public String toString() {
		return fornavn + " " + etternavn;
	}

}
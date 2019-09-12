class klubb implements java.io.Serializable {
	private String navn;
	private int alder;

	public klubb(String navn, int alder) {
		this.navn = navn;
		this.alder = alder;
	}

	public String getNavn() {
		return navn;
	}

	public int getAlder() {
		return alder;
	}

	public void setNavn(String nyttNavn) {
		this.navn = nyttNavn;
	}

	public void setAlder(int nyAlder) {
		this.alder = nyAlder;
	}



}
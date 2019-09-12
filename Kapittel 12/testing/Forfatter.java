class Forfatter {
	private final Navn navn;
	private int alder;

	public Forfatter(Navn navn, int alder) {
		this.navn = navn;
		this.alder = alder;
	}

	public String getNavn() {
		return navn.getNavn();
	}

	public int getAlder() {
		return alder;
	}


}
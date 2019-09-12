class Maned {
	private final String mndNavn;
	private final int[] nedbør;

	public Maned(String mndNavn, int[] nedbør) {
		this.mndNavn = mndNavn;
		int antDager = nedbør.length;
		this.nedbør = new int[antDager];
		for (int i =0; i < antDager; i++) {
			this.nedbør = nedbør[i];
		}
	}
}
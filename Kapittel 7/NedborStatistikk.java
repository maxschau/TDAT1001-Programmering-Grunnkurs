class Maned {
	private final String mndNavn;
	private final int[] nedb�r;

	public Maned(String mndNavn, int[] nedb�r) {
		this.mndNavn = mndNavn;
		int antDager = nedb�r.length;
		this.nedb�r = new int[antDager];
		for (int i =0; i < antDager; i++) {
			this.nedb�r = nedb�r[i];
		}
	}
}
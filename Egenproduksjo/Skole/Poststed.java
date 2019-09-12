class Poststed {
	private String by;
	private int postnr;

	public Poststed(String by, int postnr) {
		this.by = by;
		this.postnr = postnr;
	}

	public String getBy() {
		return by;
	}

	public int postnr() {
		return postnr;
	}

	public void setBy(String nyBy) {
		this.by = nyBy;
	} 

	public void setPostnr(int nyPostnr) {
		this.postnr = nyPostnr;
	}
}
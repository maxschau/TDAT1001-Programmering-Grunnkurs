class Spor {
	private String navn;
	private String artist;
	private int lengdeISek;

	public Spor(String navn, String artist, int lengdeISek) {
		this.navn = navn;
		this.artist = artist;
		this.lengdeISek = lengdeISek;
	}

	public String getNavn() {
		return navn;
	}

	public String getArtist() {
		return artist;
	}

	public int getLengdeISek() {
		return lengdeISek;
	}

	public void setArtist(String nyArtist) {
		artist = nyArtist;
	}

	public void setNavn(String nyNavn) {
		navn = nyNavn;
	}

	public void sporEqual(String navn1, String artist1, int lengde1) {
		if (navn.equals(navn1) && artist.equals(artist1) && lengdeISek == lengde1) {
			System.out.println("HEi");
		}
	}


}
class Fag {
	private String fagkode; //PRIVATE = Kun klassen kan benytte
	private int antStud;		  //PRIVATE = Kun klassen kan benytte

	public Fag(String fagkode, int antStud) {
		this.fagkode = fagkode;
		this.antStud = antStud;
	}

	public Fag() {
	}



	public String getFagkode() {
		return fagkode;
	}

	public int getAntStud() {
		return antStud;
	}

	public void setAntStud(int antStud) {
		this.antStud = antStud;
	}

	public String toString() {
		return "Fagkode: " + fagkode + ", antall studenter: " + antStud + ".";
	}

}
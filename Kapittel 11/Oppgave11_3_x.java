class Flate {
	public double lengde;
	public double bredde;

	public Flate(double lengde, double bredde) {
		this.lengde = lengde;
		this.bredde = bredde;
	}

	public double getLengde() {
		return lengde;
	}

	public double getBredde() {
		return bredde;
	}

	public void setLengde(double lengde) {
		this.lengde = lengde;
	}

	public void setBredde(double bredde) {
		this.bredde = bredde;
	}

	public String toString() {
		return "Lengde: " + lengde + ", bredde: " + bredde;
	}
}

class Lekeplass {
	private String navn;
	private Flate plassen;

	public Lekeplass(String navn, Flate plass) {
		this.navn = navn;
		this.plassen = plass;
	}
	public Flate getPlass() {
		return plassen;
	}
	public void endrePlass(double lengde) {
		plassen.setLengde(lengde);
	}
}

class Oppgave11_3_x {
	public static void main(String[] args) {
		Flate plass1 = new Flate(4.5,3);
		Lekeplass enLekeplass = new Lekeplass("Lekeplass1", plass1);
		System.out.println("A: " + plass1);
		enLekeplass.endrePlass(8.5);
		plass1.setLengde(5.0);
		plass1 = enLekeplass.getPlass();
		System.out.println("B: " + plass1);
	}
}
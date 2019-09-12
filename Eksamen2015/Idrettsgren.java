class Idrettsgren {
	private String navn;
	private Ovelse[] ovelser;
	private int maksAnt;
	private int antOvelser = 0;

	public Idrettsgren(String navn, int maksAnt) {
		this.navn = navn;
		this.maksAnt = maksAnt;
		ovelser = new Ovelse[0];
		this.ovelser = ovelser;
	}

	public Idrettsgren(String navn, Ovelse[] ovelser) {
		this.navn = navn;
		this.ovelser = ovelser;
	}

	public String toString() {
		String utskriftTabell = "";
		for (int i = 0; i < ovelser.length; i++) {
			utskriftTabell += ovelser[i].toString() + "\n"; 
		}
		return navn + "\n" + utskriftTabell;
	}

	public boolean registrerNyOvelse(String beskrivelse, String kjonn) {
		Ovelse o1 = new Ovelse(beskrivelse, kjonn);

		if(ovelser.length == maksAnt) { //Dersom det er fullt returneres false
			return false;
		}
		for (int i = 0; i < ovelser.length; i++) {
			if (o1.equals(ovelser[i])) {
				return false;
			}
		}

		if (antOvelser == ovelser.length) {
			utvidTabell();
		}
		ovelser[antOvelser] = o1;
		antOvelser++;
		return true;
		
	
		

	}

		public void utvidTabell() {
			Ovelse[] nyTab = new Ovelse[ovelser.length + 1];
			for (int i = 0; i < ovelser.length; i++) {
				nyTab[i] = ovelser[i];
			}
			ovelser = nyTab;
		} 
}
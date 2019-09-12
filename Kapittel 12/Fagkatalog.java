class fagkatalog {
	private Fag[] fagene = new Fag[3];
	private int antFag = 0;

	public boolean registrerNyttFag(String fagkode, String fagnavn) {
		if (finnFagGittKode(fagkode) != null) {
			return false;
		}
		if (antFag == fagene.length) {
			utvidTabell();
		}
		fagene[antFag] = new Fag(fagkode, fagnavn);
		antFag++;
		return true;
	}

	public int finnAntFag() {
		return antFag;
	}

	public Fag finnFagGittIndeks(int indeks) {
		return (indeks >= 0 && indeks < antFag) ? fagene[indeks] : null;
		/*Alternativ metode
		if (indeks >= 0 && indeks < antFag) {
			return fagene[indeks];
		}
		return null;
		*/
	}

	public Fag finnFagGittKode(String fagkode) {
		if (fagkode != null) { //Fagkoden er ikke null
			for (int i = 0; i < antFag; i++) {
				if (fagene[i].getFagkode().equals(fagkode.trim())) { //Fagkodene stemmer overens
					return fagene[i];
				}
			}
		}
		return null;
	}

	public boolean oppdaterAntStud(String fagkode, int antStud) {
		Fag f = finnFagGittKode(fagkode);
		if (f != null) {
			f.setAntStud(antStud);
			return true;
		} else {
			return false;
		}
	}

	public boolean slettFag(String fagkode) {
		if (fagkode != null) {
			for (int i = 0; i < antFag; i++) {
				if (fagene[i].getFagkode().equals(fagkode.trim())) {
					fagene[i] = fagene[antFag - 1];
					antFag--;
					return true;
				}
			}
		}
		return false;
	}

	public String toString() {
		String resultat = "";
		for (int i = 0; i < antFag; i++) {
			resultat += fagene[i].toString() + "\n";
		}
		return resultat;
	}

	private void utvidTabell() {
		Fag[] nyTab = new Fag[fagene.length + 2]; //Ny og større tabell
		for (int i = 0; i < fagene.length; i++) {
			nyTab[i] = fagene[i];
		}
		fagene = nyTab;
	}


	public static void main(String[] args) {
		System.out.println("Totalt antall tes")
	}
}
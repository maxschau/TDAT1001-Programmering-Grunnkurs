class UtleieFirma {
	private String navn;
	private Bil[] utleiebiler;
	private final int MAKS_ANTALL_BILER;
	private int antallBiler;

	public UtleieFirma(String navn, final int MAKS_ANTALL_BILER) {
		if (MAKS_ANTALL_BILER <= 0) {
			throw new IllegalArgumentException("MaksAntallBiler må være et naturlig tall");
		}
		this.navn = navn;
		this.utleiebiler = new Bil[MAKS_ANTALL_BILER];
		this.MAKS_ANTALL_BILER = MAKS_ANTALL_BILER;
		antallBiler = 0;
	}



	public boolean regBil(Bil b) {
		if (b == null) {
			throw new IllegalArgumentException("Ugydlig argument");
		}
		if (antallBiler >= MAKS_ANTALL_BILER) {
			return false;
		}
		if (sokTabell(b)) { //Dersom bilen allerede eksisterer
			return false;
		}

		utleiebiler[antallBiler] = b;
		antallBiler++;
		return true;


	}

	public Bil[] sorter() {
		Bil[] nyTab = new Bil[antallBiler];
		for (int i = 0; i < antallBiler; i++) { //Oppretter en kopi av den originale tabellen
			nyTab[i] = new Bil(utleiebiler[i].getRegnr(), utleiebiler[i].getMotor(), utleiebiler[i].getHjul());
		}

		//Sortering ved utvelgelse

		for (int start = 0; start < antallBiler; start++) {
			int hittilMinste = start;
			for (int i = start + 1; i < antallBiler; i++) {
				if (nyTab[i].getRegnr().compareTo(nyTab[hittilMinste].getRegnr()) < 0) {
					hittilMinste = i;
				}
			}
			Bil hjelp = nyTab[hittilMinste];
			nyTab[hittilMinste] = nyTab[start];
			nyTab[start] = hjelp;
		}

	return nyTab;


	}

	//Privat hjelpmetode for regBil
	private boolean sokTabell(Bil b) {
		for (int i = 0; i < utleiebiler.length; i++) {
			if (b.equals(utleiebiler[i])) {
				return true;
			}
		}
		return false;
	}

}
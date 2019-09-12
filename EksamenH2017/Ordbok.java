class Ordbok implements java.io.Serializable{
	private String ordbokNavn;
	private Ord[] ordbok;
	private int antallReg;
	private final int MAKS_ANTALL_ORD = 10;
	private String filnavn = "ordliste.ser";

	public Ordbok(String ordbokNavn) {
		this.ordbokNavn = ordbokNavn;
		boolean status = lesOrdbokFraFil(filnavn);
		if !(status) {
			this.ordbok = new Ord[MAKS_ANTALL_ORD];
			antallReg = 0;
		}



	}

	//B
	public boolean regNyttOrd(Ord ord) {
		if (getOrd(ord) != null){//Dersom ordet finnes fra før av
			return false;
		}
		if (ord == null) {
			return false;
		}
		if (ordbok.length == MAKS_ANTALL_ORD) { //Dersom lengden på ordboka allerede har nådd maksimal lengde
			return false;
		}
		ordbok[antallReg] = ord;
		antallReg++;
		return true;
	}

	//C
	public boolean leggTilDefinisjon(String ord, String definisjon) {
		if (getOrd(ord) == null) { //Dersom ordet ikke eksisterer i tabellen
			return false;
		}
		getOrd(ord).leggTilDefinisjon(definisjon); //Legger til definisjonen
		return true;
	}

	public Ord[] sorter() {
		//Velger dyp kopiering
		Ord[] nyTab = new Ord[ordbok.length];
		for (int i = 0; i < ordbok.length; i++) {
			nyTab[i] = new Ord(ordbok[i].getNavn(), ordbok[i].getDefinisjoner()); //Kopierer verdiene.
		}

		if(nyTab!= null && nyTab.length > 0) {
			for (int start = 0; start < nyTab.length; start++) {
				int hittilMinst = start;
				for (int i = start + 1; i < nyTab.length; i++) {
					if ((nyTab[hittilMinst].getNavn()).compareTo(nyTab[i].getNavn()) < 0) {
						hittilMinst = i;
					}
				}
				Ord hjelp = nyTab[hittilMinst];
				nyTab[hittilMinst] = nyTab[start];
				nyTab[start] = hjelp;
			}
		}

		return nyTab;


	}

	public Ord getOrd(String sokeStreng) {
		for (int i =0; i < ordbok.length; i++) {
			if (sokeStreng.equals(ordbok[i].getNavn())) { //Dersom sokeStreng er lik et av ordene i tabellen
				return ordbok[i];
			}
		}
		return null;
	}

	public boolean lesOrdbokFraFil(String filnavn) {
		try(FileInputStream innFil = new FileInputStream(filnavn); ObjectInputStream inn = new ObjectInputStream(innFil)) {
			Ord[] lest = (Ord[])inn.readObject();
			ordbok = lest;
			antallReg = 0;
			for (int i = 0; i < ordbok.length; i++) {
				antallReg++;
			}
			return true;

		}catch (EOFException e) {
			System.out.println("Hello");
		} finally {
			innFil.close();
			inn.close();
		}
		return false;
		}



	}


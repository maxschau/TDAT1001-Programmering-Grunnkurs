class Arrangement implements java.io.serializable{
	private String navn;
	private Idrettsgren[] idrettsgrener;
	private static int MAKS_ANTALL;
	private int antallReg;

	public Arrangement(String navn, int MAKS_ANTALL) {
		this.navn = navn;
		this.idrettsgrener = new Idrettsgren[MAKS_ANTALL];
		antallReg = 0;
	}

	public String getNavn() {
		return navn;
	}

	public String toString() {
		String resultat = navn + "\n";
		for (int i = 0; i < idrettsgrener.length; i++) {
			resultat += idrettsgrener[i].toString() + "\n";
		}
		return resultat;
	}

	public boolean regNyIdrettsgren(Idrettsgren i1) {
		if (sjekkTabell(i1)) { //Returnerer false om idrettsgrenen allerede eksisterer
			return false;
		}
		if (antallReg >= MAKS_ANTALL) { //Dersom det ikke er plass
			return false;
		}

		idrettsgrener[idrettsgrener.length] = i1;
		antallReg++;
		return true;
	}

	//Hjelpemetode for regNyIdrettsgren()
	public boolean sjekkTabell(Idrettsgren i1) { //Sjekker om idrettsgren er registrert fra før av
		for (int i = 0; i < idrettsgrener.length; i++) {
			if (i1.equals(idrettsgrener[i])) { //Dersom idrettsgrenen allerede eksisterer
				return true;
			}
		}
		return false;
	}

	public static Arrangement lesFraFil(String filnavn) {
		try(FileInputStream forbFil = new FileInputStream(filnavn); ObjectInputStream leser = new ObjectInputStream(forbFil)) {
			Arrangement a1 = leser.readObject();
			return a1;
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}







}
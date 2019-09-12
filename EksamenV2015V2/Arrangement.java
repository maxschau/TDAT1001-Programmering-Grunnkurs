class Arrangement implements java.io.Serializable {
	private String navn;
	private Idrettsgren[] idrettsgrener;
	private final int MAKS_ANTALL;
	private int antallReg;

	public Arrangement(String navn, int MAKS_ANTALL) {
		this.navn = navn;
		this.MAKS_ANTALL = MAKS_ANTALL;
		this.idrettsgrener = new Idrettsgren[MAKS_ANTALL]; //Oppretter en tabell med MAKS_ANTALL som lengde
		this.antallReg = 0;
	}

	public String toString() {
		String resultat = navn + "\n";
		for (int i = 0; i < antallReg; i++) {
			resultat += idrettsgrener[i].toString() + "\n";
		}
		return resultat;
	}

	public boolean regNyIdrettsgren(Idrettsgren nyIdrett) {
		if (nyIdrett == null) { //Dersom objektet er lik null kastet IllegalArgumentException
			throw new IllegalArgumentException("Ugyldig argument");
		}

		//Sjekker at det er plass i tabellen
		if (antallReg >= MAKS_ANTALL) {
			return false;
		}

		//Sjekker om den eksisterer
		for (int i = 0; i < antallReg; i++) {
			if (nyIdrett.equals(idrettsgrener[i])) { //Returnerer false dersom idrettsgrenen allerede er registrert
				return false;
			}
		}

		//Registrerer idrettsgrenene
		idrettsgrener[antallReg] = nyIdrett;
		antallReg++;
		return true;
	}

	public static Arrangement lesFraFil(String filnavn) {
		try(FileInputStream leseForb = new FileInputStream(filnavn); ObjectInputStream leser = new ObjectInputStream(leseForb)) {
			Arrangement a1 = (Arrangement)leser.readObject(); //Leser objektet og caster det slik at det er av klassen Arrangement
			return a1;
		}catch(IOExceptin ioe) {
			ioe.printStackTrace();
			return null;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}catch(Exception e) {
			e.printStackTrace();
			return null:
		}

	}



}
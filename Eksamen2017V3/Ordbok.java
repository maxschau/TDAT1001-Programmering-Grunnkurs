import java.io.*;

class Ordbok implements java.io.Serializable {
	private String ordbokNavn;
	private Ord[] ordbok;
	private int antallReg;
	private final int MAKS_ANTALL_ORD = 10;
	private String filnavn = "ordliste.ser";

	public Ordbok(String ordbokNavn) {
		this.ordbokNavn = ordbokNavn;
		boolean status = lesOrdbokFraFil(filnavn);
		if (!(status)) { //Dersom ikke lesOrdBokFraFil returnere true
			ordbok = new Ord[MAKS_ANTALL_ORD];
			antallReg = 0;
		}
	}
	public boolean regNyttOrd(Ord ord) {
		//Sjekker at det er plass i ordboken
		if (antallReg >= MAKS_ANTALL_ORD) {
			return false; //Returnerer false dersom den er full
		}
		//Sjekker at den ikke eksisterer fra før av
		for (int i = 0; i < antallReg; i++) { //Går gjennom ordboka og sjekker om argumentet ord er likt et av elementene i tabellen
			if(ord.equals(ordbok[i])) {
				return false; //Returnerer false ved likhet
			}
		}
		//Registrer det nye ordet
		ordbok[antallReg] = ord;
		antallReg++;
		return true;
	}

	public boolean leggTilDefinisjon(String ord, String definisjon) {
		if (ord == null || definisjon == null) {
			throw new IllegalArgumentException("Ugyldig(e) argument(er)");
		}
		//Bruker metoden getOrd som sjekker at ordet er registrert i tabellen
		Ord o1 = getOrd(ord);
		if (o1 == null) { //Dersom ordet ikke eksister er det ingenting å legge til en definisjon til.
			return false;
		}

		//Oppgaven sier at jeg ikke trenger å ta hensyn til om definisjonen eksisterer fra før av eller ei, så jeg ser bort i fra hva leggTilDefinisjon returnerer
		o1.leggTilDefinisjon(definisjon);
		return true;
	}

	public Ord[] sorter() {
		//Lager en dyp kopi av objektvariabelen ordbok
		Ord[] kopi = new Ord[antallReg];
		for (int i = 0; i < antallReg; i++) {
			kopi[i] = new Ord(ordbok[i].getNavn(), ordbok[i].getDefinisjoner()); //Lager en dyp kopi av objektet i tabellen
		}

		//Bruker sortering ved utvelgelses-algoritmen:
		for (int start = 0; start < kopi.length; start++) {
			int hittilMinst = start;
			for (int j = start + 1; j < kopi.length; j++) {
				if (kopi[j].getNavn().compareTo(kopi[hittilMinst].getNavn()) < 0) {
					hittilMinst = j;
				}
			}

			//Bytter plass:
			Ord hjelp = kopi[hittilMinst];
			kopi[hittilMinst] = kopi[start];
			kopi[start] = hjelp;
		}
		return kopi;
	}

	public Ord getOrd(String sokeStreng) {
		if (sokeStreng == null) {
			throw new IllegalArgumentException("Ugyldig argument");
		}

		for (int i = 0; i < antallReg; i++) {
			if(sokeStreng.equals(ordbok[i].getNavn())) { //Søker gjennom tabellen og sjekker om sokeStreng er likt navnet til et av ordene i ordboken
				return ordbok[i]; //Returnerer objektet
			}
		}
		return null;  //Returnerer null dersom det ikke finnes
	}

	public boolean lesOrdbokFraFil(String filnavn) {
		try(FileInputStream leseForb = new FileInputStream(filnavn); ObjectInputStream leser = new ObjectInputStream(leseForb)) {
			this.ordbok = (Ord[])leser.readObject(); //Leser tabellen fra fil
			this.antallReg = ordbok.length;
			return true;
		}catch(IOException IOE) {
			IOE.printStackTrace();
			return false;
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}


	}




}
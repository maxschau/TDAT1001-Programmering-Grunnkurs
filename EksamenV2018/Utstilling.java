class Utstilling implements java.io.serializable{
	//Oppgave 3A
	private String navn;
	private Kunstverk[] kunstverk;

	//Oppgave 3B:
	public Utstilling(String navn, String filnavn) {
		this.navn = navn;
		lesFraFil(filnavn);
	}

	//Metode som leser fra fil og gir objektvariabelen kunstverk en verdi fra filen
	public boolean lesFraFil(String filnavn) {
		try(FileInputStream lesForb = new FileInputStream(filnavn); ObjectInputStream leser = new ObjectInputStream(lesForb)) {
			//Antar at alt er lagret i en tabell
			this.kunstverk = leser.readObject();
			return true;
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	//Oppgave 3C:
	public Kunstverk[] sorter(Kunstner kunstner) {
		Kunstverk[] tabell = lagTabell(kunstner); //Lager en tabell med kunstverkene tilhørende kunstneren
		//Sortering ved utvelgelse
		for (int start = 0; start < tabell.length; start++) {
			int hittilMinste = start;
			for (int i = start + 1; i < tabell.length; i++) {
				if ((tabell[i].getNavn()).compareTo((tabell[hittilMinste].getNavn())) < 0){ //Dersom neste elementet er mindre enn hittilMinste
					hittilMinste = i;
				}
			}
			Kunstverk hjelp = tabell[hittilMinste];
			tabell[hittilMinste] = tabell[start];
			tabell[start] = hjelp;
		}

		return tabell;

	}


	//Hjelpemetoder til oppgave 3C
	private Kunstverk[] lagTabell(Kunster kunstner) {
		Kunstverk[] k1 = new Kunstverk[0]; //Oppretter først en tom tabell
		for (int i = 0; i < kunstverk.length; i++) {
			if (kunstner.equals(kunstverk[i].getKunstner())) {//Dersom kunstneres eksisterer i tabellen
				utvidTabell(k1);
				k1[k1.length-1] = kunstverk[i]; //Legger til elementet i den nye tabellen
			}
		}
		return k1;

	}


	private void utvidTabell(Kunstverk[] tabell) {
		Kunstverk[] nyTab = new Kunstverk[tabell.length + 1];
		for (int i = 0; i < tabell.length; i++) {
			nyTab[i] = tabell[i];
		}
		tabell = nyTab;
	}


	//Oppgave 3D:
	public String toString() {
		String resultat = navn + "\n" + "Kunstobjekter på utstillingen:" + "\n";
		for (int i = 0; i < kunstverk.length; i++) {
			resultat += kunstverk[i].toString() + "\n";
		}
	}

	//Oppgave 4A:
	public boolean skrivTilFil() {
		String filnavn = "kunstverk.ser";
		try(FileOutputStream forbTilFil = new FileOutputStream(filnavn); ObjectOutputStream skriver = new ObjectOutputStream(forbTilFil)) {
			for (int i = 0; i < kunstverk.length; i++) {
				skriver.writeObject(kunstverk[i]);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

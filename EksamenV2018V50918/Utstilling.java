import java.io.*;
class Utstilling implements java.io.Serializable {
	private String navn;
	private Kunstverk[] kunstverk;

	public Utstilling(String navn, Kunstverk[] kunstverk) {
		this.navn = navn;
		this.kunstverk = kunstverk; //Aggregering da kunstverk kan leve uavhengig av utstilling
	}

	public Kunstverk[] sorter() {
		//Lager først en dyp kopi av tabellen kunstverk
		Kunstverk[] nyTab = new Kunstverk[kunstverk.length];
		for (int i = 0; i < kunstverk.length; i++) {
			//Dyp kopiering av objektene
			nyTab[i] = new Kunstverk(kunstverk[i].getNavn(),kunstverk[i].getType(), kunstverk[i].getAntKopier(), kunstverk[i].getNr(),kunstverk[i].getKunstner());
		}

		//Sortering ved utvelgelse:
		for (int start = 0; start < nyTab.length; start++) {
			int hittilMinste = start;
			for (int i = start + 1; i < nyTab.length; i++) {
				if (nyTab[i].getNavn().compareTo(nyTab[hittilMinste].getNavn()) < 0) {
					hittilMinste = i;
				}
			}
			//Bytter plass:
			Kunstverk hjelp = nyTab[hittilMinste];
			nyTab[hittilMinste] = nyTab[start];
			nyTab[start] = hjelp;
		}
		return nyTab;
	}

	public String toString() {
		String resultat = navn + "\n" + "Kunstobjekter på utstillingen" + "\n";
		for (int i = 0; i < kunstverk.length;i++) {
			resultat += kunstverk[i].toString() + "\n";
		}
		return resultat;
	}

	public boolean skrivTilFil(String filnavn) {
		try(FileOutputStream forbFil = new FileOutputStream(filnavn); ObjectOutputStream skriver = new ObjectOutputStream(forbFil)) {
			skriver.writeObject(kunstverk);
			return true;
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}catch(IOException e) {
			e.printStackTrace();
			return false;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean leggTilKunstverk(Kunstverk nyttKunstverk) {
		utvidTabell(); //Bruker hjelpemetoden utvidTabell() for å få plass til nytt Kunstverk
		kunstverk[kunstverk.length-1] = nyttKunstverk;
		return true;

	}

	private void utvidTabell() {
		Kunstverk[] nyTab = new Kunstverk[kunstverk.length + 1]; //Øker med 1
		for (int i = 0; i < kunstverk.length; i++) {
			//Grunn kopiering av objektene
			nyTab[i] = kunstverk[i];
		}
		kunstverk = nyTab;
	}

}
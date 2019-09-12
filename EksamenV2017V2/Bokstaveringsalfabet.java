import java.io.*;

class Bokstaveringsalfabet {
	//Oppgave A:
	private String navn;
	private String[] alfabet;
	private char skilletegn;


	//Oppgave B:
	public Bokstaveringsalfabet(String navn, String alfabet, char skilletegn) {
		this.navn = navn;
		this.alfabet = alfabet.split(skilletegn);
		this.skilletegn = skilletegn;
	}

	//Oppgave C:
	public Bokstaveringsalfabet(String filnavn) {
		if (filnavn == null) {
			//??
		}
		this.alfabet = lesAlfabetFraFil(filnavn);
	}

	//Oppgave D:
	public String toString() {
		String resultat = "";
		for (int i = 0; i < alfabet.length; i++) {
			resultat += alfabet[i] + skilletegn;
		}
		return resultat;
	}

	//Oppgave E:
	public boolean registrerOrd(String nyttOrd) {
		if (sokAlfabet(nyttOrd)) {
			return false;
		}
		utvidTabell();
		alfabet[alfabet.length - 1] = nyttOrd;
		return true;

	}


	//Oppgave F:
	public boolean endreBeskrivelse(char bokstav, String nyttOrd) {
		if (finnesITabell(bokstav) != null) { //dersom den eksisterer
			alfabet[finnesITabell(bokstav)] = nyttOrd;
			return true;
		}
		return false;
	}

	//Oppgave G:
	public void sorter() { //Sorteringsalgoritmen sortering ved utvelgelse
		for (int start = 0; start < alfabet.length; start++) {
			int hittilMinste = start;
			for (int i = start + 1; i < alfabet.length; i++) {
				if (alfabet[i].compareTo(alfabet[hittilMinste]) < 0) { //Dersom elementet I er mindre (dvs. ligger foran) hittilMinste
					hittilMinste = i;
				}
			}
			//Bytter plasser:
			String hjelp = alfabet[hittilMinste];
			alfabet[hittilMinste] = alfabet[start];
			alfabet[start] = hjelp;
		}

	}


	//Oppgave H:
	public String konverter(String tekst) {
		String resultat = tekst + ": ";
		for (int i = 0; i < tekst.length(); i++) {
			if (finnesITabell(i) != null) { //Dersom den eksisterer i tabellen
				tekst += alfabet[finnesITabell(i)] + " "; //Legger til tekst
			} else { //Eksisterer ikke
				tekst += "Ukjent "; //Legger til "ukjent"
			}
		}
		return resultat;

	}

	private boolean finnesITabell(char Bokstav) {
		for (int i = 0; i < alfabet.length; i++) {
			if (bokstav.equals(alfabet.charAt(i))) {
				return i; //Returnerer indeksen dersom den eksisterer i tabellen
			}
		}
		return null; //Returnerer null om den ikke eksisterer
	}

	//Oppgave I:
	public skrivTilFil(String filnavn) {
		try(FileWriter forbTilFil = new FileWriter(filnavn,true); PrintWriter skriver = new PrintWriter(new BufferedWriter(forbTilFil))) {
			skriver.println(skilletegn);
			String tekst = "";
			for (int i = 0; i < alfabet.length; i++) {
				tekst += alfabet[i] + skilletegn;
			}
			skriver.println(tekst);

		}catch(IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace;
		}
	}

	//Oppgave J:
	public lesAlfabetFraFil(String filnavn) {
		try (FileReader leseForb = new FileReader(filnavn); BufferedReader leser = new BufferedReader(leseForb)) {
			String skilletegn = leser.readLine(); //Finner første skilletegnet
			String[] tabell = leser.ReadLine().split(skilletegn); //Lager en tabell med metoden split, splittet av skilletegn
			return tabell;
		}catch(IOException IOE) {
			IOE.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}



	//Hjelpemetoder:
	private boolean sokAlfabet(String sokeOrd) { //Metode som søker gjennom alfabetet etter ordet sendt inn som parameter
		for (int i = 0; i < alfabet.length; i++) {
			if (sokeOrd.equals(alfabet[i])) { //Dersom sokeOrdet er likt et annet ord i tabellen
				return true;
			}
		}
		return false;
	}

	private void utvidTabell() {
		String[] nyTab = alfabet[alfabet.length + 1]; //Utvider tabellen med ett element
		for (int i = 0; i < alfabet.length; i++) {
			nyTab[i] = alfabet[i];
		}
		alfabet = nyTab;

	}






}
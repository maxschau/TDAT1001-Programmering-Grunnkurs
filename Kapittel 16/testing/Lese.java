import java.io.*;

class Lese {

	public Lese() {
	}

	public String LesHeleFil(String filnavn) {
		String lestTekst = "";
		try(FileReader forbFil = new FileReader(filnavn); BufferedReader leser = new BufferedReader(forbFil)) {
			String tekst = leser.readLine();
			while (tekst != null) {
				lestTekst += tekst;
				tekst = leser.readLine();
			}
			forbFil.close();

		}catch (IOException ioe) {
			System.out.println("IO-Feil: " + ioe);
		}
		return lestTekst;
	}

	public boolean skrivTilTekst(String filnavn, String tekst) {
		if (filnavn == null || tekst == null) {
			throw new IllegalArgumentException("Illegale argumenter");
			//return false;
		}
		try(FileWriter forbFil = new FileWriter(filnavn,true); PrintWriter skriver = new PrintWriter(new BufferedWriter(forbFil))) {
			skriver.println(tekst);
			skriver.close();
			return true;
		}catch(IOException ioe) {
			System.out.println("IO-Feil: " + ioe);
		}
		return false;

	}

	public boolean skrivObjektTilFil(String filnavn, Object obj) {
		if (filnavn == null || obj == null) {
			throw new IllegalArgumentException("Illegale argumenter");
		}
		try(FileOutputStream utstrom = new FileOutputStream(filnavn); ObjectOutputStream ut = new ObjectOutputStream(utstrom)) {
			ut.writeObject(obj);
			ut.close();
			return true;

		}catch (IOException ioe) {
			System.out.println("IO-feil: " + ioe);
		}catch (Exception e) {
			System.out.println("Annen feil");
		}
		return false;

	}

}
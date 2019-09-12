import java.io.*;


class Klubber implements Serializable {
	private String navn;
	private int grunnlagt;

	public Klubber(String navn, int grunnlagt) {
		this.navn = navn;
		this.grunnlagt = grunnlagt;
	}


	public static void main(String[] args) {
		String filnavn = "Klubber.txt";
		/*try(FileWriter forbTilFil = new FileWriter(filnavn,true); PrintWriter skriver = new PrintWriter(new BufferedWriter(forbTilFil))) {
			skriver.println("HEI");
			skriver.close();
		}catch (IOException ioe) {
			System.out.println("IO-feil: " + ioe);
		}*/

		/*try(FileReader forbTilFil = new FileReader(filnavn); BufferedReader leser = new BufferedReader(forbTilFil)) {
			String tekst = leser.readLine();
			while (tekst != null) {
				System.out.println(tekst + "\n");
				tekst = leser.readLine();
			}
			leser.close();
		}catch (IOException ioe) {
			System.out.println("IO-feil: " + ioe);
		}*/
		Klubber k1 = new Klubber("VIF", 1913);
		
		try (FileOutputStream utstrom = new FileOutputStream(filnavn1); ObjectOutputStream ut = new ObjectOutputStream(utstrom)) {
			ut.writeObject(k1);
			ut.close();

		}catch (IOException ioe) {
			System.out.println("IO-Feil: " + ioe);
		}

		String filnavn1 = "Klubber.ser";
		try(FileInputStream innstrom = new FileInputStream(filnavn1); ObjectInputStream inn = new ObjectInputStream(innstrom)) {
			while(true) {//Stoppes når EOFEException kastet
				Object obj = inn.readObject();
				System.out.println(obj);
			}
		}catch (EOFEException e) {
		}
		inn.close();




	}
}

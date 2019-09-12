import java.io.*;
import static javax.swing.JOptionPane.*;

class Oppgave {
	public static void main(String[] args) throws IOException {
		String filnavn = "mineData.txt";
		String filnavn2 = "dineData.txt";
		FileReader leserForbTilFil = new FileReader(filnavn);
		BufferedReader leser = new BufferedReader(leserForbTilFil);

		
		int teller = 0;
		String etNavn = leser.readLine();

		FileWriter skriveForbTilFil = new FileWriter(filnavn2,true);
		PrintWriter skriver = new PrintWriter(new BufferedWriter(skriveForbTilFil));

		while (etNavn != null) {
			skriver.println(etNavn.toUpperCase());
			teller++;
			etNavn = leser.readLine();

		}
		skriver.close();
		System.out.println(teller);
		

	}


}
import java.io.*;
class LesingFraFil {
	public static void main(String[] args) {
	String lestTekst = "";
	String filnavn = "test.txt";
	try(FileReader leseForb = new FileReader(filnavn); BufferedReader leser = new BufferedReader(leseForb)) {
		String tekst = leser.readLine();
		while (tekst != null) {
			lestTekst += tekst + "\n";
			tekst = leser.readLine();
		}
		System.out.println(lestTekst);
		leser.close();

	}catch (IOException ioe) {
		System.out.println("Hello");
	}
	}
}
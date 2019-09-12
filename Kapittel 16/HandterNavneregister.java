import java.io.*;
import static javax.swing.JOptionPane.*;

class HandterNavneregister {
	public static void main(String[] args) throws IOException {
		String filnavn = "navnefil.txt";

		FileReader leserforbTilFil = new FileReader(filnavn);
		BufferedReader leser = new BufferedReader(leserforbTilFil);

		String etNavn = leser.readLine();
		String innlesteNavn = "Følgende navn er registrert: ";
		while (etNavn != null) {
			innlesteNavn += ("\n" + etNavn);
			etNavn = leser.readLine();
		}
		leser.close();
		showMessageDialog(null, innlesteNavn);

		int svar = showConfirmDialog(null, "Skal flere navn registreres?", "Navneregister", YES_NO_OPTION);
		if (svar == YES_OPTION) {
			FileWriter skriveforbTilFil = new FileWriter(filnavn, true);
			PrintWriter skriver = new PrintWriter(new BufferedWriter(skriveforbTilFil));
			while (svar == YES_OPTION) {
				String nyttNavn = showInputDialog("Oppgi et navn");
				skriver.println(nyttNavn);
				svar = showConfirmDialog(null, "Skal flere navn registreres?", "Navneregister", YES_NO_OPTION);				
			}
		skriver.close();			
		}		
	}

}
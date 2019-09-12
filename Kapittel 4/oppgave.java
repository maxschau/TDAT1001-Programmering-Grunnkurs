import static javax.swing.JOptionPane.*;
class oppgave {
	public static void main(String[] args) {
		String setning = "";
		String ord = "";
		do {
		setning += (ord + " ");
		ord = showInputDialog("Skriv ett ord, avslutt med Esc. ");
		} while (ord != null); //Do kjøres så lenge ord IKKE er lik null.
		showMessageDialog(null, setning);

	}
}
//Først måtte variabelen ord deklareres utenfor do-setningen
//I tillegg blir ordet "null" med i listen når man trykker escape.
//Løses ved å definere at ord i utgangspunktet = "".
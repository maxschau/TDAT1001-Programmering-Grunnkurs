import static javax.swing.JOptionPane.*;
class oppgave {
	public static void main(String[] args) {
		String setning = "";
		String ord = "";
		do {
		setning += (ord + " ");
		ord = showInputDialog("Skriv ett ord, avslutt med Esc. ");
		} while (ord != null); //Do kj�res s� lenge ord IKKE er lik null.
		showMessageDialog(null, setning);

	}
}
//F�rst m�tte variabelen ord deklareres utenfor do-setningen
//I tillegg blir ordet "null" med i listen n�r man trykker escape.
//L�ses ved � definere at ord i utgangspunktet = "".
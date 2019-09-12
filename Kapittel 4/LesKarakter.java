import static javax.swing.JOptionPane.*;

class LesKarakter {
	public static void main(String[]args) {
		/*Teknikk 1: Brukeren får ikke spesiallaget feilmelding */
		String karakterS; //Karakter i String
		char karakter;    //Karakter som char
		do {
			karakterS = showInputDialog("Skriv inn bokstavkarakter (A-F): ");
			karakter = karakterS.charAt(0); //Henter første tegn av det bruker skriver inn
		} while (karakter < 'A' || karakter > 'F');
		showMessageDialog(null, "Gratulerer! Du klarte det, du skrev " + karakter + "!");

		/*Teknikk 2: Brukeren får spesiallaget feilmelding. */
		karakterS = showInputDialog("Skriv bokstavkarakter (A-F): ");
		karakter = karakterS.charAt(0);
		while (karakter < 'A' || karakter > 'F') {
			karakterS = showInputDialog("Ugyldig karakter, du må skrive en karakter i intervallet A-F. Prøv igjen: ");
			karakter = karakterS.charAt(0);
		}
		showMessageDialog(null, "Gratulerer. Du har skrevet inn: " + karakter + "!");

	}
}
import static javax.swing.JOptionPane.*;
class Oppgave3 {
	public static void main(String[]args) {

		String tekstLest = showInputDialog("Skriv inn tekst");
		while (tekstLest != null) {
			Tekstanalyse tekst1 = new Tekstanalyse(tekstLest);

			System.out.println("Du skrev inn: " + tekstLest + ". Slik ser analysen ut: ");
			System.out.println("Det er totalt: " + tekst1.finnAntallForskjelligeBokstaver() + " forskjellige bokstaver i teksten.");
			System.out.println("Det er totalt: " + tekst1.finnAntallBokstaver() + " bokstaver i teksten.");
			System.out.println(tekst1.finnProsIkkeBokstaver() + "% av teksten er ikke bokstaver (Sjekker punktum, komma og space).");
			System.out.println("Av bokstaven T er det totalt: " + tekst1.finnAntallForekomster("T") + " forekomst(er).");
			System.out.println("Det er flest forekomster av: " + tekst1.finnFlestForekomster());






			tekstLest = showInputDialog("Skriv inn tekst");
		} //while

	}//main
}//class
import static javax.swing.JOptionPane.*;

	class oppgave3 {
	public static void main(String[]args) {

	int sekunder = Integer.parseInt(showInputDialog("Skriv inn sekunder"));

	int sekTilTime = sekunder/3600; //Gjør om til timer.
	int sekTilMin = (sekunder % 3600)/60; //Gjør om restende av timen til minutter.
	int sekTilSek = sekunder - sekTilTime*3600 - sekTilMin*60; //Tar totalen og fjerner henholdsvis de andre sekundene brukt for å finne de resterende sekundene.


	showMessageDialog(null, sekunder + " sekunder er " + sekTilTime + " timer, "+ sekTilMin + " minutter og " + sekTilSek + " sekunder.");
}
}
import static javax.swing.JOptionPane.*;
class oppgaveA  {
	public static void main(String[]args) {
	String antallLinjerLest = showInputDialog("Skriv antall linjer du ønsker: ");
	int antallLinjer = Integer.parseInt(antallLinjerLest);
	String tegn = "";
		for (int teller= 1; teller <= antallLinjer; teller++) {
			tegn += '*';
			System.out.println(tegn);
		}
	}
}
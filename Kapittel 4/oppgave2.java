import static javax.swing.JOptionPane.*;

class oppgave2 {
	public static void main(String[]args) {

		int sum = 0;
		String tallLest = showInputDialog("Skriv inn et tall, Esc for å avslutte ");
		do {
			int tall = Integer.parseInt(tallLest);
			sum += tall;
			tallLest = showInputDialog("Skriv inn et tall, Esc for å avslutte ");
		} while(tallLest != null);
		showMessageDialog(null, sum);
		showMessageDialog(null, 14 % 3);
	}
}

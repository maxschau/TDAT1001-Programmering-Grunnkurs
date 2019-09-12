import static javax.swing.JOptionPane.*;

class Oppg4_3_2 {
	public static void main(String[] args) {
		int grunntall = Integer.parseInt(showInputDialog("Skriv inn grunntall"));
		int eksponent = Integer.parseInt(showInputDialog("Skriv inn eksponent"));

		int teller = 1;
		int sum = grunntall;

		while (teller < eksponent) {
			sum *= grunntall;
			teller ++;
		}
	showMessageDialog(null, "Svaret er: " + sum);
	}
}
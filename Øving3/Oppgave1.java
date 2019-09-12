import static javax.swing.JOptionPane.*;

class Oppgave1 {
	public static void main(String[]args) {

		String valgLest;
		int valg;

		do {
		valgLest = showInputDialog("Vennligst skriv hvilken gangetabell du vil se (13, 14, 15)");
		valg = Integer.parseInt(valgLest);
		} while(!(valg >= 13 && valg <= 15)); //Hvis valget ikke er mellom 13 og 15 (integer)

		if (valg == 13) {
		//13 Gangen:
		System.out.println("13-gangen: ");
		for (int teller = 1; teller <= 10; teller ++) {
			int sum = 13 * teller;
			System.out.println("13 x " + teller + "= "+ sum);
			}
		} else if (valg == 14) {

		//14 Gangen:
		System.out.println("14-gangen: ");
				for (int teller = 1; teller <= 10; teller ++) {
					int sum = 14 * teller;
					System.out.println("13 x " + teller + "= "+ sum);
			}
		} else {
		//15 Gangen:
		System.out.println("15-gangen: ");
				for (int teller = 1; teller <= 10; teller ++) {
					int sum = 15 * teller;
					System.out.println("13 x " + teller + "= "+ sum);
			}

		}
		//valgLest = showInputDialog("Vennligst skriv hvilken gangetabell du vil se (13, 14, 15)");


	}
}
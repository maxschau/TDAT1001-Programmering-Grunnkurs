import static javax.swing.JOptionPane.*;
class oppgave1igjen {
	public static void main(String[]args) {
		String valgLest1 = showInputDialog("Vennligst skriv hvilken del av gangetabellen du �nsker (laveste tall)");
		String valgLest2 = showInputDialog("Vennligst skriv hvilken del av gangetabellen du �nsker (h�yeste tall)");

		while (valgLest1 !=null && valgLest2 != null) { //S� lenge Esc ikke er trykket
			int valg1 = Integer.parseInt(valgLest1);
			int valg2 = Integer.parseInt(valgLest2);


			for (int teller1 = valg1; teller1 <= valg2; teller1 ++) { //Kj�rer gjennom antall ganger bruker �nsker
				for (int teller2 = 1; teller2 <= 10; teller2 ++) {//Gangetabellen
					int sum = teller1 * teller2;
					System.out.println(teller1 + " x "+ teller2 + " = " + sum);
				}
				System.out.println('\n');


			}
		valgLest1 = showInputDialog("Vennligst skriv hvilken del av gangetabellen du �nsker (laveste tall)");
		valgLest2 = showInputDialog("Vennligst skriv hvilken del av gangetabellen du �nsker (h�yeste tall)");
		}



	}
}
import static javax.swing.JOptionPane.*;
class oppgave1igjen {
	public static void main(String[]args) {
		String valgLest1 = showInputDialog("Vennligst skriv hvilken del av gangetabellen du ønsker (laveste tall)");
		String valgLest2 = showInputDialog("Vennligst skriv hvilken del av gangetabellen du ønsker (høyeste tall)");

		while (valgLest1 !=null && valgLest2 != null) { //Så lenge Esc ikke er trykket
			int valg1 = Integer.parseInt(valgLest1);
			int valg2 = Integer.parseInt(valgLest2);


			for (int teller1 = valg1; teller1 <= valg2; teller1 ++) { //Kjører gjennom antall ganger bruker ønsker
				for (int teller2 = 1; teller2 <= 10; teller2 ++) {//Gangetabellen
					int sum = teller1 * teller2;
					System.out.println(teller1 + " x "+ teller2 + " = " + sum);
				}
				System.out.println('\n');


			}
		valgLest1 = showInputDialog("Vennligst skriv hvilken del av gangetabellen du ønsker (laveste tall)");
		valgLest2 = showInputDialog("Vennligst skriv hvilken del av gangetabellen du ønsker (høyeste tall)");
		}



	}
}
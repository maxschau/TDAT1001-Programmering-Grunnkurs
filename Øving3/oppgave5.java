import static javax.swing.JOptionPane.*;
	class oppgave5 {
		public static void main(String[]args) {

			//Sjekke om et tall er primtall
			String tallLest = showInputDialog("Skriv inn ett tall: ");
			int tall = Integer.parseInt(tallLest);
			boolean primtall = true;

			do {
				for (int teller = 2; teller < tall; teller++) { //Sjekker om det ikke er et primtall
					if ((tall % teller) == 0) { //Tallet er delelig på et annet tall
						showMessageDialog(null, tall + " er ikke et primtall");
						primtall = false;
						break; //Hopper ut av metoden
					}
					primtall = true;

				}
				if (primtall) { //Dersom det er et primtall
					showMessageDialog(null, tall + " er et primtall");
				}
				tallLest = showInputDialog("Skriv inn ett tall: ");
				tall = Integer.parseInt(tallLest);

			} while (tallLest!= null); //Kjører så lenge escape ikke er trykket

		}
	}
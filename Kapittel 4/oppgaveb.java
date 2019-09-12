import static javax.swing.JOptionPane.*;

	class oppgaveb {
		public static void main(String[]args) {
			String tallLest = showInputDialog("Skriv inn ønsket antall linjer: ");
			int tall = Integer.parseInt(tallLest);
			String tegn = "";

			for (int teller= 1; teller <= tall; teller++) {
						tegn += '*';
						System.out.println(tegn);
			}

		}
	}
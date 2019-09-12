import static javax.swing.JOptionPane.*;

	class skrivMangeLinjer {
		public static void main(String[]args) {
			int teller = 0;
			int ganger = Integer.parseInt(showInputDialog("Hvor mange ganger skal linjen kjøres?"));
			while (teller < ganger) {
				System.out.println("Dette er en linje");
				teller += 1;
			}
		}
	}
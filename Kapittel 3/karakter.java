import static javax.swing.JOptionPane.*;

	class karakter {
		public static void main(String[]args) {
			int poeng = Integer.parseInt(showInputDialog("Skriv inn poengsum"));

			final int MAKS = 100;
			final int min = 0;
			final int A = 96;
			final int B = 86;
			final int C = 71;
			final int D = 55;
			final int E = 36;

			String resultat = "Poengsum " + poeng + "gir karakter: ";

			if (poeng > MAKS || poeng < min) {
				resultat = "Ugyldig poengsum";
			} else if  (poeng >=A){
				resultat += "A";
			} else if  (poeng >=B){
				resultat += "A";
			} else if  (poeng >=C){
				resultat += "A";
			} else if  (poeng >=D){
				resultat += "A";
			} else if  (poeng >=E){
				resultat += "A";
			} else {
				resultat += "F";}
			}

		}

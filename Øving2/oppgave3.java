import static javax.swing.JOptionPane.*;

	class oppgave3 {
		public static void main(String[]args) {
		int arstall = Integer.parseInt(showInputDialog("Skriv inn et årstall"));
		int rest1 = arstall % 100;
		int rest2  = arstall % 400;
		int rest3 = arstall % 4;

		if (rest1 == 0) { //Om det er et hundreår
			if (rest2 == 0) { //Om det er delelig med 400
				showMessageDialog(null, arstall + " er et skuddår");
			} else {
				showMessageDialog(null, arstall + " er ikke et skuddår");
				return; //Hopper ut av metoden. Resten av koden vil ikke kjøres
			}
		}
		if (rest3 == 0) { //Om det er delelig med 4
			showMessageDialog(null, arstall + " er et skuddår");
			} else {
			showMessageDialog(null, arstall + " er ikke et skuddår");
			}

			}
		}
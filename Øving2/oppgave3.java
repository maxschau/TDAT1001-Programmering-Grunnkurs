import static javax.swing.JOptionPane.*;

	class oppgave3 {
		public static void main(String[]args) {
		int arstall = Integer.parseInt(showInputDialog("Skriv inn et �rstall"));
		int rest1 = arstall % 100;
		int rest2  = arstall % 400;
		int rest3 = arstall % 4;

		if (rest1 == 0) { //Om det er et hundre�r
			if (rest2 == 0) { //Om det er delelig med 400
				showMessageDialog(null, arstall + " er et skudd�r");
			} else {
				showMessageDialog(null, arstall + " er ikke et skudd�r");
				return; //Hopper ut av metoden. Resten av koden vil ikke kj�res
			}
		}
		if (rest3 == 0) { //Om det er delelig med 4
			showMessageDialog(null, arstall + " er et skudd�r");
			} else {
			showMessageDialog(null, arstall + " er ikke et skudd�r");
			}

			}
		}
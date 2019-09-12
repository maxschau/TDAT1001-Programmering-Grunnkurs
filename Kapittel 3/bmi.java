import static javax.swing.JOptionPane.*;

	class bmi {
		public static void main(String[]args) {
			double vekt = Double.parseDouble(showInputDialog("Skriv inn din vekt"));
			double hoyde = Double.parseDouble(showInputDialog("Skriv inn din høyde"));

			if (vekt > 0 && hoyde > 0) {
				double bmi = (vekt/(hoyde*hoyde));
				showMessageDialog(null,bmi);
				} else {
					showMessageDialog(null,"Du har skrevet inn ugyldige verdier");
					}
			}
		}

		if (storrelse > 38) {
			System.outPrinln("Stor");
			} else {
				System.outPrinln("Liten);
				}
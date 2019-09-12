import static javax.swing.JOptionPane.*;

	class navn {
		public static void main(String[]args) {
		String navnLest = showInputDialog("Skriv inn ett navn");
		String forrigeNavnLest = "";

		while (navnLest != null) { //Så lenge esc ikke er tastet
			forrigeNavnLest = navnLest;
			if (!navnLest.equals(forrigeNavnLest)) {
				showMessageDialog(null, "De to foregående navnene er ikke det samme");
			} else {
				showMessageDialog(null, "De to foregående navnene er like");
				}
			navnLest = showInputDialog("Skriv inn ett navn");
		}



		}
	}
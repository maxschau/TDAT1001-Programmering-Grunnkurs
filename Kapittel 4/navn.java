import static javax.swing.JOptionPane.*;

	class navn {
		public static void main(String[]args) {
		String navnLest = showInputDialog("Skriv inn ett navn");
		String forrigeNavnLest = "";

		while (navnLest != null) { //S� lenge esc ikke er tastet
			forrigeNavnLest = navnLest;
			if (!navnLest.equals(forrigeNavnLest)) {
				showMessageDialog(null, "De to foreg�ende navnene er ikke det samme");
			} else {
				showMessageDialog(null, "De to foreg�ende navnene er like");
				}
			navnLest = showInputDialog("Skriv inn ett navn");
		}



		}
	}
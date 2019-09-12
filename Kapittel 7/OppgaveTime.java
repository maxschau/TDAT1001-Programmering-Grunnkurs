import static javax.swing.JOptionPane.*;
class OppgaveTime {
	public static void main(String[]args) {

		int[] måned = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int svar = showConfirmDialog(null, "Er det et skuddår?", "År", YES_NO_OPTION);

		if (svar == YES_OPTION) {
			måned[1] = 29;
		}

		for (int i = 0; i < måned.length; i++) {
			System.out.println(måned[i]);
		}





	}
}
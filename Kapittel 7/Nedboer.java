import static javax.swing.JOptionPane.*;
class Nedboer {
	public static void main(String[]args) {
		final int ANT_DAG = 7;

		int[] dager = new int[ANT_DAG];
		for (int i = 0; i < dager.length; i++) {
			String tallLest = showInputDialog("Nedb�r p� dag nr " + (i+1) + ": ");
			dager[i] = Integer.parseInt(tallLest);
		}

		int antDgUtenNedb�r = 0;
		for(int i =0; i < dager.length; i++) {
			if (dager[i] == 0) {
				antDgUtenNedb�r++;
			}
		}

		int total = 0;
		for (int i = 0; i < dager.length; i++) {
			total+= dager[i];
		}

		showMessageDialog(null, "Antall dager uten nedb�r: " + antDgUtenNedb�r + "\n" + "Total nedb�r: " + total);

	}//main
}//class
import static javax.swing.JOptionPane.*;

class TabellAvNavn {
	public static void main(String[] args) {
		String[] navnene = new String[10]; //Array med lengde 10
		int antNavn = 0;
		String navn = showInputDialog("Oppgi navn");

		while (antNavn < navnene.length && navn != null) {
			navnene[antNavn] = navn;
			antNavn++;
			navn = showInputDialog("Oppgi navn");
		}

		if (antNavn == navnene.length && navn != null) {
			showMessageDialog(null, "Ikke plass til flere navn");
		}
		String liste = "Her er navnene:\n";
		for (int i = 0 ; i < navnene.length; i++) {
			liste += navnene[i] + "\n";
		}
		showMessageDialog(null, liste);
	}
}
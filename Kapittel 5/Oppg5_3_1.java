import static javax.swing.JOptionPane.*;

class Oppg5_3_1 {
	public static void main(String[] args) {
		String kode = showInputDialog("Fagkode: ");
		String antStudLest = showInputDialog("Antall studenter: ");
		int antStud = Integer.parseInt(antStudLest);
		Fag fag1 = new Fag(kode, antStud);
		showMessageDialog(null, "Du skrev fagkode: " +
		fag1.getFagkode() + " og ant. stud = " + fag1.getAntStud());

		Fag fag2 = fag1;


		/*
		Oppgave 3:
		fag2.setAntStud(fag2.getAntStud() + 5);
		showMessageDialog(null, fag2.getAntStud());
		*/
		/*
		Oppgave 4:
		final Fag fag3 = new Fag("LO191D", 40);
		fag3.setAntStud(antStud);
		showMessageDialog(null, fag3.getAntStud());
		*/

		//Oppgave 5:
		Fag fag4 = null;
		fag4.setAntStud(100);
		showMessageDialog(null, fag4.getAntStud());



	}
}
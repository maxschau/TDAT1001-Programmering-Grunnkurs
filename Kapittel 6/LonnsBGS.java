import static javax.swing.JOptionPane.*;
class LonnsBGS {
	private final Ansatt enAnsatt;

	public LonnsBGS(Ansatt ansatt) {
		this.enAnsatt = ansatt;
	}

	public String lesTimel�nnSomTekst() {
		return showInputDialog("Oppgi timel�nn, avslutt med Esc: ");
	}

	public void registrerNyTimel�nn(String l�nn) {
		double timel�nn = Double.parseDouble(l�nn);
		enAnsatt.setTimel�nn(timel�nn);
	}

	public void registrerNySkattepros() {
		double maks = Ansatt.MAKS_SK_PROS;
		//double nyPros = lesDesimaltall("Ny skatteprosent, maks " + maks + ".");
		double nyPros = lesInnToTall(0, maks);
		enAnsatt.setSkatteprosent(nyPros);
	}

	public void skrivUtNettol�nn(double netto) {
		/*java.util.Formatter formaterer = new java.util.Formatter();
		formaterer.format("%2f", netto);
		String utskrift = "Nettol�nn kr " + formaterer.toString();
		*/
		String utskrift = "Nettol�nn kr " + gj�rOmTilString(netto);
		showMessageDialog(null, utskrift);
	}

	public Double lesInnToTall(double minsteVerdi, double hoyesteVerdi) {
		showInputDialog("Skriv inn et tall mellom " + minsteVerdi + " og " + hoyesteVerdi);
		String tallLest = showInputDialog("Skriv inn et tall");
		Double tall = Double.parseDouble(tallLest);
		while (tall < minsteVerdi || tall > hoyesteVerdi) {
			showMessageDialog(null, "Ugyldig verdi. Pr�v igjen");
			tallLest = showInputDialog("Skriv inn et tall");
			tall = Double.parseDouble(tallLest);
		}
		return tall;
	}



	private double lesDesimaltall(String ledetekst) {
		String tallLest = showInputDialog(ledetekst);
		return Double.parseDouble(tallLest);
	}

	private String gj�rOmTilString(double desimaltall) {
		return Double.toString(desimaltall);
	}


}//Class
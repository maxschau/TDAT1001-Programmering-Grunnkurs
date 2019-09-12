import static javax.swing.JOptionPane.*;
class LonnsBGS {
	private final Ansatt enAnsatt;

	public LonnsBGS(Ansatt ansatt) {
		this.enAnsatt = ansatt;
	}

	public String lesTimelønnSomTekst() {
		return showInputDialog("Oppgi timelønn, avslutt med Esc: ");
	}

	public void registrerNyTimelønn(String lønn) {
		double timelønn = Double.parseDouble(lønn);
		enAnsatt.setTimelønn(timelønn);
	}

	public void registrerNySkattepros() {
		double maks = Ansatt.MAKS_SK_PROS;
		//double nyPros = lesDesimaltall("Ny skatteprosent, maks " + maks + ".");
		double nyPros = lesInnToTall(0, maks);
		enAnsatt.setSkatteprosent(nyPros);
	}

	public void skrivUtNettolønn(double netto) {
		/*java.util.Formatter formaterer = new java.util.Formatter();
		formaterer.format("%2f", netto);
		String utskrift = "Nettolønn kr " + formaterer.toString();
		*/
		String utskrift = "Nettolønn kr " + gjørOmTilString(netto);
		showMessageDialog(null, utskrift);
	}

	public Double lesInnToTall(double minsteVerdi, double hoyesteVerdi) {
		showInputDialog("Skriv inn et tall mellom " + minsteVerdi + " og " + hoyesteVerdi);
		String tallLest = showInputDialog("Skriv inn et tall");
		Double tall = Double.parseDouble(tallLest);
		while (tall < minsteVerdi || tall > hoyesteVerdi) {
			showMessageDialog(null, "Ugyldig verdi. Prøv igjen");
			tallLest = showInputDialog("Skriv inn et tall");
			tall = Double.parseDouble(tallLest);
		}
		return tall;
	}



	private double lesDesimaltall(String ledetekst) {
		String tallLest = showInputDialog(ledetekst);
		return Double.parseDouble(tallLest);
	}

	private String gjørOmTilString(double desimaltall) {
		return Double.toString(desimaltall);
	}


}//Class
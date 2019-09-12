import static javax.swing.JOptionPane.*;

class ArbTaker {
	private Person person;
	private int arbtakernr;
	private int ansettelsAr;
	private double manedsLonn;
	private double skatteProsent;
	private final String[] ALTERNATIVER = {"Endre månedslønn", "Endre skatteProsent", "Avslutt"};
	private final int ENDRE_LONN = 0;
	private final int ENDRE_SKATT = 1;
	private final int AVSLUTT = 2;

	public ArbTaker(Person person, int arbtakernr, int ansettelsAr, double manedsLonn, double skatteProsent) {
		this.person = new Person(person.getFornavn(), person.getEtternavn(), person.getFAr());
		this.person = person;
		this.arbtakernr = arbtakernr;
		this.ansettelsAr = ansettelsAr;
		this.manedsLonn = manedsLonn;
		this.skatteProsent = skatteProsent;	
	}

	public int lesValg() {
		int valg = showOptionDialog(null, "Gjør et valg", "Valg", DEFAULT_OPTION, PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
		if (valg == AVSLUTT) {
			valg = -1;
		}
		return valg;
	}

	public void utforValgtOppgave(int valg) {
		switch(valg) {
			case ENDRE_LONN:
				String nyLonnLest = showInputDialog("Skriv inn ny lønn");
				double nyLonn = Double.parseDouble(nyLonnLest);
				setManedslonn(nyLonn);
				showMessageDialog(null, "Ny månedslønn er: " + getManedsLonn());
				break;
			case ENDRE_SKATT:
				String nySkattLest = showInputDialog("Skriv inn ny skatteprosent");
				double nySkatt = Double.parseDouble(nySkattLest);
				setSkattePros(nySkatt);		
				showMessageDialog(null, "Ny skatteprosent er: " + getSkattePros());
				break;
			default:
				break;		
		}
	}

	public String getNavn() {
		return person.getFornavn() + " " + person.getEtternavn();
	}

	public int getFAr() {
		return person.getFAr();
	}

	public int getArbeidtakerNr() {
		return arbtakernr;
	}

	public int getAnsettelsesAr() {
		return ansettelsAr;
	}

	public double getManedsLonn() {
		return manedsLonn;
	}

	public double getSkattePros() {
		return skatteProsent;
	}

	public void setManedslonn(double nyManedsLonn) {
		if (nyManedsLonn <= 0) {
			throw new IllegalArgumentException("Ugyldig verdi");
		}
		this.manedsLonn = nyManedsLonn;
	}

	public void setSkattePros(double nySkattePros) {
		if (nySkattePros <= 0 || nySkattePros >= 100) {
			throw new IllegalArgumentException("Ugyldig verdi");
		}
		this.skatteProsent = nySkattePros;
	}

	public double trukketISkatt() {
		return manedsLonn * (skatteProsent/100);
	}

	public double bruttoLonnPerAr() {
		return manedsLonn * 12;
	}

	public double beregnSkattetrekk() {
		double totalSkattetrekk = (manedsLonn * 10)*skatteProsent/100;
		return totalSkattetrekk + (manedsLonn/2)*skatteProsent/100; //Den totale skattetrekken pluss halv skatt i des + en skattefri måned i juni
	}

	public String skrivUtNavn() {
		String fornavn = person.getFornavn();
		String etternavn = person.getEtternavn();
		return etternavn + ", " + fornavn;
	}

	public int finnAlder() {
		java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
		int ar = kalender.get(java.util.Calendar.YEAR);
		return ar - person.getFAr();
	}

	public int antallArAnsatt() {
		java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
		int ar = kalender.get(java.util.Calendar.YEAR);

		return ar - ansettelsAr;
	}

	public String ansattIMerEnn(int antallAr) {
		if (antallArAnsatt() > antallAr) {
			return "Personen har vært ansatt i mer enn " + antallAr + " år.";
		} else {
			return "Personen har ikke vært ansatt i mer enn " + antallAr + " år.";
		}
	}



}
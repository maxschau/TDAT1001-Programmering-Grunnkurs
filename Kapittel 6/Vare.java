class Vare {
	public static final double MOMS = 24.0;
	public static final double MOMSFAKTOR = 1.0 + MOMS / 100.0;

	private final String varenavn;
	private final int varenr;
	private double pris; //Pris pr. kilo, alltid uten moms

	public Vare(String varenavn, int varenr, double pris) {
		if (varenr < 10000 || varenr > 99999) {
			throw new IllegalArgumentException ("Ugyldig varenr");
		} else if (pris < 0.50) {
			throw new IllegalArgumentException ("Ugyldig pris");
		} else {
		this.varenavn = varenavn;
		this.varenr = varenr;
		this.pris = pris;
		}
	}

	public Vare (String varenavn, int varenr) {
		this.varenavn = varenavn;
		this.varenr = varenr;
		this.pris = 0.0;
	}

	public String getVarenavn() {
		return varenavn;
	}

	public int getVarenr() {
		return varenr;
	}

	public double getPris() {
		return pris;
	}

	public double getMOMS() {
		return MOMS;
	}


	public void setPris(double pris) {
		this.pris = pris;
	}

	public double beregnPrisUtenMoms(double kg) {
		if (kg > 3 && kg <= 5) {
			return (pris * kg)*0.90;
		} else if (kg > 5) {
			return (pris * kg)*0.80;
		} else {
			return (pris * kg);
		}
	}

	public double beregnPrisMedMoms(double kg) {
		if (kg > 3 && kg <= 5) {
			return ((pris * kg)*0.90)*MOMSFAKTOR;
		} else if (kg > 5) {
			return ((pris * kg)*0.80)*MOMSFAKTOR;
		} else {
			return ((pris * kg))*MOMSFAKTOR;
		}
	}

	public String toString() {
		java.util.Formatter f = new java.util.Formatter();
		f.format("%.2f", pris);
		return varenr + ": " + varenavn + ", pris pr. kg kr " + f.toString() + "u.moms.";
	}
}
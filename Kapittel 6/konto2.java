class konto2{
	private final long kontonr;
	private final String navn;
	private long saldo; //øre

	public konto2(long kontonr, String navn, long saldo) {
		this.kontonr = kontonr;
		this.navn = navn;
		this.saldo = regnOmTilØre(saldo);
	}

	public long getKontonr() {
		return kontonr;
	}

	public String getNavn() {
		return navn;
	}

	public double getSaldo() {
		double saldoKr = regnOmTilKr(saldo);
		return saldoKr;
	}

	public boolean utførTransaksjon(double beløp) {
		int beløpØre = regnOmTilØre(beløp);
		if (saldo + beløpØre >= 0) {
			saldo += beløpØre;
			return true;
		} else {
			return false;
		}
	}

	/*Hjelpemetoder*/
	private int regnOmTilØre(double kr) {
		return (int) (kr*100);
	}

	private double regnOmTilKr(long øre) {
		return øre*0.01;
	}

}
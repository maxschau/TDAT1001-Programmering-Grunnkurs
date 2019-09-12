class konto2{
	private final long kontonr;
	private final String navn;
	private long saldo; //�re

	public konto2(long kontonr, String navn, long saldo) {
		this.kontonr = kontonr;
		this.navn = navn;
		this.saldo = regnOmTil�re(saldo);
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

	public boolean utf�rTransaksjon(double bel�p) {
		int bel�p�re = regnOmTil�re(bel�p);
		if (saldo + bel�p�re >= 0) {
			saldo += bel�p�re;
			return true;
		} else {
			return false;
		}
	}

	/*Hjelpemetoder*/
	private int regnOmTil�re(double kr) {
		return (int) (kr*100);
	}

	private double regnOmTilKr(long �re) {
		return �re*0.01;
	}

}
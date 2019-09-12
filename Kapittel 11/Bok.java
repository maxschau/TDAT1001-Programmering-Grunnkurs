class Bok {
	private String navn;
	private String forfatter;
	private int utgivelsesar;
	private int antallSider;
	private String forlag;

	public Bok(String navn, String forfatter, int utgivelsesar, int antallSider, String forlag) {
		this.navn = navn;
		this.forfatter = forfatter;
		this.utgivelsesar = utgivelsesar;
		this.antallSider = antallSider;
		this.forlag = forlag;
	}

	public String getNavn() {
		return navn;
	}

	public String getForfatter() {
		return forfatter;
	}

	public int getUtgivelsesar() {
		return utgivelsesar;
	}

	public int getAntallSider() {
		return antallSider;
	}

	public String getForlag() {
		return forlag;
	}

	public int getAlder() {
		java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
		int ar = kalender.get(java.util.Calendar.YEAR);
		return ar - getUtgivelsesar();
	}

	public boolean equalsAlder(Object obj) {
			if (!(obj instanceof Bok)) {
				return false;
			}
			if (this == obj) {
				return true;
			}
			Bok bok2 = (Bok) obj;
			if ((bok2.getAlder() - getAlder()) == 0 ) {
				return true;
			}
			return false;
	}

	public boolean equalsAntallSider(Object obj) {
		if (!(obj instanceof Bok)) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Bok bok2 = (Bok) obj;
		if (bok2.getAntallSider() - getAntallSider() == 0) {
			return true;
		}
		return false;
	}

	public boolean equalsForfatter(Object obj) {
		if (!(obj instanceof Bok)) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Bok bok2 = (Bok) obj;
		return (bok2.getForfatter().equals(forfatter));
	}

	public boolean equalsForlag(Object obj) {
		if (!(obj instanceof Bok)) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Bok bok2 = (Bok) obj;
		return (bok2.getForlag().equals(forlag));
	}

	public static void main(String[] args) {
		Bok bok = new Bok("Beste boken 1", "Anders", 1997, 38, "Forlag1");
		Bok bok2 = new Bok("Gud er stor", "Anders", 1998, 38, "Forlag1");

		System.out.println(bok.equalsAlder(bok2));
		System.out.println(bok.equalsAntallSider(bok2));
		System.out.println(bok.equalsForfatter(bok2));
		System.out.println(bok.equalsForlag(bok2));
	}
}
class Bok {
	private String navn;
	private int utgvivelsesAr;
	private int sider;
	private Forfatter forfatter;

	public Bok(String navn, int utgvivelsesAr, int sider, Forfatter forfatter) implements Comparable<Stock> {
		this.navn = navn;
		this.utgvivelsesAr = utgvivelsesAr;
		this.sider = sider;
		this.forfatter = forfatter;
	}

	public String getNavn() {
		return navn;
	}

	public int getUtgivelsesAr() {
		return utgvivelsesAr;
	}

	public int getSider() {
		return sider;
	}

	public String getForfatterNavn() {
		return forfatter.getNavn();
	}


	//To bøker defineres som like dersom navnet er likt og forfatter er likt
	public boolean equals(Object obj) {
		if (!(obj instanceof Bok)) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Bok bok2 = (Bok) obj;
		if ((!(bok2.getNavn().equals(getNavn()))) ||!(bok2.getForfatterNavn().equals(getForfatterNavn()))) {
			return false;
		}
		return true;
		}



}
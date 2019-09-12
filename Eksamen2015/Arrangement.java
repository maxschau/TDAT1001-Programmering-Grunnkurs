class Arrangement {
	private String navn;
	private Idrettsgren[] idrettsgrener;
	private int maksAnt;

	public Arrangement(String navn, Idrettsgren[] idrettsgrener, int maksAnt) {
		this.navn = navn;
		this.idrettsgrener = idrettsgrener;
		this.maksAnt = maksAnt;
	}

	public String toString() {
		String utskrift = "";

		for (int i = 0; i < idrettsgrener.length; i++) {
			utskrift += idrettsgrener[i].toString();
		}	
		return navn + "\n" + utskrift;
	}

	public boolean registrerIdrettsgren() {

	}

}
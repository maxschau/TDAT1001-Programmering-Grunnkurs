class Tekstbehandling {
	private String tekst;

	public Tekstbehandling(String tekst) {
		this.tekst = tekst;
	}

	public void finnAntallOrd() {
		int teller = 0;
		String[] ord = tekst.split(" ");
		System.out.println(ord[0]);

	}

}
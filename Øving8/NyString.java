class NyString {
	private final String tekst;

	public NyString(String tekst) {
		//this.tekst = tekst;
		this.tekst = new String(tekst);
	}

	public String forkorting() {
		String resultat = "";
		String[] ord = tekst.split(" "); //Legger hvert ord separert av mellomrom i en tabell
		for (int i =0; i < ord.length; i++) {
			resultat += (ord[i].charAt(0)); //Legger den første bokstaven i hvert ord til resultat
		}
		return resultat;
	}

	public String fjernTegn(String bokstav) {
		bokstav = bokstav.toLowerCase();
		String teksten = tekst.toLowerCase(); //I og med at tekst er immutabel "kopierer" jeg teksten slik at jeg kan endre den.
		teksten = teksten.replace(bokstav,""); //Alle tegnene av bokstaven blir byttet med "".
		return teksten;
	}

}
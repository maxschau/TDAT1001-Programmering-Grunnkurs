class TestNavn {
	public static void main(String[] args) {
		Navn etNavn = new Navn("Ole Petter", "Engebretsen");
		System.out.println("Hele navnet: " + etNavn.toString());
		System.out.println("Henter kun fornavn: " + etNavn.getFornavn());
		System.out.println("Henter kun etternavn: " + etNavn.getEtternavn());
		etNavn.setFornavn("Max");
		etNavn.setEtternavn("Schau");
		System.out.println("Hele navnet: " + etNavn.toString());
	}
}
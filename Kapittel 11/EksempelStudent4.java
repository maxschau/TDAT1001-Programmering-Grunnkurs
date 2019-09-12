class Student {
	private Navn navn;
	private final int fdato;

	public Student(Navn navn, int fdato) {
		/*Vi lar studentobjektet få sin egen kopi av navneobjektet */
		String fornavn = navn.getFornavn();
		String etternavn = navn.getEtternavn();
		this.navn = new Navn(fornavn, etternavn);
		this.fdato = fdato;
	}

	public int getFDato() {
		return fdato;
	}

	public Navn getNavn() {
		/*Returnerer en kopi */
		return new Navn(navn.getFornavn(), navn.getEtternavn());
	}

	public void setNavn(Navn navn) {
		/*Vi kopierer data fra det navneobjektet som kommer inn. */
		String nyttFornavn = navn.getFornavn();
		String nyttEtternavn = navn.getEtternavn();
		this.navn.setFornavn(nyttFornavn);
		this.navn.setEtternavn(nyttEtternavn);
	}

	public String toString() {
		return navn + ", født: " + fdato;
	}
}

class EksempelStudent4 {
	public static void main(String[] args) {
		/*Oppretter et navneobjekt som er argment til Student-konstruktøren*/
		Navn studNavn = new Navn("Ole Andreas", "Thomassen");
		Student studenten = new Student(studNavn, 19801010);
		/*Kontrollerer at navnet ble rett registrert: */
		System.out.println("A: " + studenten.toString());

		/*Endrer klientens navneobjekt */
		studNavn.setFornavn("Ingolf");
		//Studentobjektet skal ikke være endret: 
		System.out.println(studenten.toString());

		/*Klienten henter ut (sin egen kopi) av studentobjektets navn. */
		Navn mittNavn = studenten.getNavn();
		mittNavn.setFornavn("Kåre");
		System.out.println("C: Student: " + studenten.toString());

	}
}
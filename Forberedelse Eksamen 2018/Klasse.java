class Klasse {
	private String navn;
	private Student stud1;

	//Komposisjon
	public Klasse(String navn, Student stud1) {
		this.navn = navn;
		String studNavn = stud1.getNavn();
		int alder = stud1.getAlder();
		int studnr = stud1.getStudnr();
		this.stud1 = new Student(studNavn, alder, studnr); //Lager en kopi
	}

	//Aggregering
	public Klasse(String navn, Student stud1) {
		this.navn = navn;
		this.stud1 = stud1;
	}



}
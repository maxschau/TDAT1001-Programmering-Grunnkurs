class Oppgaveoversikt {
	private Student[] studenter;
	private int antStud = 0;

	public Oppgaveoversikt(Student[] studenter1) { //Tar inn en tabell med studenter som argument
		if (studenter1.length == 0) { //Hvis tabellen er tom
			throw new IllegalArgumentException("Ugyldig tabell");
		}
		studenter = new Student[studenter1.length]; //Definerer tabellen
		for (int i = 0; i < studenter1.length; i++) { //Dyp kopiering
			studenter[i] = new Student(studenter1[i].navn, studenter1[i].antOppg);
			//studenter[i] = studenter1[i];
		}
		this.antStud = studenter.length; //Ant studenter er lik tabellen sin lengde
	}

	public String getNavn(int indeks) {
		return studenter[indeks].getNavn();
	}

	public int getAntStud() { //Antall registrerte studenter
		return antStud;
	}

	public int getAntOppg(int indeks) { //Antall oppgaver som en bestemt student har løst
		return studenter[indeks].getAntOppg();
	}

	public boolean registrerNyStudent(String navn, int nyAntOppg) { //Registrerer ny student
		if (nyAntOppg < 0 || navn.trim().equals("")) {
			return false;
		}
		if (antStud == studenter.length) {
			utvidTabell();
		}
		studenter[antStud] = new Student(navn, nyAntOppg);
		antStud ++;
		return true;
	}

	public boolean okAntOppg(int indeks, int nyOkning) { //Øker antall oppgaver for en spesifikk student
		if (indeks >= 0 && nyOkning > 0) {
			studenter[indeks].okAntOppg(nyOkning);
			return true;
		} else {
			return false;
		}
	}

	public String toString() { //To string
		String resultat = "";
		for (int i = 0; i < studenter.length; i++) {
			resultat += "Navn: " + studenter[i].getNavn() + ", Ant oppgaver: " + studenter[i].getAntOppg() + "\n";
		}
		return resultat;
	}

	
	
	//Hjelpmetode
	public void utvidTabell() { //Fungerer
		Student[] nyTab = new Student[antStud +1];
		for (int i = 0; i < studenter.length; i++) {
			nyTab[i] = studenter[i];
		}
		studenter = nyTab;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Max Schau", 5);
		Student s2 = new Student("Anders Trondsen", 4);
		Student s3 = new Student("Geir Maskulin", 9);
		Student[] gruppe1 = {s1,s2, s3, new Student("Jenny Andersen", 9)};
		Oppgaveoversikt oversikt = new Oppgaveoversikt(gruppe1);
		System.out.println(oversikt.toString());
		
		System.out.println(oversikt.registrerNyStudent("Guri Gjertsen", 4));
		System.out.println(oversikt.toString());
		System.out.println("Det er " + oversikt.getAntStud() + " studenter registrert.");
		System.out.println(oversikt.getNavn(0) + " har løst " + oversikt.getAntOppg(0) + " oppgaver.");		
	}

}
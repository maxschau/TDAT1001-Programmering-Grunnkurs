class Student {
public String navn;
public int antOppg;
	
	public Student(String navn, int antOppg) {
		this.navn = navn;
		this.antOppg = antOppg;
	}

	public String getNavn() {
		return navn;
	}

	public int getAntOppg() {
		return antOppg;
	}

	public void okAntOppg(int okning) {
		this.antOppg += okning;
	}

	public String toString() {
		return "Navn: " + navn + ", oppgaver levert : " + antOppg;
	}


	public static void main(String[] args) {
		Student s1 = new Student("Max Schau", 5);
		System.out.println(s1.toString());
		s1.okAntOppg(4);
		System.out.println(s1);
	}

}
	
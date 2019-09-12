class Student {
	private Navn navn;
	private final int fdato;

	public Student(String fornavn, String etternavn, int fdato) {
		this.navn = new Navn(fornavn, etternavn);
		this.fdato = fdato;
	}

	public String getFornavn() {
		return navn.getFornavn();
	}

	public String getEtternavn() {
		return navn.getEtternavn();
	}

	public void setFornavn(String fornavn) {
		navn.setFornavn(fornavn);
	}

	public void setEtternavn(String etternavn) {
		navn.setEtternavn(etternavn);
	}

	public String toString() {
		return navn + ", født: " + fdato;
	}
}

class EksempelStudent3 {
	public static void main(String[] args) {
		Student studenten = new Student("Ingrid", "Hansen", 19851210);
		/*Kontrollerer at navnet ble rett registrert*/
		System.out.println("A: Student: " + studenten.toString());


	}

}
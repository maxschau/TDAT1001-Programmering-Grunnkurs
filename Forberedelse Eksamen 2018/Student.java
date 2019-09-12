public class Student {
	private String navn;
	private int alder;
	private int studnr;

	public Student(String navn, int alder, int studnr) {
		this.navn = navn;
		this.alder = alder;
		this.studnr = studnr;
	}

	public String getNavn() {
		return navn;
	}

	public int getAlder() {
		return alder;
	}

	public int getStudnr() {
		return studnr;
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) {
			return false;
		}
		if (this == obj) {
			return true;
		}

		Student instance = (Student) obj;
		if (instance.getNavn().toLowerCase().equals(navn.toLowerCase()) && instance.getStudnr() == studnr) {
			return true;
		}
		return false;
	}





}
class Student {
	private final String poststed; //Postnr + mellomrom  + stedsnavn
	private final int studnr;

	public Student (String poststed, int studnr){
		this.poststed = poststed;
		this.studnr = studnr;
	}

	public String getPoststed() {
		return poststed;
	}

	public int getStudnr() {
		return studnr;
	}

	public String getStedsnavn() {
		int sisteBlanke = poststed.lastIndexOf(' ');
		String sted = poststed.substring(sisteBlanke + 1);
		return sted;
	}

	public String toString() {
		return "Poststed: " + poststed + ", studentnr.: " + studnr;
	}
}

class EksempelStudent1 {
	public static void main(String[] args) {
		Student studenten = new Student("0345 Oslo", 5566778);
		String sted = studenten.getStedsnavn();
		System.out.println("All info.: " + studenten.toString() + ", kun stedet: " + sted);
	}
}
import static javax.swing.JOptionPane.*;
class Student {
	private Poststed poststed; //Objekt av klassen poststed
	private int studnr;

	public Student(Poststed poststed, int studnr) {
		this.poststed = poststed;
		this.studnr = studnr;
	}

	public Poststed getPoststed() { 
		return poststed;
	}

	public int getStudnr() {
		return studnr;
	}

	public void setPoststed(Poststed poststed) {
		this.poststed = poststed;
	}

	public void setStudnr(int studnr) {
		this.studnr = studnr;
	}

	public String getPostnr() { //Bruker metoden til klassen Poststed
		return poststed.getPostnr();
	}

	public String getSted() { //Bruker metoden til klassenPostSted
		return poststed.getSted();
	}

	public String toString() {
		return "Studentnr.: " + studnr + ", postadresse: " + poststed;
	}

}

class EksempelStudent2 {
	public static void main(String[] args) {
		Poststed post = new Poststed("0345", "Oslo"); //Klassen poststed
		Student studenten = new Student(post, 56437);
		System.out.println("Etter at objektet er opprettet: " + studenten.toString());
		
		/*Leser inn ny postadresse og registerer den i studentobjektet. */
		String nyPostadrLest = showInputDialog("Oppgi ny postadresse, eks 7020 Trondheim: ");
		String ord[] = nyPostadrLest.split(" ");
		Poststed nyttPoststed = new Poststed(ord[0], ord[1]);
		studenten.setPoststed(nyttPoststed);

		/*Leser inn ny studentnr, og registrerer den i studentobjektet */
		String nyttStudnrLest = showInputDialog("Oppgi nytt studentnr");
		int nyttStudnr = Integer.parseInt(nyttStudnrLest);
		studenten.setStudnr(nyttStudnr);

		System.out.println("Etter endring av data: " + studenten.toString());

	}
}
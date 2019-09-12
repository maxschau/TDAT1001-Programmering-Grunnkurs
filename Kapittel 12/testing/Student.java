import org.junit.*;
import static org.junit.Assert.*;

class Student {
	private String navn;
	private int alder;

	public Student(String navn, int alder) {
		this.navn = navn;
		this.alder = alder;
	}

	public String getNavn() {
		return navn;
	}

	public int getAlder() {
		return alder;
	}

	public void setNavn(String nyNavn) {
		this.navn = nyNavn;
	}

	public void setAlder(int nyAlder) {
		this.alder = nyAlder;
	}

	@Test
	public void testGetNavn() {
		System.out.println("Test av getNavn():");
		Student s1 = new Student("Max", 20);
		String expResultat = "Max";
		String resultat = s1.getNavn();
		assertEquals(expResultat,resultat);
	}
}
import java.io.*;
import javax.swing.*;
class Lesing {
	public static void main(String[] args) {
		String filnavn = "Register.txt";

		Lese lese = new Lese();

		System.out.println(lese.LesHeleFil(filnavn));
		System.out.println(lese.skrivTilTekst(filnavn, "Max"));
		lese.skrivTilTekst(filnavn, "Sigurd");

		Student s1 = new Student("Max Schau", 20);

		lese.skrivObjektTilFil("obj.ser", s1);
	}
}


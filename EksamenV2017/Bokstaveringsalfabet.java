import java.io.*;
import java.util.Arrays; 
import java.util.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;

class Bokstaveringsalfabet {
	private String navn;
	private String[] tabellAlfabet;
	private String alfabetet;
	private String skilletegn;

	public Bokstaveringsalfabet(String navn, String alfabetet, String skilletegn) {
		this.navn = navn;
		this.tabellAlfabet = tabellAlfabet;
		this.skilletegn = skilletegn;
		tabellAlfabet = alfabetet.split(skilletegn);
	}

	public Bokstaveringsalfabet(String filnavn) {
		lesFraFil(filnavn);
		tabellAlfabet = alfabetet.split(skilletegn);
	}
	



	public String toString() {
		String utskrift = "";
		for (int i = 0; i < tabellAlfabet.length; i++) {
			utskrift += tabellAlfabet[i] + skilletegn;
		}
		return utskrift.replace("-", " ");
		
	}

	public boolean registrerOrd(String nyttOrd) {
		for (int i = 0; i < tabellAlfabet.length; i++) {
			if (nyttOrd.equals(tabellAlfabet[i])) {
				return false;
			}
		}
		utvidTabell();
		tabellAlfabet[tabellAlfabet.length-1] = nyttOrd;
		return true;
	}

	public boolean endreBeskrivelse(String gammeltOrd, String nyttOrd) {
		for (int i = 0; i < tabellAlfabet.length; i++) {
			if (gammeltOrd.equals(tabellAlfabet[i])) {
				tabellAlfabet[i] = nyttOrd;
				return true;
			}
		}
		return false;
	}

	public void sorterAlfabet() {
		
	}

	public String konverter(String tekst) {
		//Mangler dersom bokstaven ikke eksisterer
		int antallBokstaver = tekst.length();
		String utskrift = "";
		for (int i = 0; i < antallBokstaver; i++) {
			char tegn = tekst.charAt(i);
			for (int j = 0; j < tabellAlfabet.length; j++) {
				if (tegn == tabellAlfabet[j].charAt(0)) {
					utskrift += tabellAlfabet[j] + " ";
				}
			}
		}
		return utskrift;
	}

	public void skrivTilFil(String filnavn) {
		try(FileWriter forbTilFil = new FileWriter(filnavn,false); PrintWriter skriver = new PrintWriter(new BufferedWriter(forbTilFil))) {
			skriver.println(skilletegn);
			String utskrift = "";
			for (int i = 0; i < tabellAlfabet.length; i++) {
				utskrift += tabellAlfabet[i] + skilletegn;
			}
			skriver.println(utskrift);
			skriver.close();

		}catch (IOException ioe) {

		}
	}

	public String lesFraFil(String filnavn) {
		try(FileReader forbTilFil = new FileReader(filnavn); BufferedReader leser = new BufferedReader(forbTilFil)) {
			//Scanner scanner = new Scanner(filnavn);
			String resultat = "";
			this.skilletegn = leser.readLine();
			this.alfabetet = leser.readLine();

		}catch (IOException ioe) {
			System.out.println("IOException: " + ioe);
		}
		return skilletegn + "\n" + alfabetet;
	}

	@Test 
	public void testKonverter() {
		System.out.println("Test Konverter");
		Bokstaveringsalfabet instance = new Bokstaveringsalfabet("Internasjonalt", "Alfa-Bravo-Charlie-Delta-", "-");
		String test = "ABBA";
		String expResult = "Alfa Bravo Brava Alfa";
		String result = instance.konverter(test);
		assertEquals(expResult,result);
	}





	public void utvidTabell() {
		String[] nyTab = new String[tabellAlfabet.length + 1];
		for (int i = 0; i < tabellAlfabet.length; i++) {
			nyTab[i] = tabellAlfabet[i];
		}
		tabellAlfabet = nyTab;
	}

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main(Bokstaveringsalfabet.class.getName());

		
		

	}
}

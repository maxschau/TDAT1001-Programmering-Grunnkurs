public class Valuta {
	private String navn;
	private double kurs;


	public Valuta(String navn, double kurs) {
		this.navn = navn;
		this.kurs = kurs;
	}

	public String getNavn(){
		return navn;
	}

	public double getKurs() {
		return kurs;
	}

	public double regnOmTilNok(double tall) {
		return kurs * tall;
	}

	public double regnOmFraNok(double tall) {
		return tall / kurs;
	}

	public String toString() {
		return "Navn: " + navn + ", kurs: " + kurs + ".";
	}
}
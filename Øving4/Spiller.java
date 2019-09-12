import java.util.Random;

public class Spiller {
	private String navn;
	private int sumPoeng;

	public Spiller(String navn, int sumPoeng){
		this.navn = navn;
		this.sumPoeng = sumPoeng;
	}

	public int kastTerning() {
		java.util.Random terning = new java.util.Random();
		int terningkast = terning.nextInt(6) + 1;
		sumPoeng += terningkast;
		return terningkast;
	}

	public void setSumPoeng(int tall) {
		sumPoeng = tall;
	}

	public int getSumPoeng() {
			return sumPoeng;
	}

	public boolean erFerdig() {
		return true;
	}
}
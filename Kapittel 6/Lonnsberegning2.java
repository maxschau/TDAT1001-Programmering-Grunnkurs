import static javax.swing.JOptionPane.*;
class Lonnsberegning2 {
	public static void main(String[]args) {
		final double ANT_TIMER = 20.0;
		Ansatt ansatt = new Ansatt(12345, "Anne Vik");
		LonnsBGS bgs = new LonnsBGS(ansatt);
		String timelønnLest = bgs.lesTimelønnSomTekst();
		while (timelønnLest != null) {
			bgs.registrerNyTimelønn(timelønnLest);
			bgs.registrerNySkattepros();
			double nettolønn = ansatt.beregnNettolønn(ANT_TIMER);
			bgs.skrivUtNettolønn(nettolønn);
			timelønnLest = bgs.lesTimelønnSomTekst();

		}



	}//main
}//class
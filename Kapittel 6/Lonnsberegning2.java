import static javax.swing.JOptionPane.*;
class Lonnsberegning2 {
	public static void main(String[]args) {
		final double ANT_TIMER = 20.0;
		Ansatt ansatt = new Ansatt(12345, "Anne Vik");
		LonnsBGS bgs = new LonnsBGS(ansatt);
		String timel�nnLest = bgs.lesTimel�nnSomTekst();
		while (timel�nnLest != null) {
			bgs.registrerNyTimel�nn(timel�nnLest);
			bgs.registrerNySkattepros();
			double nettol�nn = ansatt.beregnNettol�nn(ANT_TIMER);
			bgs.skrivUtNettol�nn(nettol�nn);
			timel�nnLest = bgs.lesTimel�nnSomTekst();

		}



	}//main
}//class
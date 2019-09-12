import static javax.swing.JOptionPane.*;
class Oppgave3 {
	public static void main(String[] args) {
		Spiller A = new Spiller("A", 0);
		Spiller B = new Spiller("B", 0);
		int rundeteller = 0;

		while ((A.getSumPoeng() < 100 && B.getSumPoeng() < 100) || (A.getSumPoeng() > 100 && B.getSumPoeng() > 100) ) {
			rundeteller ++;
			int ATerning = A.kastTerning();
			int BTerning = B.kastTerning();
			if (ATerning == 1) { //Hvis man får 1 skal poengsumme nullstilles
				A.setSumPoeng(0);
			} //if
			if (BTerning == 1) { //Hvis man får 1 skal poengsumme nullstilles
				B.setSumPoeng(0);
			} //if

			if (A.getSumPoeng() > 100) { //Hvis summen er større enn 100 skal man subtrahere forrige terningkast
				A.setSumPoeng(A.getSumPoeng() - ATerning);
			} //if
			if (B.getSumPoeng() > 100) { //Hvis summen er større enn 100 skal man subtrahere forrige terningkast
				A.setSumPoeng(B.getSumPoeng() - BTerning);
			} //if


			System.out.println("Rundenummer: " + rundeteller + ":");
			System.out.println("A: Poengsum: " + A.getSumPoeng()+ ".");
			System.out.println("B: Poengsum: " + B.getSumPoeng()+ ".");
			System.out.println('\n');

		} //while

		if (A.getSumPoeng() == 100) {
			System.out.println("A kom til 100 først");
		} else {
			System.out.println("B kom til 100 først");
		} //if




	}//Main
}//Class
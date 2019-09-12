import static javax.swing.JOptionPane.*;

class Oppgave2 {
	public static void main(String[]args) {

	Brok brok1 = new Brok(5,9);
	Brok brok6 = new Brok(12,18);

	//Sjekker at get-metodene fungerer
	if (brok1.getTeller() == 5 && brok1.getNevner() == 9) {
		System.out.println("Test 1: Vellykket");
	}

	//Sjekker at summer metoden fungerer
	brok1.summerBrok(19,25);
	if (brok1.teller == 296 && brok1.nevner == 225) {
		System.out.println("Test 2: Vellykket");
	}

	Brok brok2 = new Brok(12,9);
	brok2.subtraherBrok(19,25);
	if (brok2.teller == 129 && brok2.nevner == 225) {
		System.out.println("Test 3: Vellykket");
	}

	Brok brok3 = new Brok(54,3);
	brok3.dividerBrok(13,25);
	if (brok3.teller == 1350 && brok3.nevner == 39) {
		System.out.println("Test 4: Vellykket");
	}

	Brok brok4 = new Brok(39,4);
	brok4.multipliserBrok(12,25);
	if (brok4.teller == 468 && brok4.nevner == 100) {
		System.out.println("Test 5: Vellykket");
	}









	}//main
}//class
class Oppgave {
	public static void main(String[] args) {
		Fag[] gruppeA = {new Fag("LV172D", "Programmering i Java"),
						new Fag("LC191D", "Videregående programmering"),
						new Fag("LO347D", "Web-applikasjoner med Java EE")		
						};

		gruppeA[0].setAntStud(10);
		gruppeA[1].setAntStud(15);
		gruppeA[2].setAntStud(20);
		/*for (int i = 0; i < gruppeA.length; i++) {
			System.out.println(gruppeA[i].toString());
		}*/

		Fag[] gruppeB = new Fag[gruppeA.length];
		for (int i = 0; i < gruppeA.length; i++) {
			gruppeB[i] = new Fag(gruppeA[i].getFagkode(), gruppeA[i].getFagnavn());
		}
		gruppeB[0].setAntStud(20);
		gruppeB[1].setAntStud(25);
		gruppeB[2].setAntStud(30);
		for (int i = 0; i < gruppeB.length; i++) {
			System.out.println(gruppeA[i].toString());
			System.out.println(gruppeB[i].toString());
		}
	}
}
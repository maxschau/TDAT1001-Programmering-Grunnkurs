class TabellAvFag {
	public static void main(String[] args) {
		Fag[] gruppeA = {new Fag("LV172D", "Programmering i Java"),
						new Fag("LC191D", "Videregående programmering"),
						new Fag("LO347D", "Web-applikasjoner med Java EE")
						};

		System.out.println("Utskrift 1:");
		for (int i =0; i < gruppeA.length; i++) {
			System.out.println(gruppeA[i]);
		}

		gruppeA[0].setAntStud(10);
		gruppeA[1].setAntStud(15);
		gruppeA[2].setAntStud(20);
		System.out.println("\nUtskrift 2, skal gi antall studenter lik hhv 10, 15 og 20:");
		for (int i = 0; i < gruppeA.length; i++) {
			System.out.println(gruppeA[i]);
		}		
	}

}
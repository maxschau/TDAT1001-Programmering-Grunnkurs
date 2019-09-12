class BokKatalog{
	private Bok[] boker = new Bok[2];
	private int antBok = 0;

	public boolean registrerNyBok(Bok bok) {
		for (int i = 0; i < boker.length; i++) {
			if (bok.equals(boker[i])){
				return false; //Dersom boken allerede er registrert
			}
		}
		if (antBok == boker.length) {
			utvidTabell();
		}
		boker[antBok] = bok;
		antBok++;
		return true;
		
	}

	public void skrivUtTabell() {
		for (int i = 0; i < boker.length; i++) {
			System.out.println(boker[i].getNavn() + " , " + boker[i].getUtgivelsesAr());
		}
	}

	public void sorterObjekt() {
		java.util.Arrays.sort(boker);
	}

	public void utvidTabell() {
		Bok[] nyTab = new Bok[boker.length + 1];
		for (int i = 0; i < boker.length; i++) {
			nyTab[i] = boker[i];
		}
		boker = nyTab;
	}
		public static void main(String[] args) {
		BokKatalog bk1 = new BokKatalog();

		Navn n1 = new Navn("Max", "Schau");
		Forfatter f1 = new Forfatter(n1, 20);
		Bok b1 = new Bok("Heisann", 2010, 320, f1);

		Navn n2 = new Navn("Anders", "Schau");
		Forfatter f2 = new Forfatter(n2, 20);
		Bok b2 = new Bok("Heisann", 2011,330,f2);

		bk1.registrerNyBok(b1);
		bk1.registrerNyBok(b2);

		Bok b3 = new Bok("God aften", 2012,400, f1);
		System.out.println(bk1.registrerNyBok(b2));
		System.out.println(bk1.registrerNyBok(b3));

	
	
		Bok[] tabell1 = {b1,b2,b3};
		for (int i = 0; i < tabell1.length; i++) {
			System.out.println(tabell1[i].getNavn());
		}
		java.util.Arrays.sort(tabell1);
		for (int i = 0; i < tabell1.length; i++) {
			System.out.println(tabell1[i].getNavn());
		}


		//java.util.Arrays.sort(bk1);


		
	}

}
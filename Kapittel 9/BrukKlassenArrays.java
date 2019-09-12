class BrukKlassenArrays {
	public static void main(String[] args) {
		int[] test = {13,5,4,3,30};

		//Vi sorterer hele tabellen
		java.util.Arrays.sort(test);
		System.out.println("Sortert tabell: ");
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println();

		int indeks = java.util.Arrays.binarySearch(test,13);
		System.out.println("Verdien 13 har indeks " + indeks);

		indeks = java.util.Arrays.binarySearch(test,14);
		int pos = -indeks -1;
		System.out.println("Verdien 14 skal settes inn på indeks " + pos);

		/*Lager en ny tabell med plass til den nye verdien */
		int[] nyTabell = new int[test.length + 1];

		/*Fyller den nye tabellen med data */
		for (int i = 0; i < pos; i++) {
			nyTabell[i] = test[i];
		}
		nyTabell[pos] = 14;
		for (int i = pos + 1; i < nyTabell.length; i++) {
			nyTabell[i] = test[i-1];
		}


	}


}
class Sorterting {
	public static void sorterHeltallstabell(int[] tabell) { //Class med tabell som parameter
		for (int start = 0; start < tabell.length; start ++) { //Kjører gjennom tabellen sin lengde
			int hittilMinst = start; //Indeksen til det hitill minste starter er 0.
			for (int i = start+ 1; i < tabell.length; i++) { //Går gjennom de neste tallene i tabellen
				if (tabell[i] > tabell[hittilMinst]) { //Hvis neste tall er mindre enn det hitillMinste.
					hittilMinst = i; //Da skal indeksen til hitillMinste være lik i.
				}
			}
		int hjelp = tabell[hittilMinst]; //hjelp er lik verdien til den minste
		tabell[hittilMinst] = tabell[start]; //
		tabell[start] = hjelp;
		}

	}
}

class SorteringAvTall {
	public static void main(String[] args) {
		int[] enTabell = {-5,4,-5,13,11,0,8,-2,22,3,11,22,17};

		Sortering.sorterHeltallstabell(enTabell);

		System.out.print("Sorterte tall: ");
		for (int i = 0; i < enTabell.length; i++) {
			System.out.print(enTabell[i] + " ");
		}
		System.out.println();
	}

}
class BinarSok {
	public static void sorter(int[] tabell) {
		for (int start = 0; start < tabell.length; start++) {
			int hittilMinst = start;
			for (int i = start + 1; i < tabell.length; i++) {
				if (tabell[i] < tabell[hittilMinst]) {
					hittilMinst = i;
				}
			}
			int hjelp = tabell[hittilMinst];
			tabell[hittilMinst] = tabell[start];
			tabell[start] = hjelp;
		}
	}
	public static int binarSokHeltall(int[] tabell, int verdi) {
		int start = 0;
		int slutt = tabell.length - 1;
		while (start <= slutt) {
			int midten = (start + slutt) /2;
			if (tabell[midten] == verdi) {
				return midten; //Verdien er funnet
			} else {
				if(tabell[midten] < verdi) {
					start = midten + 1;
				} else {
					slutt = midten + 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] tall = {14,23,5,1,4,5,7,8};
		sorter(tall);
		for (int i = 0; i < tall.length; i++) {
			System.out.println(tall[i]);
		}
		System.out.println(binarSokHeltall(tall,23));
	}

}
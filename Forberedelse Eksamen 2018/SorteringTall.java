class SorteringTall {
	public static void main(String[] args) {
		int[] tabell = {1,5,1,3,6};
		for (int j = 0; j < tabell.length; j++) {
			System.out.println(tabell[j]);
		}

		for (int start = 0; start < tabell.length; start++) {
			int hittilStørst = start;
			for (int i = start + 1; i < tabell.length; i++) {
				if (tabell[i] < tabell[hittilStørst]) {
				hittilStørst = i;
				}
			}
			int hjelp = tabell[hittilStørst];
			tabell[hittilStørst] = tabell[start];
			tabell[start] = hjelp;
		}


		for (int j = 0; j < tabell.length; j++) {
			System.out.println(tabell[j]);
		}






	}

}
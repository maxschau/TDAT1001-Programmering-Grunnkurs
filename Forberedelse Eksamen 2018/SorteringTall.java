class SorteringTall {
	public static void main(String[] args) {
		int[] tabell = {1,5,1,3,6};
		for (int j = 0; j < tabell.length; j++) {
			System.out.println(tabell[j]);
		}

		for (int start = 0; start < tabell.length; start++) {
			int hittilSt�rst = start;
			for (int i = start + 1; i < tabell.length; i++) {
				if (tabell[i] < tabell[hittilSt�rst]) {
				hittilSt�rst = i;
				}
			}
			int hjelp = tabell[hittilSt�rst];
			tabell[hittilSt�rst] = tabell[start];
			tabell[start] = hjelp;
		}


		for (int j = 0; j < tabell.length; j++) {
			System.out.println(tabell[j]);
		}






	}

}
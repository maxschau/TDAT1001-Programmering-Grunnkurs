class SorteringUv2 {
	public SorteringUv2() {
	}

	public void sorter(int[] tabell) {
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

}
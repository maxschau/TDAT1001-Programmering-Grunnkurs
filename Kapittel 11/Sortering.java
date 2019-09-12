class Sortering {
	public static void sorterObjekter(Object[] objekter) {
		if (objekter != null && objekter.length > 0) {
			for (int start = 0; start < objekter.length; start++) {
				int hittilMinst = start; //Første objektet blir det minste
				for(int i = start + 1; i < objekter.length; i++) {
					Comparable dette = (Comparable) objekter[i];
					Comparable hittilMinsteObjekt = (Comparable) objekter[hittilMinst];
					if (dette.compareTo(hittilMinsteObjekt) < 0) {
						hittilMinst = i;
					}
				}
				Object hjelp = objekter[hittilMinst];
				objekter[hittilMinst] = objekter[start];
				objekter[start] = hjelp;
			}
		}
	}

	public static void sorterObjekter(Object[] objekter, java.util.Comparator comp) {
		if (comp == null) {
			sorterObjekter(objekter);
		}
		if (objekter != null && objekter.length > 0 ) {
			for (int start = 0; start < objekter.length; start++) {
				int hittilMinst = start;
				for (int i = 0; i < objekter.length; i++) {
					Object dette = objekter[i];
					Object hittilMinsteObjekt = objekter[hittilMinst];
					if (comp.compare(dette,hittilMinst) < 0) {
						hittilMinst = i;
					}
				}
				Object hjelp = objekter[hittilMinst];
				objekter[hittilMinst] = objekter[start];
				objekter[start] = hjelp;
			}
		}
	}


}
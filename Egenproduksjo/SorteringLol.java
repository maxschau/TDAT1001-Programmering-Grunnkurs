class SorteringLol {
	public static void main(String[] args) {
		//int[] tall = {1,5,1,3,-1,5,7,1,2,5,6};
		String[] tall = {"Max", "Anders", "Guro", "Rooney", "Ronaldo", "Anderss"};

		for (int start = 0; start < tall.length; start++) {
			int hittilMinst = start;
			for (int i = start + 1; i < tall.length; i++) {
				if (tall[i].compareTo(tall[hittilMinst]) < 0) {
					hittilMinst = i;
				}
			}
			String hjelp = tall[hittilMinst];
			tall[hittilMinst] = tall[start];
			tall[start] = hjelp;

		}

		for (int i = 0; i < tall.length; i++) {
			System.out.println(tall[i]);
		}
	}
}
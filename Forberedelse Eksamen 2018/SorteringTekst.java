class SorteringTekst {
	public static void main(String[] args) {
		String[] tekst = {"Max", "Gunnar", "Wayne", "Spiderman", "Åshild"};

		for (int i = 0; i < tekst.length; i++) {
			System.out.println(tekst[i]);
		}

		for (int start = 0; start < tekst.length; start++) {
			int hittilMinst = start;
			for (int i = start + 1; i < tekst.length; i++) {
				if ((tekst[i].compareTo(tekst[hittilMinst])) < 0) { //Dersom neste elementet ligger foran hittilMinst
					hittilMinst = i;
				}
			}
			String hjelp = tekst[hittilMinst];
			tekst[hittilMinst] = tekst[start];
			tekst[start] = hjelp;
		}

		System.out.println("Sortert:");
		for (int i = 0; i < tekst.length; i++) {
			System.out.println(tekst[i]);
		}

	}


}
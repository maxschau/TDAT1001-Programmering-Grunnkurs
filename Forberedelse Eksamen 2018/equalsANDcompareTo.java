class equalsANDcompareTo {
	public static void main(String[] args) {
		//Equals returnerer en boolean avhengig av resultatet
		//CompareTo retunerer en integerer.

		//Equals kan brukes

		String[] navn = {"Max", "Gunnar", "Per", "Arild", "Åse"};

		//A = 1
		//B = 2

		//(Hvis A compareTo B) = negativt (1-2)
		//(Hvis B compareTo A) = positivt (2-1)
		//(Hvis B compareto A) > 0 -> Ja fordi 2-1, ergo skjer if-setningen

		for (int start = 0; start < navn.length; start++) {
			int hittilMinst = start;
			for (int i = start + 1; i < navn.length; i++) {
				if (navn[hittilMinst].compareTo(navn[i]) > 0) { //Dersom det neste elementet kommer før det andre
					hittilMinst = i;
				}
			}
		String hjelp = navn[hittilMinst];
		navn[hittilMinst] = navn[start];
		navn[start] = hjelp;
		}

	for (int i = 0; i < navn.length; i++) {
		System.out.println(navn[i]);
	}
	}
}
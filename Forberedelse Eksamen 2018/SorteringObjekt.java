class SorteringObjekt {
	public static void main(String[] args) {

	Student stud1 = new Student("Max", 20, 20193);
	Student stud2 = new Student("Anders", 21, 20192);
	Student stud3 = new Student("Zaim", 20, 20194);

	Student[] gutta = {stud1, stud2, stud3};
	for (int i = 0; i < gutta.length; i++) {
		System.out.println(gutta[i].getNavn());
	}

	//Sorterer på navn:
	for (int start = 0; start < gutta.length; start++) {
		int hittilMinst = start;
		for (int i = start + 1; i < gutta.length; i++) {
			if (gutta[i].getNavn().compareTo(gutta[hittilMinst].getNavn()) < 0) {
				hittilMinst = i;
			}
		}
		Student hjelp = gutta[hittilMinst];
		gutta[hittilMinst] = gutta[start];
		gutta[start] = hjelp;
	}
	/*
	//Sorterer på alder:
	for (int start = 0; start < gutta.length; start++) {
		int hittilMinst = start;
		for (int i = start + 1; i < gutta.length; i++) {
			if (gutta[i].getAlder() < gutta[hittilMinst].getAlder()) {
				hittilMinst = i;
			}
		}
		Student hjelp = gutta[hittilMinst];
		gutta[hittilMinst] = gutta[start];
		gutta[start] = hjelp;
	}
	*/

	for (int i = 0; i < gutta.length; i++) {
			System.out.println(gutta[i].getNavn());
	}
	}
}
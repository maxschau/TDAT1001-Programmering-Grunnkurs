class Person {
	private final String navn;
	private final int fAr;

	public Person(String navn, int fAr) {
		this.navn = navn;
		this.fAr = fAr;
	}

	public int getFAr() {
		return fAr;
	}

	public boolean equalsAlder(Object objekt) {
		if (!(objekt instanceof Person)){
			return false;
		}
		if (this == objekt) {
			return true;
		}

		Person p1 = (Person) objekt;
		if (fAr != p1.getFAr()) {
			return false;
		}
		return true;
	}

	public int compareToAlder(Person objekt) {
		int bursdag = getFAr();
		int bursdag2 = objekt.getFAr();

		if (bursdag > bursdag2) { // 1998 - 1999 | Eldre
			return 1;
		} else if (bursdag < bursdag2) {
			return -1;
		} else {
			return 0;
		}
	}

	public boolean equalsXAlder(Object objekt, int ar) {
		if (!(objekt instanceof Person)){
			return false;
		}
		if (this == objekt) {
			return true;
		}

		Person p1 = (Person) objekt;
		if ((p1.getFAr()) - fAr >= ar ) {
			return true;
		}
		return false;
	}
	




}

class oppgave {
	public static void main(String[] args) {
		Person p1 = new Person("Ole", 1983);
		Person p2 = new Person("Kari", 1984);

		boolean like = p1.equalsAlder(p2);
		if (like) {
			System.out.println("Like");
		} else {
			System.out.println("Ulike");
		}

		int alder = p1.compareToAlder(p2);
		if (alder == 1) {
			System.out.println("P1 er eldre enn p2");
		} else if (alder == -1) {
			System.out.println("P1 er yngre enn p2");
		} else {
			System.out.println("De er like gamle");
		}

		boolean eldreEnn = p1.equalsXAlder(p2, 2);
		if (eldreEnn) {
			System.out.println("P1 er mer enn 2 år eldre enn P2");
		} else {
			System.out.println("P1 er ikke så gammel");
		}
		
	}
}

class Testklient {
	public static void main(String[] args) {
		Person p1 = new Person("Max", "Schau", 1998);
		ArbTaker a1 = new ArbTaker(p1, 1203, 2009, 100, 5);

		System.out.println("Månedslønn: " + a1.getManedsLonn() + ", skatteprosent: " + a1.getSkattePros() + ", trukket i skatt: " + a1.trukketISkatt());
		System.out.println("Bruttolønnen per år er : " + a1.bruttoLonnPerAr());
		System.out.println("Skattetrekk totalt per år: " + a1.beregnSkattetrekk());
		System.out.println("Navn til arbeidstaker: " + a1.skrivUtNavn());
		System.out.println("Alder til arbeidstaker: " + a1.finnAlder());
		System.out.println("Arbeidstakeren har vært ansatt i " + a1.antallArAnsatt() + " år");
		System.out.println(a1.ansattIMerEnn(3));
		

		int valg = a1.lesValg();
		while (valg >= 0) {
			a1.utforValgtOppgave(valg);
			valg = a1.lesValg();
		}


	}
}
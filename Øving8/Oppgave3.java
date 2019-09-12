class Oppgave3 {
	public static void main(String[]args) {
		Tekstbehandling tekst1 = new Tekstbehandling("Hei. Dette er en ,test, og handler om tekstbehandling");

		System.out.println("Totalt antall ord i teksten: " + tekst1.finnAntallOrd());
		System.out.println("Gjennomsnittlig ordlengde: " + tekst1.finnGjennomsnittLengde());
		System.out.println("Gjennomsnittlig antall ord per periode: " + tekst1.gjennomsnittPerPeriode());
		System.out.println("Dersom vi erstatter 'er' med 'var' får vi følgennde tekst: " + tekst1.erstatte("Er", "var"));
		System.out.println("Teksten som ble sendt inn til tekstbehandling var: " + tekst1.getString());
		System.out.println("Teksten i store bokstaver: " + tekst1.storeBokstaver());


	}
}
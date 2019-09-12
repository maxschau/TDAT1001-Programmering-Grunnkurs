class Oppgave2{
	public static void main(String[]args) {
		int[][] enTabell = {//[dager][timer]
			{-8,18,17,13}, //[dag 1 (indeks 0][timer]
			{24,22,17,29},
			{24,32,10,20},
			{-4,-5,-20,-23},
			{-9,-10,-20,-30},
			{9,8,6,9},
			};

		Temperaturer mars = new Temperaturer(enTabell);

		System.out.println("Middeltemperaturen for den andre dagen i måneden er: " + mars.formater(mars.finnMiddelTempHverDag(2)));
		System.out.println("Middeltemperaturen kl 1 på dagen er: " + mars.formater(mars.finnMiddelTempHverTime(1)));
		System.out.println("Middeltemperaturen for hele måneden er: " + mars.formater(mars.finnMiddelTempMåned()));
		System.out.println("Antall døgn med middeltemperatur under -5 er: " + mars.skrivUtGrupper(0)); //(Indeks 0 = < -5 | Indeks 1 = (<= -5 && > 0) | Indeks 2 = (>= 0 && < 5) | Indeks 3 = (>= 5 && <= 10) | Indeks 4 = >=10 



	}
}
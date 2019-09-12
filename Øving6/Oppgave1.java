import java.util.Random;
class Oppgave1 {
	public static void main(String[]args) {

	java.util.Random random = new java.util.Random(); //Objekt av klassen java.util.random
	int[] antall = new int[10]; //Ny tabell fra og med 0 til og med 9. //Størrelse 10

	for (int i = 0; i < 5000; i++) { //Kjører x antall ganger
		int tall = random.nextInt(10); //Finner et tilfeldig tall i intervallet [0,9]
		antall[tall] += 1; //Legger til i tabellen
	}
	for (int i = 0; i < antall.length; i++) { //Printer ut
		System.out.println(i + " hadde totalt " + antall[i] + " forekomster.");
	}

	}
}
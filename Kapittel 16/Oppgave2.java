import java.io.*;
class Oppgave2 {
	public Oppgave2() {

		}

	public int[] lesHeltall() {
		int[] tabell;

	}

	public static void main(String[] args) {
		String filnavn = "tallfil.txt";

		try {
			FileReader forbindelseTilFil = new FileReader(filnavn);
			BufferedReader leser = new BufferedReader(forbindelseTilFil);

			Scanner scan = new Scanner(leser);
			double sum = 0;
			try {
				while(scan.hasNext()) {
					double tall = scan.nextDouble();
					sum += tall;
				}
				System.out.println("Summen av tallene er " + sum + ".");
			}catch(InputMismatchException e) {
				System.out.println("Feil ved omforning av tall.");
			}
			scan.close();
			leser.close();
		} catch(FileNotFoundException e) {
			System.out.println("Fil ikke funnet: " + filnavn);
		} catch(IOException e) {
			System.out.println("IO-Feil ved åpning/lukking av fil: " + filnavn);
		}
	}
}
}
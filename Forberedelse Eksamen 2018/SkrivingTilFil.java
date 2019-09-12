import java.io.*;
class SkrivingTilFil {
	public static void main(String[] args) {
		String filnavn = "test.txt";
		//FALSE -> Alt fjernes
		//TRUE -> Skriver oppå
		try (FileWriter forbFil = new FileWriter(filnavn,false); PrintWriter skriver = new PrintWriter(new BufferedWriter(forbFil))) {
			for (int i = 0; i < 10;i++) {
				skriver.println("Spiller " + (i+1));
			}
			skriver.close();
		}catch (IOException e) {
			System.out.println("Feil: " + e);
		}
	}
}

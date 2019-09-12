import java.io.*;

class MineData {
	public static void main(String[] args) {

		//Oppgave 1:
		/*String fil = "minedata.txt";
		try(FileReader leseForbindelse = new FileReader(fil);BufferedReader leser = new BufferedReader(leseForbindelse);
			FileWriter skriveForbindelse = new FileWriter(fil, true); PrintWriter skriver = new PrintWriter(new BufferedWriter(skriveForbindelse))) {

			String tekst = leser.readLine();
			int teller = 0;
			while(tekst != null) {
				teller ++;
				tekst = leser.readLine();
			}
			System.out.println("Det er totalt " + teller + " linjer i filen.");


		} catch(EOFException eofe) {
			System.out.println("Uventet slutt på filen");
		} catch(IOException ioe) {
			System.out.println("IO feil: " + ioe);
		} 
	}*/

	//Oppgave2:
	String filLes = "minedata.txt";
	String filSkriv = "dineData.txt";
	try(FileReader leseForb = new FileReader(filLes); BufferedReader leser = new BufferedReader(leseForb);
		FileWriter skriveForb = new FileWriter(filSkriv,true); PrintWriter skriver = new PrintWriter(new BufferedWriter(skriveForb))){

		String tekstLest = leser.readLine();

		while (tekstLest != null) {
			skriver.println(tekstLest.toUpperCase());
			tekstLest = leser.readLine();
		}

	} catch (EOFException eofe) {
		System.out.println("Uventet slutt på filen");
	} catch (IOException ioe) {
		System.out.println("IO feil: " + ioe);
	}
}
}
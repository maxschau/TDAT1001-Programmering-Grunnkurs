import java.io.*;
import java.util.*;
class Saldo {
	public static void main(String[] args) {
		String saldoFil = "saldo.txt";
		String transaksjonFil = "transaksjon.txt";


		try {
			FileReader forbindelseTilFilSaldo = new FileReader(saldoFil);
			FileReader forbindelseTilFilTransaksjon = new FileReader(transaksjonFil);
			BufferedReader leserSaldo = new BufferedReader(forbindelseTilFilSaldo);
			BufferedReader leserTransaksjon = new BufferedReader(forbindelseTilFilTransaksjon);

			double orgininalSaldo = Double.parseDouble(leserSaldo.readLine());
			double saldo = orgininalSaldo;
			Scanner scan = new Scanner(leserTransaksjon);

			FileWriter skriveForbTilFilSaldo = new FileWriter(saldoFil, false);
			PrintWriter skriverSaldo = new PrintWriter(new BufferedWriter(skriveForbTilFilSaldo));

			

			try {
				while(scan.hasNextLine()) { //Kjører så lenge det finnes en neste linje
					char type = scan.next().charAt(0); //Type transaksjon
					double tall = Double.parseDouble(scan.next()); //Finner så tallet
					if (type == 'U') { //Uttak
						saldo -= tall;
					}
					if (type == 'I') { //Innskudd
						saldo += tall;
					}
				}
				
				if (saldo >= 0) { //Saldoen er over 0 
					skriverSaldo.print(saldo);
				} else { //Saldoen er negativ
					skriverSaldo.print(orgininalSaldo); //Endrer til originalsaldoen
					FileWriter skriveForbTilFilTransaksjon = new FileWriter(transaksjonFil, false);
					PrintWriter skriverTransaksjon = new PrintWriter(new BufferedWriter(skriveForbTilFilTransaksjon));
					//Fjerner hele transaksjonsfilen.
				} 
				skriverSaldo.close();				

			}catch(InputMismatchException e) {
				System.out.println("Feil ved omforning av tall.");
			}


		} catch(IOException e) {
			System.out.println("IO-Feil ved åpning/lukking av fil : " + saldoFil + "/ " + transaksjonFil);
		}
	}
}
import javax.swing.JOptionPane;
class Eksamen_H2017{
 	public static void main(String[] args){
		String[] muligheter = {"Legg til ord", "Legg til definisjon", "Avslutt"}
		final int LEGG_TIL_ORD = 0;
		final int LEGG_TIL_DEFINISJON = 1;
		final int AVSLUTT = 2;
		int valg = showOptionDialog(null, "Velg", "Eksamen des 2017",  YES_NO_OPTION, INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
		String navn = "Ordboka";
		Ordbok ordbok = new Ordbok(navn, 10);
		while (valg != AVSLUTT){
			switch (valg){
				case LEGG_TIL_ORD:
				String ordLest = showInputDialog("Skriv inn ordet du �nsker � registrere"); //Bruker kan skrive inn et nytt ord
				Ord nyOrd = new Ord(ordLest); //Lager et nytt objekt av klassen Ord med verdien fra ordLest
				//System.out.println(ordbok.regNyttOrd(nyOrd));
				ordbok.regNyttOrd(nyOrd);
				break;
				case LEGG_TIL_DEFINISJON:
				String ordLest1 = showInputDialog("Skriv inn ordet du �nsker � legge til en definisjon p�");
				String definisjonLest = showInputDialog("Skriv inn definisjonen");
				ordbok.leggTilDefinisjon(ordLest1, definisjonLest);
				break;
				default: break;
				}
			valg = showOptionDialog(null, "Velg", "Eksamen des 2017", YES_NO_OPTION, INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
		}
	}
}

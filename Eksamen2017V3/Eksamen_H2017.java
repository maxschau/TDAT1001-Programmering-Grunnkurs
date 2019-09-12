import static javax.swing.JOptionPane.*;

class Eksamen_H2017{
	public static void main(String[] args){
		String[] muligheter = {"Legg til ord", "Legg til definisjon", "Avslutt"};
		final int LEGG_TIL_ORD = 0;
		final int LEGG_TIL_DEFINISJON = 1;
		final int AVSLUTT = 2;
		int valg = showOptionDialog(null, "Velg", "Eksamen des 2017",  YES_NO_OPTION, INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
		String navn = "Ordboka";
		Ordbok ordbok = new Ordbok(navn);
		while (valg != AVSLUTT){
			switch (valg){
				case LEGG_TIL_ORD:
					String nyttOrd = showInputDialog("Skriv inn nytt ord");
					Ord o1 = new Ord(nyttOrd);
					showMessageDialog(null,ordbok.regNyttOrd(o1));
					//Kunne eventuelt ha lagt til feilmeldinger dersom registreringen ikke gikk bra, men velger å se bort i fra dette her
				break;
				case LEGG_TIL_DEFINISJON:
					String sokeOrd = showInputDialog("Skriv inn ordet du ønsker å legge til definisjon");
					String nyDef = showInputDialog("Skriv inn den nye definisjonen");
					showMessageDialog(null,ordbok.leggTilDefinisjon(sokeOrd, nyDef));
					//Kunne eventuelt ha lagt til feilmeldinger dersom registreringen ikke gikk bra, men velger å se bort i fra dette her
				break;
				default: break;
			}
		valg = showOptionDialog(null, "Velg", "Eksamen des 2017", YES_NO_OPTION, INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
		}
	}
}

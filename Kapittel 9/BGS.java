import static javax.swing.JOptionPane.*;

public class BGS {
	public static void main(String[] args) {
		velgeBGS velge = new velgeBGS();

		int valg = velge.lesValg();
		while (valg >= 0) {
			velge.utforValgtOppgave(valg);
			valg = velge.lesValg();
		}
	}


}

class velgeBGS {
	private final String[] ALTERNATIVER = {"Pluss", "Minus", "Multiplikasjon", "Divisjon","Avslutt"};
	private final int PLUSS = 0;
	private final int MINUS = 1;
	private final int MULTIPLIKASJON = 2;
	private final int DIVISJON = 3;
	private final int AVSLUTT = 4;

	public int lesValg() {
		int valg = showOptionDialog(null, "Gjør et valg", "Valg", DEFAULT_OPTION, PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
		if (valg == AVSLUTT) {
			valg = -1;
		}
		return valg;
		
	}

	public void utforValgtOppgave(int valg) {
		switch(valg) {
			case PLUSS:
				pluss();
				break;
			case MINUS:
				minus();
				break;
			case MULTIPLIKASJON:
				multiplikasjon();
				break;
			case DIVISJON:
				divisjon();
				break;
			default:
				break;

		}
	}

	public double pluss() {
		String tall1Lest = showInputDialog("Skriv inn tall");
		String tall2Lest = showInputDialog("Skriv inn tall");
		int tall1 = Integer.parseInt(tall1Lest);
		int tall2 = Integer.parseInt(tall2Lest);
		return tall1 + tall2;
	}
	public double minus() {
		String tall1Lest = showInputDialog("Skriv inn tall");
		String tall2Lest = showInputDialog("Skriv inn tall");
		int tall1 = Integer.parseInt(tall1Lest);
		int tall2 = Integer.parseInt(tall2Lest);
		return tall1 - tall2;
	}
	public double multiplikasjon() {
		String tall1Lest = showInputDialog("Skriv inn tall");
		String tall2Lest = showInputDialog("Skriv inn tall");
		int tall1 = Integer.parseInt(tall1Lest);
		int tall2 = Integer.parseInt(tall2Lest);
		return tall1 * tall2;
	}
	public double divisjon() {
		String tall1Lest = showInputDialog("Skriv inn tall");
		String tall2Lest = showInputDialog("Skriv inn tall");
		int tall1 = Integer.parseInt(tall1Lest);
		int tall2 = Integer.parseInt(tall2Lest);
		return tall1 / tall2;
	}
}
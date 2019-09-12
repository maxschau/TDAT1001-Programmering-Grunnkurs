import static javax.swing.JOptionPane.*;
class hex {
	private final char start = '#';
	public static void main(String[] args) {
		String rod = showInputDialog("Skriv inn rødfargen");
		String gronn = showInputDialog("Skriv inn grønnfargen");
		String bla = showInputDialog("Skriv inn blåfargen");

		String[] hex = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		String resultat = "#";
		for (int i = 0; i < hex.length; i++) {
			if (rod.equals(hex[i])) {
				resultat += 
			}
		}
		
		
	}
}
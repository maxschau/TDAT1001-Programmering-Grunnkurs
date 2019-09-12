import static javax.swing.JOptionPane.*;

class oppgave3 {
	public static void main(String[]args) {
		int sum = 0;
		int produkt=1;
		for (int linjeteller = 1; linjeteller < 10; linjeteller++) {
			sum += linjeteller;
			produkt *= linjeteller;
			for (int tall = 1; tall <= linjeteller; tall++) {
				System.out.println(tall + "");
			}
			System.out.println("Summen blir: " + sum);
			System.out.println("Produktet blir: " + produkt);
		}

	}
}
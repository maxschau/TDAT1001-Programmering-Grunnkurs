import static javax.swing.JOptionPane.*;

class EnMatvare {
	public static void main(String[] args) {
	Matvare pommesGateKj = new Matvare("Pommes Frites, gatekjøkken", 1381, 3.0, 39.8);
	Matvare pommesFryst = new Matvare("Pommes Frites, fryst", 641, 2.2, 22.0);
	Matvare koktPotet = new Matvare("Kokt potet", 339, 1.9, 17.1);

	String matmengdeLest = showInputDialog("Skriv inn ønsket matmengde du ønsker beregning for");

	while (matmengdeLest != null) {
	double tall = Double.parseDouble(matmengdeLest);

	showMessageDialog(null,"Navn: " + pommesGateKj.getNavn() + "\nFett: " + pommesGateKj.getFett(tall) + "\nKarbohydrater: " + pommesGateKj.getKarbohydrater(tall) + "\nEnergi(Kj): " + pommesGateKj.getEnergiKj(tall) + "\nEnergi(Kcal): " + pommesGateKj.getEnergiKcal(tall) + "\n");
	showMessageDialog(null,"Navn: " + pommesFryst.getNavn() + "\nFett: " + pommesFryst.getFett(tall) + "\nKarbohydrater: " + pommesFryst.getKarbohydrater(tall) + "\nEnergi(Kj): " + pommesFryst.getEnergiKj(tall) + "\nEnergi(Kcal): " + pommesFryst.getEnergiKcal(tall) + "\n");
	showMessageDialog(null,"Navn: " + koktPotet.getNavn() + "\nFett: " + koktPotet.getFett(tall) + "\nKarbohydrater: " + koktPotet.getKarbohydrater(tall) + "\nEnergi(Kj): " + koktPotet.getEnergiKj(tall) + "\nEnergi(Kcal): " + koktPotet.getEnergiKcal(tall) + "\n");

	matmengdeLest = showInputDialog("Skriv inn ønsket matmengde du ønsker beregning for");
	}

	}
}
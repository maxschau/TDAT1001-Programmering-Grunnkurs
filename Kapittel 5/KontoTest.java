import static javax.swing.JOptionPane.*;
class KontoTest {
	public static void main(String[]args) {
		final double TOLERANSE = 0.001;
		System.out.println("Totalt antall tester : 4");

		Konto kontoOle = new Konto(123456675645L, "Ole Olsen", 0.0);

		if (kontoOle.getKontonr() == 123456675645L && kontoOle.getNavn().equals("Ole Olsen") && kontoOle.getSaldo() == 0.0) {
			System.out.println("Konto: Test 1 vellykket");
		}

		boolean transOk = kontoOle.utførTransaksjon(1000);
		double nySaldo = kontoOle.getSaldo();
		if (transOk && Math.abs(nySaldo - 1000) < TOLERANSE) {
			System.out.println("Konto: Test 2 vellykket");
		}

		Konto kontoPer = new Konto(223456L, "Per Olsen", 3000.0);
		transOk = kontoPer.utførTransaksjon(-1000);
		nySaldo = kontoPer.getSaldo();
		if (transOk && Math.abs(nySaldo - 2000) < TOLERANSE) {
			System.out.println("Konto: Test 3 vellykket");
		}

		Konto kontoEva = new Konto(12345L, "Eva Olsen", 0.0);
		transOk = kontoEva.utførTransaksjon(-100);
		nySaldo = kontoEva.getSaldo();
		if (!transOk && Math.abs(nySaldo - 0) < TOLERANSE) {
			System.out.println("Konto: Test 4 vellykket");
		}
	}
}
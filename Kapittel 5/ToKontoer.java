import static javax.swing.JOptionPane.*;
class ToKontoer {
	public static void main(String[]args) {
	/*Oppretter to objekter, ett for Ole og ett for Per */
	Konto olesKonto = new Konto(123456676756L, "Ole Olsen", 2300.5);
	Konto persKonto = new Konto(223456676756L, "Per Hansen", 5000);



	if (olesKonto.utførTransaksjon(-1000)){
		double oleSaldo = olesKonto.getSaldo();
		System.out.println("Transaksjon ok. Saldo: " + oleSaldo);
	} else {
		System.out.println("Transaksjon ikke ok");
	}


	}
}
import java.util.Arrays;

class Konto {
	private int kontonr;
	private String navn;
	private double saldo;
	private Transaksjon[] transaksjoner; 

	public Konto(int kontonr, String navn, double saldo) {
		this.kontonr = kontonr;
		this.navn = navn;
		this.saldo = saldo;
		this.transaksjoner = new Transaksjon[0];
	}

	public int getKontonr() {
		return kontonr;
	}
	public String getNavn() {
		return navn;
	}
	public double getSaldo() {
		return saldo;
	}

	public String toString() {
		return "Kontonr: " + kontonr + ", Navn: " + navn + ", saldo: " + saldo + "kr.";
	}

	public void oppdaterSaldo(double nyBelop) {
		this.saldo += nyBelop;
	}
	public void sorterTabell() {
		Arrays.sort(transaksjoner,new );

	}

	public void getTransaksjoner() {
		for (int i = 0; i < transaksjoner.length; i++) {
			System.out.println(transaksjoner[i].getDato() + ", " + transaksjoner[i].getBelop());
		}
	}

	public boolean registrerTransaksjon(Transaksjon nyTransaksjon) {
		utvidTabell();
		transaksjoner[transaksjoner.length-1] = nyTransaksjon;
		return true;
	}

	//Hjelpemetode:
	private void utvidTabell() {
		Transaksjon[] nyTab = new Transaksjon[transaksjoner.length + 1];
		for (int i = 0; i < transaksjoner.length; i++) {
			nyTab[i] = transaksjoner[i];
		}
		transaksjoner = nyTab;
		
	}




	public static void main(String[] args) {
		Konto k1 = new Konto(123, "Max", 123.5);
		Transaksjon t1 = new Transaksjon(20091212,140);
		Transaksjon t2 = new Transaksjon(20080808, 100);
		System.out.println(k1.toString());
		k1.registrerTransaksjon(t1);
		k1.registrerTransaksjon(t2);
		k1.getTransaksjoner();
		
	}

}
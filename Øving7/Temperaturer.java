class Temperaturer {
	public int[][] temperatur;

	public Temperaturer(int[][] tabell) {
		this.temperatur = new int[tabell.length][tabell[0].length];
		for (int i = 0; i < temperatur.length; i++) {
			for (int j = 0; j < temperatur[i].length; j++) {
				this.temperatur[i][j] = tabell[i][j]; //Dyp kopiering
			}
		}
	}

	public double finnMiddelTempDag(int dato) { //Finner gjennomsnittet for en spesifikk dag
		if (dato <= 0 || dato > temperatur.length) {
			throw new IllegalArgumentException("Ugyldig dato");
		}
		int indeks = dato - 1;
		double total = 0;
		for (int i = 0; i < temperatur[indeks].length; i++) {
			total += temperatur[indeks][i];
		}
		return total/temperatur[indeks].length;
	}

	public double finnMiddelTempHverDag(int dato) { 
		if (dato <= 0 || dato > temperatur.length) {
			throw new IllegalArgumentException("Ugyldig dato");
		}
		double[] middelTempDag = new double[temperatur.length];
		for (int i = 0; i < temperatur.length; i++) {//Legger alle middeltemperaturene i en tabell
			middelTempDag[i] = finnMiddelTempDag(i+1); //i+1 for å få det som dato
		}
		return middelTempDag[dato-1]; //Returnerer ønsket datos middeltemp

	}

	public double finnMiddelTempTime(int time) { //Finner middeltemp
		if (time < 0 || time > temperatur[0].length) {
			throw new IllegalArgumentException("Ugyldig dato");
		}
		int indeks = time;
		double total = 0;
		for (int i = 0; i < temperatur.length; i++) { 
			total += temperatur[i][indeks];
		}
		return total/temperatur.length;
	}

	public double finnMiddelTempHverTime(int time) {
		double[] middelTempTime = new double[temperatur.length];
		for (int i = 0; i < temperatur[i].length; i++) { //Legger alle temperaturene inn i en tabell
			middelTempTime[i] = finnMiddelTempTime(i);
		}
		return middelTempTime[time];

	}

	public double finnMiddelTempMåned() {
		double total = 0;
		for (int i = 0; i < temperatur.length; i++) {
			total += finnMiddelTempDag(i+1);
		}
		return total/temperatur.length;
	}




	public int[] grupper = new int[5]; //Indeks 0 = mindre enn -5 osv

	public int skrivUtGrupper(int indeks) {
		if (indeks < 0 || indeks > 4) {
			throw new IllegalArgumentException("Ugyldig dato");
		}
		for (int i = 1; i <= temperatur.length; i++) {
			if (finnMiddelTempHverDag(i) < -5) { //Grupper med mindre enn -5
				grupper[0] += 1;
			} else if (finnMiddelTempHverDag(i) >= -5 && finnMiddelTempHverDag(i) < 0) { //Grupper mellom -5 og 0
				grupper[1] += 1;
			} else if (finnMiddelTempHverDag(i) >= 0 && finnMiddelTempHverDag(i) < 5) { //Grupper mellom 0 og 5
				grupper[2] += 1;
			} else if (finnMiddelTempHverDag(i) >= 5 && finnMiddelTempHverDag(i) < 10) { //Grupper mellom 5 og 10
				grupper[3] += 1;
			} else { //Grupper for større enn 10
				grupper[4] += 1;
			}
		}
		return grupper[indeks];
	}



	public String formater(double tall) {
	java.util.Formatter f = new java.util.Formatter(); //FOrmaterer
	f.format("%.2f", tall);
	return f.toString();
	}
}


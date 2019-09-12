class BeleggKlient {
	public static void main(String[] args) {
		Flate flaten = new Flate("Berits golv", 5,6);
		System.out.println(flaten.toString());
	
		Belegg belegget = new Belegg("Vegg-til-vegg teppe", 243.50,5);
		System.out.println(belegget.toString());

		//Samarbeid mellom belegg- og flatebojektet for å finne antall meter og pris
		double antMeter = belegget.beregnAntMeter(flaten);
		double pris = belegget.beregnTotalpris(flaten);

		java.util.Formatter f = new java.util.Formatter();
		f.format("Berit trenger %.2f meter, pris kr %.2f.", antMeter, pris);
		System.out.println(f.toString());
	}

}
class SorteringAvFlater {
	public static void main(String[] args) {
		Flate[] flater = {
		new Flate("Flate 1", 10,5), new Flate("Flate 2", 1,5),
		new Flate("Flate 3", 5,5), new Flate("Flate 4", 5,5)
		};

		System.out.println("Standarsortering (iht. navn)");
		Sortering.sorterObjekter(flater);
		for (int i = 0; i < flater.length; i++) {
			System.out.println(flater[i]);
		}
	}

}
class Temperaturer {
	private int[][] temperatur;

	public Temperaturer(int[][] tabell) {
		this.temperatur = new int[31][24];
		for (int i = 0; i < temperatur.length; i++) {
			temperatur[i][i] = tabell[i][i];
		}
	}

}
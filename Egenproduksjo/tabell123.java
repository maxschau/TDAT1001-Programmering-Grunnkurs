class tabell123 {

	public void utvidTabell() {
		int[] nyTab = new int[tabell.length + 1]; //Utvider med 1
		for (int i = 0; i < tabell.length; i++) {
			nyTab[i] = tabell[i];
		}
		tabell = nyTab;
	}

}
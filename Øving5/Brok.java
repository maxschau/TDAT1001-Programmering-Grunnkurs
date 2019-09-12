class Brok {
	public int teller;
	public int nevner;

	public Brok(int teller, int nevner) {
		if (nevner == 0) {
			throw new IllegalArgumentException("Nevner kan ikke være lik 0");
		}
		this.teller = teller;
		this.nevner = nevner;
	}

	public Brok(int teller){
		this.teller = teller;
		this.nevner = 1;
	}

	public int getTeller() {
		return teller;
	}

	public int getNevner() {
		return nevner;
	}

	public void multipliserBrok(int teller1, int nevner1) {
		teller = teller * teller1;
		nevner = nevner * nevner1;
	}

	public void dividerBrok(int teller1, int nevner1) {
		teller = teller * nevner1;
		nevner= nevner * teller1;
	}

	public void summerBrok(int teller1, int nevner1) {
		teller = teller*nevner1 + teller1*nevner;
		nevner = nevner * nevner1;
	}

	public void subtraherBrok(int teller1, int nevner1) {
		teller = teller*nevner1 - teller1*nevner;
		nevner = nevner * nevner1;
	}

	public String toString() {
		return teller + "/" + nevner;
	}

	public void subBrok(Brok) {
		teller = teller*Brok.nevner - Brok.teller*nevner;
		nevner = nevner * Brok.nevner;
	}






}
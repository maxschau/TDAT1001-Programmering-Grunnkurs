class Resultatservice {
	public double[][] resultatTabell;
	private String[] teamnavn;

	public Resultatservice(int antTeam, int antHeat, double[][] tabell) {
		this.teamnavn = new String[antTeam];
		this.resultatTabell = new double[antHeat][antTeam];
		for (int i= 0; i < antHeat; i++) {
			this.resultatTabell[i][i] = tabell[i][i];
		}
	}

	public boolean settTid(int heat, int team, double tid) {
		return true;

	}

	public int finnAntallHeat() {
		return resultatTabell.length;
	}

	public int finnAntallTeam() {
		return resultatTabell[0].length;
	}

	/*public void printTabell() {
		for (int i = 0; i < finnAntallHeat(); i++) {
			System.out.print("Heat " + (i+1) + "  ");
		}
		for (int j = 0; j < finnAntallTeam(); j++) {
						System.out.println("Team " + (j));
			}
	}*/

	public void printTabell() {
		for (int i = 0; i < finnAntallHeat(); i++) {
			System.out.print(resultatTabell[2][2] + "  ") ;

		}


	}







}


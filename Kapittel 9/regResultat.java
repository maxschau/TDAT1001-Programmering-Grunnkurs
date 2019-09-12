class regResultat{
	public static void main(String[] args) {
		double[][] resultat1 = {{20.30 , 24.26, 21.34}, {35.73 , 26.29, 45.79}, {52.46, 48.05, 0.00}, {33.64 , 34.13, 32.60}};
		Resultatservice resultat = new Resultatservice(4,3, resultat1);

		for (int i = 0; i < resultat.resultatTabell.length; i++) {
			System.out.print(resultat.resultatTabell[0][1] + "j");
		}

	}

}
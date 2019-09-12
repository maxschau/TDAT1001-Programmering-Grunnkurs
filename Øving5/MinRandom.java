import java.util.Random;
class MinRandom {
	public MinRandom() { //Tom konstruktør
	}

	java.util.Random tilfeldig = new java.util.Random();



	public int nesteHeltall(int nedre, int ovre) { //Internvallet [nedre, ovre]
		int tall = tilfeldig.nextInt(ovre-nedre + 1) + nedre;
		return tall;
	}

	public double nesteDesimaltall(double nedre, double ovre) { //Intervallet <nedre, ovre>
		double tall = nedre + tilfeldig.nextDouble() * (ovre-nedre);
		return tall;
	}


}
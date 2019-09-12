public class Sirkel {
	private final double radius;

		public Sirkel(double radius) {
		this.radius = radius;
		}

		public double getRadius() {
			return radius;
		}

		public String toString() {
			return "Radius til sirkel: " + radius;
		}

		public double beregnAreal() {
			return 2*Math.PI*(radius)*radius;
		}
}
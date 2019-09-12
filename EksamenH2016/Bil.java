class Bil {
	private String regnr;
	private Motor motor;
	private Hjul hjul;

	public Bil(String regnr, Motor motor, Hjul hjul) {
		this.regnr = regnr;
		this.motor = new Motor(motor.getMotornr(), motor.getGirkasse(), motor.getMotortype());
		this.hjul = hjul;
	}

	public Motor getMotor() {
		return motor;
	}

	public String getRegnr() {
		return regnr;
	}

	public Hjul getHjul() {
		return hjul;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Bil)) { //Hvis objektet ikke er av klassen Bil
			return false;
		}

		if (this == obj) { //Hvis this er det samme som objektet vi sammenligner
			return true;
		}

		Bil instance = (Bil) obj;
		if (instance.getMotor().getMotornr() == motor.getMotornr() && instance.getRegnr().equals(regnr)) {
			return true;
		}
		return false;
	}

}
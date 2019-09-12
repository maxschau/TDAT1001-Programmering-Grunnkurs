class Hjul {
	private final String merke;
	private final String dimensjon;
	private final String dekktype;

	public Hjul(String merke, String dimensjon, String dekktype) {
		this.merke = merke;
		this.dimensjon = dimensjon;
		this.dekktype = dekktype;
	}

	public String getMerke() {
		return merke;
	}

	public String getDimensjon() {
		return dimensjon;
	}

	public String dekktype() {
		return dekktype;
	}

	public String toString() {
		return "Merke: " + merke + ", Dimensjon: " + dimensjon + ", dekktype: " + dekktype;
	}



}
class Funnel {
	public static boolean test(String test1, String test2) {
		for (int i = 0; i < test1.length();i++) {
			StringBuilder tekst = new StringBuilder(test1);
			StringBuilder tekst2 = new StringBuilder(test2);
			tekst.deleteCharAt(i);
			if (tekst.toString().equals(tekst2.toString())) {
				return true;
			}
		}
		return false;

	}
	public static void main(String[] args) {
		System.out.println(test("leave", "eave"));
		System.out.println(test("reset", "rest"));
		System.out.println(test("dragoon", "dragon"));
		System.out.println(test("eave", "leave"));		
		System.out.println(test("sleet", "lets"));
		System.out.println(test("skiff", "ski"));	
	

		
	}
}
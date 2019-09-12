class JUnit {
	public static void main(String[] args) {
	@Before
	public void setUp() {
		Idrettsgren instance = new Idrettsgren("L�ping", 2);
		instance.regNyOvelse("400M", "Kvinner");
		//instance.regNyOvelse("800M", "Menn");


	@Test
	public void testRegOvelse() {
		System.out.println("Sjekker at det g�r an � registrere �velse");
		boolean expResult = true;
		boolean result = instance.regNyOvelse("800", "Menn");
	}


	@Test
	public void testRegOvelse2() {
		//Tester at den ikke registrerer flere enn maks antall:
		System.out.println("Test at man ikke kan registrere flere �velser enn maks_antall");
		regNyOvelse("200M", "Kvinner");
		boolean expResult = false;
		boolean result = instance.regNyOvelse("600M", "Menn");
		assertEquals(expResult, result);
	}
	@Test
	public void testRegOvelse3() {
		//Tester at det ikke g�r an � registrere like �velser
		System.out.println("Test regOvelse");
		boolean expResult = false;
		boolean result = instance.regNyOvelse("400", "Kvinner");
		assertEquals(expResult, result);
	}


	}
}
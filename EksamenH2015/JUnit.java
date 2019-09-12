class JUnit {
	public static void main(String[] args) {
	@Before
	public void setUp() {
		Idrettsgren instance = new Idrettsgren("Løping", 2);
		instance.regNyOvelse("400M", "Kvinner");
		//instance.regNyOvelse("800M", "Menn");


	@Test
	public void testRegOvelse() {
		System.out.println("Sjekker at det går an å registrere øvelse");
		boolean expResult = true;
		boolean result = instance.regNyOvelse("800", "Menn");
	}


	@Test
	public void testRegOvelse2() {
		//Tester at den ikke registrerer flere enn maks antall:
		System.out.println("Test at man ikke kan registrere flere øvelser enn maks_antall");
		regNyOvelse("200M", "Kvinner");
		boolean expResult = false;
		boolean result = instance.regNyOvelse("600M", "Menn");
		assertEquals(expResult, result);
	}
	@Test
	public void testRegOvelse3() {
		//Tester at det ikke går an å registrere like øvelser
		System.out.println("Test regOvelse");
		boolean expResult = false;
		boolean result = instance.regNyOvelse("400", "Kvinner");
		assertEquals(expResult, result);
	}


	}
}
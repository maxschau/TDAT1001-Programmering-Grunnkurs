class JUnit {
	Idrettsgren instance;

	@Before
	public void setUp() {
		instance = new Idrettsgren("Løping", 2);
	}

	@Test
	public void testRegOvelse1() {
		//Tester at den kan registrere 1 øvelse
		Ovelse o1 = new Ovelse("400M", "Kvinner");
		boolean expResult = true;
		boolean result = instance.regNyOvelse(o1);
		assertEquals(expResult,result);
	}

	@Test
	public void testRegOvelse2() {
		//Tester at den ikke kan registrere mer enn maks antall = 3
		Ovelse o1 = new Ovelse("400M", "Kvinner");
		Ovelse o2 = new Ovelse("800M", "Menn");
		Ovelse o3 = new Ovelse("400M", "Menn");
		instance.regNyOvelse(o1);
		instance.regNyOvelse(o2);
		boolean expResult = false;
		boolean result = regNyOvelse(o3);
		assertEquals(expResult,result);
	}
	@Test
	public void testRegOvelse3() {
		//Tester at den ikke kan registrere en identisk ovelse som tidligere er registrert
		Ovelse o1 = new Ovelse("400M", "Kvinner");
		Ovelse o2 = new Ovelse("400M", "Kvinner");
		instance.regNyOvelse(o1);
		instance.regNyOvelse(o2);
		boolean expResult = false;
		boolean result = regNyOvelse(o2);
		assertEquals(expResult,result);
	}
}
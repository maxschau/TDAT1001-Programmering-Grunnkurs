class JUNIT {
	public static void main(String[] args) {
		@Before
		public void setUp() {
			Bokstaveringsalfabet instance = new Bokstaveringsalfabet("Test", "Alfa-Beta-Delta-Echo", '-');
			Bokstaveringsalfabet instance2 = new Bokstaveringsalfabet("Test", "Beta-Alfa-Echo-Delta", '-');
		}

		@Test
		public void testSorter() {
			instance2.sorter();
			String expResult = "Alfa Beta Echo Delta";
			String result = instance2.toString();
			assertEquals(expResult,result);
		}

		@Test
		public void TestKonverter() {
			String expResult = "ABBA: Alfa-Beta-Delta-Echo";
			String result = instance.konverter("ABBA");
			assertEquals(expResult,result);
		}

	}
}
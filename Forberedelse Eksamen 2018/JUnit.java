import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


public class JUnit {
	Student instance;
	Student instance2;
	Student instance3;

	@Before
	public void setUp() {
		instance = new Student("Max", 20,1920);
		instance2 = new Student("Anders", 21, 1920);
		instance3 = new Student("Max", 20,1920);
	}

	@Test
	public void testEquals() {
		boolean expResult = false;
		boolean result = instance.equals(equals(instance2));
		assertEquals(expResult,result);
	}

	@Test
	public void testGetNavn() {
		String expResult = "Max";
		String result = instance.getNavn();
		assertEquals(expResult,result);
	}

	public void testGetStudnr() {
		int expResult = 1920;
		int result = instance.getStudnr();
		assertEquals(expResult,result);
	}


}

package proj250716;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// see foot of listing for a teaching commentary

public class IanPowerTest {
	int result1, result2, result3, result4, result5;
	
	@Before
	public void setUp() throws Exception {
		result1 = IanPower.power(2, 3);
		result2 = IanPower.power(2, 0);
		result3 = IanPower.power(0, 0);	
		result4 = IanPower.power(-2, 4);
		result5 = IanPower.power(-2, 3);
	}

	@Test
	public void testPositveNaturalNumber() {
		assertEquals("positive natural number", 8, result1);
	}
	
	@Test
	public void nonZeroToPowerZero() {
		assertEquals("non-zero to power of 0", 1, result2);
	}
	
	@Test
	public void zeroToPowerZero() {
		assertEquals("zero to power of 0", 1, result3);
	}
	
	@Test
	public void negativeToEvenPower() {
		assertEquals("negative to even power", 16, result4);
	}
	
	@Test
	public void negativeToOddPower() {
		assertEquals("negative to odd power", -8, result5);
	}
}

/* Commentary on the above code:  An instance of IanPowerTest is constructed
 * for each and every test, five tests in all.  Each instance has of course
 * its own copy of each of the five attributes result1 to result5.  The
 * setUp method gets executed for each instance, BUT each instance executes
 * just ONE of the five @Test methods, the first instance executes 
 * testPositiveNaturalNumber(), the second instance executes 
 * nonZeroToPowerZero() and so on.  The text in the five assertEquals is
 * optional and, if provided, provides a text to appear in any failure
 * report; make one of the tests fail to see how it works.  
 * 
 * All the above behviour is provided for by the JUnit framework! */

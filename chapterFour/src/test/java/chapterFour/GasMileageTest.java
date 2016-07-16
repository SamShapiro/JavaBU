package chapterFour;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Test case for the Gas Mileage assignment
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */
public class GasMileageTest {

	//tests to see that calculateMilesPerGallon returns infinity if gallons is 0
	@Test
	public void testDivideByZero() {
		float mpgTest = GasMileage.calculateMilesPerGallon(400, 0);
		assertTrue(Float.isInfinite(mpgTest));
	}

}

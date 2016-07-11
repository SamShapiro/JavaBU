package compare;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

/**
 * These are tests that verify the result
 * of running compareTo on ONLY Strings.
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */

public class ComparatorTest {

	
	@Test
	public void negativeTest() {
		String f = "a";
		String s = "b";
		assertTrue(f.compareTo(s) < 0);
	}
	
	@Test
	public void equalTest() {
		String f = "a";
		String s = "a";
		assertTrue(f.compareTo(s) == 0);
	}
	
	@Test
	public void positiveTest() {
		String f = "b";
		String s = "a";
		assertTrue(f.compareTo(s) > 0);
	}
	
	@Test
	public void showEdgeCaseOnScanner() {
		Scanner s = new Scanner(System.in);
		int result = s.nextInt();
		assertTrue(result > 0);
		s.close();
	}
}

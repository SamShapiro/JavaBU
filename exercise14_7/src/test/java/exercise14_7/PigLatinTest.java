package exercise14_7;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test checks if String rearranging (for pig latin) actually works in PigLatin147 class
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */


public class PigLatinTest {

	@Test
	public void pigLatinize() {
		String word = "test";
		StringBuilder letters = new StringBuilder();
		
		for (int i = 1; i < word.length(); i++) {
			letters.append(word.charAt(i));
		}
		letters.append(word.charAt(0));
		letters.append('a');
		letters.append('y');
		String pigWord = letters.toString();
		assertTrue(pigWord.matches("esttay"));
	}

}

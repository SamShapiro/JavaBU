package movieFileReader;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import movieFileReader.RuntimeFinder;

import org.junit.Test;

/**
 * Test file for RuntimeFinder class
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */

public class RuntimeFinderTest {

	/**
	 * Tests that file is loaded properly, and that it exists
	 */
	@Test
	public void FileLoadTest() {
		File file = new File("movie.txt");
		assertTrue(file.exists());
	}
	
	/**
	 * Tests that file is being read from properly
	 * Checks against known first line of movie.txt
	 */
	@Test
	public void FileReadTest() {
		File file = new File("movie.txt");
		try {
			Scanner scanner = new Scanner(file);
			String firstLine = scanner.nextLine();
			assertTrue(firstLine.equals("Avatar\tPG-13\t162"));
			scanner.close();
			
		} catch (Exception e) {
			fail("Exception: File not Found."); //fails if file isn't found
		}
	}
	
	/**
	 * Tests that average is being calculated properly
	 * checks using the first four movies in movie.txt
	 */
	@Test
	public void AverageTest() {
		File file = new File("movie.txt");
		try {
			Scanner scanner = new Scanner(file);
			int total = 0;
			for (int i = 0; i < 4; i++) {
				//calls getRuntime from RuntimeFinder
				total += RuntimeFinder.getRuntime(scanner.nextLine());
			}
			int avg = total / 4;
			assertTrue(avg == 162); //known average of first four movies
			scanner.close();
		} catch (FileNotFoundException fnf) {
			fail(fnf.getMessage()); //fails if file isn't found
		}
	}
}

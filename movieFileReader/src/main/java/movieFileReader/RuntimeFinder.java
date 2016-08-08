package movieFileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Class used to find average runtime of movies with a given rating.
 * Reads from a file of movies with each line containing a name, rating, and runtime.
 * Gets user input for rating, than finds the average runtime of all movies with that rating.
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */

public class RuntimeFinder {

	static final File file = new File("movie.txt"); //file being read from, in this case, movie.txt
	static Scanner fileReader; // scanner used to read from file
	static Scanner input; // scanner used to get user input
	static String rating; //rating input given by user
	static int totalRuntime; //total runtime of all movies with rating
	static int counter; //counts number of movies with rating
	static int averageRuntime; //average runtime of all movies with rating
	
	
	public static void main(String[] args) {
		try {
			fileReader = new Scanner(file); //opens file with scanner
		} catch (FileNotFoundException fnf) { //if the file (movie.txt) doesn't exist, say so and stop trying
			System.out.println(fnf.getMessage());
			return;
		}
		
		input = new Scanner(System.in); //opens input scanner
		System.out.print("Please enter a movie rating (G, PG, PG-13, or R): ");
		rating = input.next(); //sets rating input
		
		//while loop ensures that rating is G, PG, PG-13, or R
		while (!rating.matches("G|PG|PG-13|R")) {
			System.out.print("That is not a valid rating. Please enter a valid rating: ");
			rating = input.next();
		}
		
		//reads through each line of the file
		while (fileReader.hasNextLine()) {
			String line = fileReader.nextLine();
			
			//if the rating of the movie is the input rating, add the runtime to the total
			if (line.split("\t")[1].equals(rating)) {
				totalRuntime += getRuntime(line);
				counter++;
			}
		}
		
		//prints out average runtime
		try {
			averageRuntime = totalRuntime / counter;
			System.out.printf("Average runtime of movies rated %s is %d minutes.%n", rating, averageRuntime);
		} 
		//if, somehow, no movies with are found, makes sure not to divide by 0 (counter)
		catch (ArithmeticException ae) { 
			System.out.println("Exception: Dividing by zero (counter is at zero)");
			System.out.println("No movies with the given rating were found.");
		}
		
		//closes both open scanners
		input.close();
		fileReader.close();
	}
	
	/**
	 * Method used to extract runtime from line then return it as integer
	 * @param line - line from file containing movie information
	 * @return - movie's runtime as integer
	 */
	public static int getRuntime(String line) {
		
		//the line consists of name, rating, and runtime, separated by tabs
		String[] breakdown = line.split("\t");
		int runtime = Integer.parseInt(breakdown[2]); //converts runtime from string to int
		return runtime;
	}
	
}

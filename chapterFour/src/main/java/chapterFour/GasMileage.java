package chapterFour;

import java.util.Scanner;

/**
 * Using top-down, stepwise refinement and pseudocode, create the following program:
 * Allow user to input gas used and mileage to determine MPG of individual trips, 
 * and then display the total MPG of all trips. Use sentinel-controlled repetition.
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */

/*
 * TOP: Determine individual and overall miles per gallon
 * 
 * Initialize variables
 * Input miles and gallons
 * Calculate and print each trip's MPG
 * Calculate and print overall MPG
 * 
 * PSEUDOCODE
 * 
 * initialize miles to 0
 * initialize gallons to 0
 * initialize totalmiles to 0
 * initialize totalgallons to 0
 * 
 * ask for miles (can be sentinel)
 * 		if sentinel, stop
 * 		ask for gallons
 * 		get MPG by dividing miles by gallons
 * 		print MPG
 * 		add miles to totalmiles
 * 		add gallons to total gallons
 * 		while miles isn't the sentinel, repeat
 * 
 * if counter isn't equal to 0
 * 		calculate overall MPG by dividing totalmiles by totalgallons
 * 		print overall MPG
 * else
 * 		print "no entries"
 */

public class GasMileage {
	
	private static int miles; //miles driven in a single trip
	private static int gallons; //gallons consumed in a single trip
	private static int totalMiles; //miles driven over every trip
	private static int totalGallons; // gallons consumed over every trip
	Scanner scanner; // class uses scanner to get miles and gallons

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do { //do-while statement asks for miles at least once
			System.out.print("Enter miles driven. If there are no more entries, enter -1: ");
			miles = scanner.nextInt();
			if (miles == -1) //if miles equals -1 (the sentinel), end the loop
				break;
			System.out.print("Enter gallons consumed: ");
			gallons = scanner.nextInt();
			while (gallons == 0) {
				System.out.print("You can't have consumed no gallons. Try again: ");
				gallons = scanner.nextInt();
			}
			System.out.printf("MPG of this trip: %f%n", calculateMilesPerGallon(miles, gallons));
			
			//miles and gallons are reset each loop, but totalMiles and totalGallons are summed
			totalMiles += miles;
			totalGallons += gallons;
		} while (miles != -1);
		scanner.close();
		if (totalGallons != 0)
			System.out.printf("Overall miles per gallon: %f%n", calculateMilesPerGallon(totalMiles, totalGallons));
		else
			System.out.println("You didn't enter any gallons");
	}
	
	/**
	 * 
	 * @param miles - number of miles driven
	 * @param gallons - number of gallons consumed
	 * @return - MPG - miles per gallon of trip
	 */
	public static float calculateMilesPerGallon(int miles, int gallons) {
		float mpg = (float)miles / gallons; //turning miles into a float allows the result to be a float
		return mpg;
	}
}

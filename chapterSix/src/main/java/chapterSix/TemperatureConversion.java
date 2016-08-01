package chapterSix;

import java.util.Scanner;

/**
 * Homework 3, Chapter 6, Exercise 22;
 * 
 * Get either Fahrenheit or Celcius temperature from user, then return
 * that temperature converted to the other degree type.
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */

public class TemperatureConversion {
	
	private static String deg;
	private static double cel;
	private static double fahr;
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Please enter either C for celcius or F for fahrenheit: ");
		deg = scanner.next();
		if (deg.toLowerCase().toCharArray()[0] == 'c') {
			System.out.print("Please enter a degrees celcius: ");
			cel = scanner.nextDouble();
			fahr = convertToFahrenheit(cel);
			System.out.printf("Converted to degrees fahrenheit, it is %f degrees%n", fahr);
		}
		else if (deg.toLowerCase().toCharArray()[0] == 'f') {
			System.out.print("Please enter a degrees fahrenheit: ");
			fahr = scanner.nextDouble();
			cel = convertToCelcius(fahr);
			System.out.printf("Converted to degrees celcius, it is %f degrees%n", cel);
		}
		
		scanner.close();
		
	}

	public static double convertToCelcius (double fa) {
		double ce = (5.0/9.0) * (fa - 32.0);
		return ce;
	}
	
	public static double convertToFahrenheit(double ce) {
		double fa = (9.0/5.0) * ce + 32;
		return fa;
	}
}

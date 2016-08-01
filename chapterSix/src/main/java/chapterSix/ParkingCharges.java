package chapterSix;

import java.util.Scanner;

/**
 * Homework 3, Chapter 6, Exercise 8 - Parking Charges
 * Using a calculateCharges() method, determine how much a customer owes after leaving
 * their car in the garage. Charge is $2 for 3 hours, plus $0.50 for each hour after that.
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */

public class ParkingCharges {
	
	static Scanner scanner;
	static int counter;
	static double hours;
	static double charge;
	static double totalCharge;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		do {
			System.out.print("How many hours was the customer parked?\nIf there are no more customers, enter -1: ");
			hours = scanner.nextDouble();
			if (hours == -1)
				break;
			charge = calculateCharges(hours);
			totalCharge += charge;
			System.out.printf("This customer was charged $%f%n", charge);
		} while ( hours != -1);
		
		scanner.close();
		
		System.out.printf("Altogether, the garage made $%f%n", totalCharge);
	}

	
	private static double calculateCharges(double hours) {
		
		double charge = 0.0;
		if (hours <= 3.0) {
			charge = 2.0;
		}
		else {
			hours -= 3.0;
			charge = 2.0 + 0.5 * Math.ceil(hours);
		}
		return charge;
	}
}

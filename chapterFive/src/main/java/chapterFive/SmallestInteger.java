package chapterFive;

import java.util.Scanner;

/**
 * Homework 2, Chapter 5, Exercise 11
 * Write an application that finds the smallest of several integers.
 * Assume first input is how many numbers user will input.
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */

public class SmallestInteger {
	
	static Scanner scanner;
	private static int times;
	private static int minValue;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.print("How many numbers will you be entering? ");
		times = scanner.nextInt();
		int[] inputs = new int[times];
		
		for (int i = 0; i < times; i ++) {
			System.out.print("Please enter an integer: ");
			inputs[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		minValue = inputs[0];
		for (int i : inputs) {
			if (i < minValue)
				minValue = i;
		}
		
		System.out.printf("The smallest integer you have entered is %d%n", minValue);
		
	}

}

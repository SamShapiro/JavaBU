package chapterTwo;

import java.util.Scanner;

/**
 * Homework 1, Chapter 2: Exercises 2.8, 2.15
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */

@SuppressWarnings("unused")
public class Exercises8_15 {
	
	/**
	 * Display the message: "Enter an integer: ", leaving the cursor on the same line
	 */
	private void exer8_a() {
		System.out.print("Enter an integer: ");
	}
	
	/**
	 * Assign the product of variables b and c to variable a
	 */
	private void exer8_b() {
		int b = 4;
		int c = 3;
		int a = c*b;
	}
	
	/**
	 * Use a comment to state that a program performs a sample payroll calculation
	 */
	private void exer8_c() {
		//This program would perform a sample payroll calculation.
	}
	
/**
 * Write an application that asks the user to input two integers, then outputs their sum,
 * product, difference, and quotient (division)
 */
	private static void exer_15() {
		Scanner scanner = new Scanner(System.in);
		
		int inputOne;
		int inputTwo;
		int sum;
		int product;
		int difference;
		int quotient;
		
		System.out.print("Please enter an integer: ");
		inputOne = scanner.nextInt();
		System.out.print("Please enter a second integer: ");
		inputTwo = scanner.nextInt();
		
		sum = inputOne + inputTwo;
		product = inputOne * inputTwo;
		difference = inputOne - inputTwo;
		quotient = inputOne / inputTwo;
		
		System.out.printf("The sum of your integers is: %d%n", sum);
		System.out.printf("The products of your integers is: %d%n", product);
		System.out.printf("The difference of your integers is: %d%n", difference);
		System.out.printf("The quotient of your integers is: %d%n", quotient);
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		exer_15();
	}

}

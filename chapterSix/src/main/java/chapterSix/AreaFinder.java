package chapterSix;

import java.util.Scanner;

/**
 * Homework 3, Chapter 6, Exercise 20 - Circle Area
 * 
 * Write an application that prompts the user for the radius of a circle and uses
 * a method called circleArea() to calculate the area of the circle. 
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */

public class AreaFinder {

	static Scanner scanner;
	private static double rad;
	private static double area;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Enter a radius: ");
		rad = scanner.nextDouble();
		area = circleArea(rad);
		
		System.out.printf("The area of circle with radius %f is %f%n", rad, area);
		
		scanner.close();
	}
	
	public static double circleArea(double radius) {
		double result = Math.PI * Math.pow(radius, 2);
		return result;
	}
}

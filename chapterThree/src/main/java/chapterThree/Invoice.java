package chapterThree;

import java.util.Scanner;

/**
 * Homework 1, Chapter 3, Exercise 12 - Invoice Class
 * 
 * Invoice Class with 4 Variables: number, description, quantity sold, and price per unit
 * Includes a constructor, and set and get methods for each variable
 * Includes getInvoiceAmount method to return total amount paid
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */

public class Invoice {
	
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	
	/**
	 * @param partNumber - number code of part sold
	 * @param partDescription - description of part sold
	 * @param quantity - amount sold
	 * @param price - price per unit sold
	 */
	public Invoice(String partNumber, String partDescription, int quantity,
			double price) {
		setPartNumber(partNumber);
		setPartDescription(partDescription);
		setQuantity(quantity);
		setPrice(price);
		
	}

	/**
	 * main method gets input from user, prints it out, and runs getInvoiceAmount()
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please input a part number: ");
		String numb = scanner.next();
		
		System.out.print("Please input a one-word part description: ");
		String desc = scanner.next();
		
		System.out.print("Please input the amount sold: ");
		int amount = scanner.nextInt();
		
		System.out.print("Please input the price per unit: ");
		double pri = scanner.nextDouble();
		
		scanner.close();
		
		Invoice invoice = new Invoice(numb, desc, amount, pri); //creates instance of class with input variables
		
		//Prints out information based on inputs
		System.out.printf("Your part number is %s. Description: %s. You sold %d units,"
				+ "for $%f each. You made $%f%n.", invoice.getPartNumber(), invoice.getPartDescription(),
				invoice.getQuantity(), invoice.getPrice(), invoice.getInvoiceAmount());
	}


	/**
	 * @return the partNumber
	 */
	public String getPartNumber() {
		return this.partNumber;
	}
	/**
	 * @param partNumber the partNumber to set
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}


	/**
	 * @return the partDescription
	 */
	public String getPartDescription() {
		return this.partDescription;
	}
	/**
	 * @param partDescription the partDescription to set
	 */
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return this.quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		if (quantity < 0) {
			System.out.println("You have entered a negative quantity. Quantity set to 0");
			quantity = 0;
		}
		this.quantity = quantity;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return this.price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if (price < 0) {
			System.out.println("You have entered a price below zero. Price set to 0.00");
			price = 0.00;
		}
		this.price = price;
	}
	
	
	public double getInvoiceAmount() {
		double sold = getQuantity() * getPrice();
		return sold;
	}

}

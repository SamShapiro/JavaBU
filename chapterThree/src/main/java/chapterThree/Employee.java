package chapterThree;

import java.util.Scanner;

/**
 * Homework 1, Chapter 3, Exercise 13 - Employee Class
 * 
 * Employee class with 3 variables: first name, last name, and monthly salary.
 * Includes giveRaise(percent) class to increase salary
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */
public class Employee {

	private String firstName;
	private String lastName;
	private double salary;
	
	/**
	 * @param firstName - Employee's first name
	 * @param lastName - Employee's last name
	 * @param salary Employee's monthly salary
	 */
	public Employee(String firstName, String lastName, double salary) {
		setFirstName(firstName);
		setLastName(lastName);
		setSalary(salary);
	}



	/**
	 * 
	 * Creates 2 employees with user input, then gives them each a 10% raise
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter our first employee's first name: ");
		String fname1 = scanner.next();
		
		System.out.print("Now enter their last name: ");
		String lname1 = scanner.next();
		
		System.out.print("What is this employee's monthly salary?: ");
		double sal1 = scanner.nextDouble();
		
		System.out.print("Enter our second employee's first name: ");
		String fname2 = scanner.next();
		System.out.print("Now enter their last name: ");
		String lname2 = scanner.next();
		System.out.print("What is this employee's monthly salary?: ");
		double sal2 = scanner.nextDouble();
		
		scanner.close();
		
		Employee emp1 = new Employee(fname1, lname1, sal1);
		Employee emp2 = new Employee(fname2, lname2, sal2);
		
		System.out.printf("Great! We now have two employees, %s %s and %s %s. %s makes"
				+ " $%f%n a month, and %s makes $%f a month.", emp1.getFirstName(), emp1.getLastName(),
				emp2.getFirstName(), emp2.getLastName(), emp1.getFirstName(), emp1.getSalary(), 
				emp2.getFirstName(), emp2.getSalary());
		emp1.giveRaise(10);
		emp2.giveRaise(10);
		System.out.printf("They're both great employees, so let's%n give them a 10%% raise.%n Now "
				+ "%s makes %f, and %s makes %f.%n", emp1.getFirstName(), emp1.getSalary(),
				emp2.getFirstName(), emp2.getSalary());
	}
	
	

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 * doesn't set if salary is negative
	 */
	public void setSalary(double salary) {
		if (salary >= 0) {
			this.salary = salary;
		}
	}
	
	/**
	 * @param percent - percent increase in salary
	 * method to increase salary
	 */
	public void giveRaise(double percent) {
		//sets salary equal to itself plus given percent of itself
		setSalary(getSalary() + getSalary() * (percent/100.0)); 
	}

}

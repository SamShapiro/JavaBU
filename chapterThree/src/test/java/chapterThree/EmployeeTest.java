package chapterThree;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test for Employee Class
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */
public class EmployeeTest {

	Employee employee; //instantiates employee class object
	
	
	/**
	 * Tests that variables are input properly
	 */
	@Test
	public void testInputs() {
		employee = new Employee("Sam", "Shapiro", 2000.0);
		assertTrue(employee.getFirstName().equals("Sam")
				&& employee.getLastName().equals("Shapiro")
				&& employee.getSalary() == 2000.0);
	}
	
	/**
	 * Tests the giveRaise(percent) method
	 */
	@Test
	public void testRaise() {
		employee = new Employee("Sam", "Shapiro", 2000.0);
		employee.giveRaise(10.0);
		assertTrue(employee.getSalary() == 2200.0);
	}
	
	/**
	 * Tests to ensure salary isn't set if input is 0.0.
	 */
	@Test
	public void testNegativeSalary() {
		employee = new Employee("Sam", "Shapiro", -500.0);
		assertTrue(employee.getSalary() == 0.0);
	}

}

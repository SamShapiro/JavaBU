package chapterThree;

/**
 * Test for Invoice Class
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class InvoiceTest {
	
	Invoice invoice; //sets up invoice instant for testing


	
	/**
	 * Tests to make sure Invoice class assigns variables properly
	 */
	@Test
	public void testInputs () {
		invoice = new Invoice("0010", "test", 5, 10.50);
		assertTrue(invoice.getPartNumber().equals("0010")
				&& invoice.getPartDescription().equals("test")
				&& invoice.getQuantity() == 5
				&& invoice.getPrice() == 10.50
				&& invoice.getInvoiceAmount() == 52.50);
	}
	
	/**
	 * Tests to make sure quantity is set to 0 if input is negative
	 */
	@Test
	public void testNegativeQuantity() {
		invoice = new Invoice("0010", "test", -5, 10.50);
		assertTrue(invoice.getQuantity() == 0
				&& invoice.getInvoiceAmount() == 0.0);
	}
	
	/**
	 * Tests to make sure price is set to 0.0 if input is negative
	 */
	@Test
	public void testNegativePrice() {
		invoice = new Invoice("0010", "test", 5, -7.25);
		assertTrue(invoice.getPrice() == 0.0
				&& invoice.getInvoiceAmount() == 0.0);
	}

}

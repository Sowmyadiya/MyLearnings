package learning.learning;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestCustomer 
    extends TestCase
{
    
	public static void main(String[] args) {
		// Create Address object
		Address a1=new Address(112, "MG Road", "Bangalore", 560121);
		
		// Create Customer object
		Customer c1=new Customer("Guru", a1);
		
		// How to display the data/info?
		System.out.println(c1);
		// This will display the heap mem address

	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {


	@Test
	// Test to see if setting data for Contact Object Works
	void contactClassTest() {
		Contact contactClass = new Contact("37","Jeremy","Reaban","3142212155","9055 Ridge Road");
		assertTrue(contactClass.getID().equals("37"));
		assertTrue(contactClass.getFirstName().equals("Jeremy"));
		assertTrue(contactClass.getLastName().equals("Reaban"));
		assertTrue(contactClass.getPhoneNumber().equals("3142212155"));
		assertTrue(contactClass.getAddress().equals("9055 Ridge Road"));
		
	}
	@Test
	// Test to see if test for length works with normal stuff
	void contactLengthTest() {
		Contact contactClass = new Contact("37","Jeremy","Reaban","3142212155","9055 Ridge Road");
		assertTrue(contactClass.getID().length() <= 10);
		assertTrue(contactClass.getFirstName().length() <= 10);
		assertTrue(contactClass.getLastName().length() <= 10);
		assertTrue(contactClass.getPhoneNumber().length() == 10);
		assertTrue(contactClass.getAddress().length() <= 30);
		
	}
	@Test
	// Test to see if contact object handles lengths with bad input (greater than specified length 
	void contactLengthTest2() {
		Contact contactClass = new Contact("","Jeereeeemeey","Reeeeeeeabaan","31422121553","900000000000000000000000000055 Ridge Road");
		assertTrue(contactClass.getFirstName().length() <= 10);
		assertTrue(contactClass.getLastName().length() <= 10);
		assertTrue(contactClass.getPhoneNumber().length() == 10);
		assertTrue(contactClass.getAddress().length() <= 30);
		
	}
	@Test
	// Test to see if contact object handles lengths with null input
	void contactNullTest() {
		Contact contactClass = new Contact("","","","","");
		assertTrue(contactClass.getID().length() != 0);
		assertTrue(contactClass.getFirstName().length() != 0);
		assertTrue(contactClass.getLastName().length() != 0);
		assertTrue(contactClass.getPhoneNumber().length() != 0);
		assertTrue(contactClass.getAddress().length() != 0);
		
		
	}
	
	
}

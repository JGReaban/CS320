import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	//est to see if multiple conacts can be created and added to arraylist
	void contactCreationTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		Contact addedContact = new Contact("1", "Fred", "Flintstone", "7323883400", "222 Rocky Way Bedrock CO 12314");
		Contact addedContact2 = new Contact("2", "Homer", "Simpson", "3145556258", "762 Evergreen Terrance, Springfield OR");
		contactList.add(addedContact);
		contactList.add(addedContact2);
		assertTrue(contactList.size() == 2);
	}
	@Test
	//test to see if contact first name can be edited
	void contactEditFirstNameTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		Contact addedContact = new Contact("1", "Fred", "Flintstone", "7323883400", "222 Rocky Way Bedrock CO 12314");
		contactList.add(addedContact);
		contactList.get(0).setFirstName("Wilma");
		assertTrue(contactList.get(0).getFirstName() == "Wilma");
	}
	@Test
	//test to see if contact last name can be edited
	void contactEditLastNameTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		Contact addedContact = new Contact("1", "Fred", "Flintstone", "7323883400", "222 Rocky Way Bedrock CO 12314");
		contactList.add(addedContact);
		contactList.get(0).setLastName("Rubble");
		assertTrue(contactList.get(0).getLastName() == "Rubble");
	}
	@Test
	//test to see if contact phone can be edited
	void contactEditPhoneNumberTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		Contact addedContact = new Contact("1", "Fred", "Flintstone", "7323883400", "222 Rocky Way Bedrock CO 12314");
		contactList.add(addedContact);
		contactList.get(0).setPhoneNumber("5551234567");
		assertTrue(contactList.get(0).getPhoneNumber() == "5551234567");
	}
	@Test
	//test to see if contact address can be edited
	void contactEditAddressTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		Contact addedContact = new Contact("1", "Fred", "Flintstone", "7323883400", "222 Rocky Way Bedrock CO 12314");
		contactList.add(addedContact);
		contactList.get(0).setAddress("742 Evergreen Terrace");
		assertTrue(contactList.get(0).getAddress() == "742 Evergreen Terrace");
	}

}

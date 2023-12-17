import java.util.ArrayList;
import java.util.Scanner;

// CS-320 Week Three Project
// Jeremy Reaban
// November 11th, 2023



public class ContactService {
	private static ArrayList<Contact> contactList = new ArrayList<Contact>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get Menu Input
		char menuInput = ' ';
    	Scanner scnr = new Scanner(System.in);

		displayMenu();
		
		// add sample contacts
		// I realize this defeats the purpose of Junit tests, but easier when writing original code
		// to make sure it works
		
		// currently commented out 
		//addSampleContacts();
		
		
		 while (menuInput != 'q') {
	        	displayMenu();
	        	menuInput = scnr.next().charAt(0);
	        	// System.out.print(menuInput);
	        	switch (menuInput) {
	        	case '1':   // Add New Contact
	        		addNewContact(scnr);
	        		break;
	        	case '2':  // Display List of Contacts
	        		displayContacts(scnr);
	        		break;
	        	case '3':  // Delete Contact
	        		deleteContact(scnr);
	        		break;    	
	        	case '4': // Edit Contact
	        		editContact(scnr);
	        		break;
	        	case 'q': // Quit
	        		System.out.print("Exiting Program");
	        		break;
	        	default: // If no correct option is selected
	        		System.out.print("Invalid Option");
	        		
	        	}
	        }
		
	}



//
// Edit Existing contact
//

private static void editContact(Scanner scanner) {
		// TODO Auto-generated method stub
	String inputText = "";
	
    System.out.println("What is the contact to edit's ID?");
    String name = scanner.nextLine();
    name = scanner.nextLine();
    for(Contact contact: contactList) {
        if(contact.getID().equalsIgnoreCase(name)) {
           
            System.out.println("What is ID " + contact.getID() + "'s new first name? (Return to leave unchanged)");
            inputText = scanner.nextLine();
            if (inputText != "") {
            contact.setFirstName(inputText);
            System.out.println("\n ID " + contact.getID() + "'s first name changed");           
            }
            System.out.println("What is ID " + contact.getID() + "'s new last name? (Return to leave unchanged)");
            inputText = scanner.nextLine();
            if (inputText != "") {
            contact.setLastName(inputText);
            System.out.println("\n ID " + contact.getID() + "'s last name changed");           
            }
            System.out.println("What is ID " + contact.getID() + "'s new phonenumber? (Return to leave unchanged)");
            inputText = scanner.nextLine();
            if (inputText != "") {
            	// set phone number temporarily to nothing
            	 contact.setPhoneNumber("");
            	 while (contact.getPhoneNumber().length() != 10) {
                	 System.out.println("What is " + name + "'s phone number? Must be 10 characters!");	
                	 inputText = scanner.nextLine();
                	 contact.setPhoneNumber(inputText);
                	}
            	
            	
           
            System.out.println("\n ID " + contact.getID() + "'s phone number changed");           
            }
            System.out.println("What is ID " + contact.getID() + "'s address? (Return to leave unchanged)");
            inputText = scanner.nextLine();
            if (inputText != "") {
            contact.setAddress(inputText);
            System.out.println("\n ID " + contact.getID() + "'s address changed");           
            }
            
            return; //returns to menu
        }
        else {
        	 System.out.println("\n\nThis contact not in our system\n\n");
        	
        }
    }
		
	}




//
// Add sample contacts
// Used during development
//
private static void addSampleContacts() {
		// TODO Auto-generated method stub
	// Add sample or existing contacts just to make it easier to test functionality
	Contact addedContact = new Contact("1", "Fred", "Flintstone", "7323883400", "222 Rocky Way Bedrock CO 12314");
	Contact addedContact2 = new Contact("2", "Homer", "Simpson", "3145556258", "762 Evergreen Terrance, Springfield OR");
	contactList.add(addedContact);
	contactList.add(addedContact2);
	}



//
//  Delete specified contact
//
public static void deleteContact(Scanner scanner) {
		// TODO Auto-generated method stub
	String inputText = "";
	
    System.out.println("What is the contact to delete's ID?");
    String name = scanner.nextLine();
    name = scanner.nextLine();
    for(Contact contact: contactList) {
        if(contact.getID().equalsIgnoreCase(name)) {
           
            contactList.remove(contact);
            System.out.println("\n\nThis contact has been removed from our system\n\n");
            return; //returns to menu
        }
        else {
        	 System.out.println("\n\nThis contact not in our system\n\n");
        	
        }
    }
		
	}




// This method prints out the rost of contacts
// Needs to be formatted better
//
private static void displayContacts(Scanner scnr) {
		// TODO Auto-generated method stub
	
	System.out.printf("Contact ID          First Name          Last Name       Phone Number        Address \n");
	System.out.printf("------------------------------------------------------------------------------------------------\n");
	
	for (int i = 0; i < contactList.size(); i++) {
		System.out.printf("%-20.20s %-20.20s %-20.20s %-20.20s  %-20.30s \n", contactList.get(i).getID(), contactList.get(i).getFirstName(),
				contactList.get(i).getLastName(),contactList.get(i).getPhoneNumber(),contactList.get(i).getAddress());
		
	}
	
	}





// This method prints the menu options
public static void displayMenu() {
    System.out.println("\n\n");
    System.out.println("\t\t\t\t Contact System Menu");
    System.out.println("[1] Add New Contact");
    System.out.println("[2] Display List of Contacts");
    System.out.println("[3] Delete Contact");
    System.out.println("[4] Edit Contact");
    System.out.println("[q] Quit application");
    System.out.println();
    System.out.println("Enter a menu selection\n");
}

// Add New Contact 
public static void addNewContact(Scanner scanner) {
	String inputText = "";
	
    System.out.println("What is the contact's ID?");
    String name = scanner.nextLine();
    name = scanner.nextLine();
    for(Contact contact: contactList) {
        if(contact.getID().equalsIgnoreCase(name)) {
        	System.out.println("\n\nThis contact is already in our system\n\n");
            return; //returns to menu
        }
    }

  

	// Create new Contact object with temporary values which will later be changed
	Contact addedContact = new Contact("", "", "", "", "");
	// set name
	addedContact.setID(name);
	// get and set contact First Name
	System.out.println("What is " + name+ "'s first name?");
    inputText = scanner.nextLine();
    addedContact.setFirstName(inputText);
    // get input and set contact last name
    System.out.println("What is " + name + "'s last name?");
    inputText = scanner.nextLine();
    addedContact.setLastName(inputText);
    // get input and set phone number
    //System.out.println("What is " + name + "'s phone number? Must be 10 characters!");
    while (addedContact.getPhoneNumber().length() != 10) {
    	 System.out.println("What is " + name + "'s phone number? Must be 10 characters!");	
    	 inputText = scanner.nextLine();
    	 addedContact.setPhoneNumber(inputText);
    	}
    // get input and set address
    System.out.println("What is " + name + "'s address?");
    inputText = scanner.nextLine();
    addedContact.setAddress(inputText);
   
    // add new Contact to Contact list 
    contactList.add(addedContact);
   
	
}


}
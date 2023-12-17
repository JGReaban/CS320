
import java.lang.String;

public class Contact {
	/**
	 * @param iD
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param address
	 */
	// Constructor
	public Contact(String iD, String firstName, String lastName, String phoneNumber, String address) {
		super();
		this.setID(iD);
		this.setFirstName(firstName); 
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
		this.setAddress(address);
	}
	private String ID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		// Make sure id isn't null
		if (iD == "") {
			iD = "0";
		}
		
		ID = iD;
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
		// Make sure first name isn't null or longer than 10 characters

		if (firstName == "") {
			firstName = " ";
		}
		
		if (firstName.length() >= 10) {
			firstName = firstName.substring(0, 10);
		}
		
		
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
		// Make sure last name is not null or longer than 10 characters
		if (lastName == "") {
			lastName = " ";
		}
		
		if (lastName.length() >= 10) {
			lastName = lastName.substring(0, 10);
		}
		
		this.lastName = lastName;
	}
	/**
	 * @return the phone
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		// Make Sure Phone Number isn't null
		if (phoneNumber == "") {
			phoneNumber = " ";
		}
		// If phone number isn't long enough, report it as NoPhoneNum
		if (phoneNumber.length() < 10) {
			phoneNumber = "NoPhoneNum";
		}
		
		// If longer than 10, truncate it, which might be a mistake
		// Might make more sense to set it as "WrongPhone"
		if (phoneNumber.length() >= 10) {
			phoneNumber = phoneNumber.substring(0, 10);
		}
		
		
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		// Make Sure Address isn't null
		if (address == "") {
			address = "No Address";
		}
		// Truncate Address if over 30 characters
		if (address.length() >= 30) {
			address = address.substring(0, 30);
		}
		
		
		
		this.address = address;
	}

}

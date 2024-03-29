
public class Contact {
	private String name;
	private String phoneNumber;
	
	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public static Contact createContacts(String name, String phoneNumber) {
		return new Contact(name, phoneNumber);
	}
}

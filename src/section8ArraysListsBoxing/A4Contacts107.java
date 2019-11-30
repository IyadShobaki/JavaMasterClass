package section8ArraysListsBoxing;


public class A4Contacts107 {
	private String name;
	private String phoneNumber;
	
	public A4Contacts107(String name, String phoneNumber) {
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
	
	public static A4Contacts107 createContact(String name, String phoneNumber) {
		return new A4Contacts107(name, phoneNumber);
	}
	
}

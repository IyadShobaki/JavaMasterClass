import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	
	
	public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
		super();
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<>();
	}



//	public boolean addNewContact(Contact contact) {
//		if(findContact(contact.getName()) >= 0) {
//			System.out.println("Contact is already on file");
//			return false;
//		}
//		
//		myContacts.add(contact);
//		return true;
//	}
	
}
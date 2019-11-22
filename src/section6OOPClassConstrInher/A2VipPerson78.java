package section6OOPClassConstrInher;

public class A2VipPerson78 {
	private String name;
	private double creidtLimit;
	private String emailAddress;
	
	public A2VipPerson78() {
		this("Default name", 50000.00, "default@email.com");
	}
	public A2VipPerson78(String name , double creidtLimit) {
		this(name, creidtLimit, "default@email.com");
	}
	public A2VipPerson78(String name, double creidtLimit, String emailAddress) {
		this.name = name;
		this.creidtLimit = creidtLimit;
		this.emailAddress = emailAddress;
	}
	
	public String getName() {
		return name;
	}
	public double getCreidtLimit() {
		return creidtLimit;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	
}

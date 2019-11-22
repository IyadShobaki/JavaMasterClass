package section6OOPClassConstrInher;

public class A2BankAccountClass78 {
	private String accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phone;
	
	public A2BankAccountClass78() {
		this("56789", 2.50,"Default name", "Default email", "Default phone");
		System.out.println("Empty constructor called");
	}
	public A2BankAccountClass78(String accountNumber,
								double balance,
								String name,
								String email,
								String phone) {
		System.out.println("Account constructor with parameters called");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phone = phone;
		
	}
	
	
	public A2BankAccountClass78(String name, String email, String phone) {
		this("99999",100.55, name, email, phone);
		
//		super();
//		this.name = name;
//		this.email = email;
//		this.phone = phone;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Deposit of " + amount + " made. New balance is " + balance);
//		if(amount > 0)
//			this.balance += amount;
//		else {
//			System.out.println("Invalid amount");
//		}
	}
	public void withdrawl(double amount) {
		if(this.balance - amount < 0) {
			System.out.println("Only " + balance + " available withdrawl not processed");
		}else {
			balance -= amount;
			System.out.println("Withdrawl of " + amount + " processed. Remaining balance is " + balance);
		}
//		if(amount > 0 || amount >= balance)
//			balance -= amount;
//		else {
//			System.out.println("Invalid amount or balance not enough!");
//		}
	}
	
}

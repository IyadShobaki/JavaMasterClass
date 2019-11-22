package section6OOPClassConstrInher;

public class A2BankAccountTester78 {

	public static void main(String[] args) {
		A2BankAccountClass78 bobsAccount = new A2BankAccountClass78("12345",
																	0.00,
																	"Bob Bob",
																	"bEmail@bob.com",
																	"(087) - 123 - 4567");
		bobsAccount.withdrawl(100.0);
		
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawl(100.0);
		
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawl(100.0);
		
		A2BankAccountClass78 timAccount = new A2BankAccountClass78("Tim", "tim@email.com", "12345");
		System.out.println(timAccount.getAccountNumber() + " name " + timAccount.getName());
		
		
		A2VipPerson78 person1 = new A2VipPerson78();
		System.out.println(person1.getName());
		
		A2VipPerson78 person2 = new A2VipPerson78("Bob", 25000.00);
		System.out.println(person2.getName());
		
		A2VipPerson78 person3 = new A2VipPerson78("Tim", 100.00, "tim@email.com");
		System.out.println(person3.getName());
		System.out.println(person3.getEmailAddress());
		
	}

}

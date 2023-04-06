
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the details of Account1");
		System.out.println("Enter Name:");
		String name1 = br.readLine();
		System.out.println("Enter Email:");
		String email1 = br.readLine();
		System.out.println("Enter mobile number:");
		String mobileNum1 = br.readLine();
		System.out.println("Enter Address:");
		String address1 = br.readLine();
		System.out.println("Enter Password:");
		String password1 = br.readLine();
		System.out.println("Enter Customer Id:");
		String customerId1 = br.readLine();
		System.out.println("Enter Account Id:");
		int accountId1 = Integer.parseInt(br.readLine());
		System.out.println("Enter the Account Number:");
		String accountNum1 = br.readLine();
		System.out.println("Enter Account Type:");
		String accountType1 = br.readLine();

		// Creating objects for Account 1
		User user1 = new User(name1, email1, password1, email1, mobileNum1, address1);

		Customer customer1 = new Customer(customerId1, user1);

		AccountType accountTypeObj1 = new AccountType(accountType1);

		Account account1 = new Account(accountId1, accountNum1, accountTypeObj1, customer1);

		System.out.println("Enter the details of Account2");
		System.out.println("Enter Name:");
		String name2 = br.readLine();
		System.out.println("Enter Email:");
		String email2 = br.readLine();
		System.out.println("Enter mobile number:");
		String mobileNum2 = br.readLine();
		System.out.println("Enter Address:");
		String address2 = br.readLine();
		System.out.println("Enter Password:");
		String password2 = br.readLine();
		System.out.println("Enter Customer Id:");
		String customerId2 = br.readLine();
		System.out.println("Enter Account Id:");
		int accountId2 = Integer.parseInt(br.readLine());
		System.out.println("Enter the Account Number:");
		String accountNum2 = br.readLine();
		System.out.println("Enter Account Type:");
		String accountType2 = br.readLine();

		// Creating objects for Account 2
		User user2 = new User(name2, email2, password2, email2, mobileNum2, address2);

		Customer customer2 = new Customer(customerId2, user2);

		AccountType accountTypeObj2 = new AccountType(accountType2);

		Account account2 = new Account(accountId2, accountNum2, accountTypeObj2, customer2);

		System.out.println("Account Details");
		System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n","Customer Id","Customer Name","Customer Username","Customer MobileNumber","Customer Email","Customer Address","Account Number","Account Type");
		System.out.print(customer1.toString());
		System.out.print(account1.toString());
		
		System.out.print(customer2.toString());
		System.out.print(account2.toString());
		
		//Comparing both account by account number using CompareTo method
		if(account1.compareTo(account2)==0) {
			System.out.println("Both Account Numbers are same");
		}else {
			System.out.println("Both Account Numbers are different");
		}
		
	}

}

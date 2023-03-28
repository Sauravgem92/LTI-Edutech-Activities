
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account Detail:");
		String input = sc.nextLine();

		AccountBO accountBO = new AccountBO();

		FixedAccount fixedAccount = accountBO.getAccountDetail(input);

     	System.out.println("Account Details:");

		System.out.format("%-20s %-10s %-20s %-20s %s\n", "Account Number", "Balance", "Account holder name",
				"Minimum balance", "Locking period");

		System.out.format("%-20s %-10s %-20s %-20s %s\n", fixedAccount.getAccountNumber(), fixedAccount.getBalance(),
				fixedAccount.getAccountHolderName(), fixedAccount.getMinimumBalance(), fixedAccount.getLockingPeriod());
	
	    sc.close();
	}

}

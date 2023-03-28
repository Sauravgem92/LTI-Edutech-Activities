

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Account Type\n" + "1.Savings Account\n" + "2.Current Account");

		int type = sc.nextInt();
		sc.nextLine();

		if (type == 1) {

			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			String input = sc.nextLine();

			String arr[] = input.split(",");

			SavingsAccount savingsAccount = new SavingsAccount(arr[0], arr[1], arr[2], arr[3]);

			savingsAccount.display();

		} else if (type == 2) {

			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
			String input = sc.nextLine();

			String arr[] = input.split(",");

			CurrentAccount currentAccount = new CurrentAccount(arr[0], arr[1], arr[2], arr[3]);

			currentAccount.display();

		}
		
		sc.close();
	}

}

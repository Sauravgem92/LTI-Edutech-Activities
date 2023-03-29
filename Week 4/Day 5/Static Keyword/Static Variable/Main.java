

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter the accountType [Current , Savings, Demat]");
		String acctype = sc.nextLine();
		System.out.println("Enter the balance");
		double balance = sc.nextDouble();

		Customer customer = new Customer(name, acctype, balance);

		while (true) {
			System.out.println("\nEnter 1 to deposit an amount 2 to withdraw an amount 3 to exit");
			int action = sc.nextInt();
			if (action == 1) {
				System.out.println("Enter the amount to deposit");
				double amount = sc.nextDouble();

				customer.deposit(amount);

			} else if (action == 2) {
				System.out.println("Enter the amount to withdraw");
				double amount = sc.nextDouble();

				customer.withdrawal(amount);
			} else if (action == 3) {
				System.out.println("Number of Transactions done : " + Customer.getNoOfTransactions());
				break;
			}

		}
       sc.close();
	}

}

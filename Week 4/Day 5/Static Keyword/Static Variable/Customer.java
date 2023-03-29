

public class Customer {
	private String name;
	private String account;
	private double balance;
	private static int noOfTransactions;

	public Customer(String name, String account, double balance) {
		super();
		this.name = name;
		this.account = account;
		this.balance = balance;
	}

	public void deposit(double amount) {
		noOfTransactions++;
		
		this.setBalance(this.getBalance() + amount);
		System.out.printf("Your balance after the transaction is : %.1f", this.getBalance());
	}

	public void withdrawal(double amount) {
		
		if (amount > this.getBalance()) {
			System.out.println("Insufficient Balance");
		} else {
				noOfTransactions++;
			this.setBalance(this.getBalance() - amount);
			System.out.printf("Your balance after the transaction is : %.1f", this.getBalance());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static int getNoOfTransactions() {
		return noOfTransactions;
	}

	public static void setNoOfTransactions(int noOfTransactions) {
		Customer.noOfTransactions = noOfTransactions;
	}

}

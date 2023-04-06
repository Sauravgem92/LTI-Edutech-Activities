
public class Account implements Comparable<Account>{
	private int id;
	private String accountNumber;
	private AccountType accountType;
	private Customer customer;

	
	public Account() {
		super();
	}

	public Account(int id, String accountNumber, AccountType accountType, Customer customer) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public int compareTo(Account a) {
		return this.getAccountNumber().compareTo(a.getAccountNumber());
	}
	
	@Override
	public String toString() {
		return String.format(" %-15s %-15s\n", accountNumber, accountType.getAccountType());
	}


}

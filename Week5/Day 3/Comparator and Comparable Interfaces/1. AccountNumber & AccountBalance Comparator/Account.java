 
public class Account {
	private Integer accountId;
	private Double accountBalance;
	private String accountNumber;
	private String status;
	private String accountType;
	private String customerID;

    public Account() {
		super();
	}
	
	public Account(Integer accountId, Double accountBalance, String accountNumber, String status, String accountType,
			String customerID) {
		super();
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.status = status;
		this.accountType = accountType;
		this.customerID = customerID;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	@Override
	public String toString() {
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", this.accountId, this.accountNumber,
				this.accountBalance, this.accountType, this.status, this.customerID);

		return null;
	}

}

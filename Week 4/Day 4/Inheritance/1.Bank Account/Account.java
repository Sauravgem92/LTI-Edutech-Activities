

public class Account {
	private String accName;
	private String accNo;
	private String bankName;

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	void display() {

		System.out.println("Account Name:" + this.getAccName() + "\nAccount Number:" + this.getAccNo()
				+ "\nBank Name:" + this.getBankName());

	}

}

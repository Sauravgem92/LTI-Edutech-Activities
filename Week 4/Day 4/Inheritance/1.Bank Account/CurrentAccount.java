

public class CurrentAccount extends Account{
	private String tinNumber;
	
	CurrentAccount(String accName,String accNo,String bankName,String tinNumber){
		super.setAccName(accName);
		super.setAccNo(accNo);
		super.setBankName(bankName);
		this.tinNumber=tinNumber;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	
	void display() {
		super.display();
		System.out.println("TIN Number:" + this.getTinNumber());
		
	}
}

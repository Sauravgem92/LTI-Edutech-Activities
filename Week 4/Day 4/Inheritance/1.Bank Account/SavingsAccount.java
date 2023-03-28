

public class SavingsAccount extends Account{
      private String orgName;
      
      SavingsAccount(String accName,String accNo,String bankName,String orgName){
    	  this.setAccName(accName);
    	  this.setAccNo(accNo);
    	  this.setBankName(bankName);
    	  this.setOrgName(orgName);
      }

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	void display() {
		super.display();
		System.out.println("Organisation Name:" + this.getOrgName());
	}
      
      
}

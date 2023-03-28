
public class Customer {
    private String customerName;
    private String customerEmail;
    private String customerType;
    private String customerLocation;
    
    
	public Customer(String customerName, String customerEmail, String customerType, String customerLocation) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerType = customerType;
		this.customerLocation = customerLocation;
	}


	public String getCustomerName() {
		return customerName;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public String getCustomerType() {
		return customerType;
	}


	public String getCustomerLocation() {
		return customerLocation;
	}
    
	void displayDetails() {
		System.out.println("Name: " + this.getCustomerName() +"\nE-mail: " + this.getCustomerEmail() + "\nType: " + this.getCustomerType() + "\nLocation: " + this.getCustomerLocation());	
	}
    

}

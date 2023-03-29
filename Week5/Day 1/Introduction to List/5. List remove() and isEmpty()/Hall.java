
public class Hall {
	private String name,contactNumber;
	private double costPerDay;
	private String ownerName;
	
	
	public Hall(String name, String contactNumber, double costPerDay, String ownerName) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public double getCostPerDay() {
		return costPerDay;
	}


	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
public void display() {
		System.out.printf("%-20s%-20s%-20s%-20s\n", this.getName(), this.getContactNumber(),
				this.getCostPerDay(), this.getOwnerName());
	}
	
	

}

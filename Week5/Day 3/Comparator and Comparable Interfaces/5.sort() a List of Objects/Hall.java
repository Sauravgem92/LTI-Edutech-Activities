
public class Hall implements Comparable<Hall> {
	private String name;
	private String contactNumber;
	private Double costPerDay;
	private String ownerName;

	public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
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

	public Double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s%-15s", name, contactNumber, costPerDay, ownerName);
	}

	@Override
	public int compareTo(Hall hall) {
		return this.getCostPerDay().compareTo(hall.getCostPerDay());
	}

}

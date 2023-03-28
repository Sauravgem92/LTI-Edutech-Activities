

public class Event {
	private String name,detail,type,ownerName;
	private double costPerDay;
	public Event(String name, String detail, String type, String ownerName, double costPerDay) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getDetail() {
		return detail;
	}
	private void setDetail(String detail) {
		this.detail = detail;
	}
	private String getType() {
		return type;
	}
	private void setType(String type) {
		this.type = type;
	}
	private String getOwnerName() {
		return ownerName;
	}
	private void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	private void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
}


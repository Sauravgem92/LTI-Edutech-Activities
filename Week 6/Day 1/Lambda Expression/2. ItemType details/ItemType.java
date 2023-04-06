
public class ItemType {
	private String name;
	private Double costPerDay;
	private Double deposite;

	public ItemType(String name, Double costPerDay, Double deposite) {
		super();
		this.name = name;
		this.costPerDay = costPerDay;
		this.deposite = deposite;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public Double getDeposite() {
		return deposite;
	}

	public void setDeposite(Double deposite) {
		this.deposite = deposite;
	}

}

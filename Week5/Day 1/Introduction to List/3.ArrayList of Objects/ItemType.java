

public class ItemType {
	private String name;
	private double deposit;
	private double costPerDay;

	public ItemType(String name, double deposit, double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString() {
		System.out.printf("%-20s%-20s%-20s", this.getName(), this.getDeposit(), this.getCostPerDay());
		return null;
	}

}

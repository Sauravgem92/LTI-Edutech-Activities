
public class Expenses {
	private String expenseType;
	private double cost;

	public Expenses(String expenseType, double cost) {
		super();
		this.expenseType = expenseType;
		this.cost = cost;
	}

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}

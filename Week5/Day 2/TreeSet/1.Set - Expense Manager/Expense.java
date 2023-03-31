
import java.util.Comparator;

public class Expense implements Comparable<Expense> {
	private String expenseCategory;
	private Integer amount;

	public Expense(String expenseCategory, Integer amount) {
		super();
		this.expenseCategory = expenseCategory;
		this.amount = amount;
	}

	public String getExpenseCategory() {
		return expenseCategory;
	}

	public void setExpenseCategory(String expenseCategory) {
		this.expenseCategory = expenseCategory;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public int compareTo(Expense e) {
		return this.getAmount().compareTo(e.getAmount());
	}

}

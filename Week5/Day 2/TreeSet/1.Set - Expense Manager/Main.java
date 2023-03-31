

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		TreeSet<Expense> expenseSet = new TreeSet<>();
		

		while (true) {
			System.out.println("Enter expense category");
			String category = br.readLine();
			System.out.println("Enter expense amount");
			Integer amount = Integer.parseInt(br.readLine());

			expenseSet.add(new Expense(category, amount));

			System.out.println("Do you want to continue(yes/no):");
			String toContinue = br.readLine();
			if (toContinue.equals("no"))
				break;

		}

		Iterator<Expense> it = expenseSet.descendingIterator();

//		TreeSet<Expense> reverse = (TreeSet<Expense>) expenseSet.descendingSet();

		System.out.println("Top spending categories");
		System.out.println(String.format("%-15s%-15s", "Category", "Amount"));
		int totalAmount = 0;
		while (it.hasNext()) {
			Expense e = it.next();
			totalAmount += e.getAmount();
			System.out.println(String.format("%-15s%-15s", e.getExpenseCategory(), e.getAmount()));
		}
//		for (Expense e : reverse) {
//			System.out.println(String.format("%-15s%-15s", e.getExpenseCategory(), e.getAmount()));
//		}
		System.out.println("Total amount spent: " + totalAmount);
	}

}

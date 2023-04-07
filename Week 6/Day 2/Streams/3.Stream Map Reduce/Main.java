
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Expenses> expenses = new ArrayList<>();

		double food, rent, shopping, groceries, ebBill, salary, total;

		System.out.println("Enter expense for food");

		food = sc.nextDouble();

		expenses.add(new Expenses("food", food));

		System.out.println("Enter expense for rent");

		rent = sc.nextDouble();

		expenses.add(new Expenses("rent", rent));

		System.out.println("Enter expense for shopping");

		shopping = sc.nextDouble();

		expenses.add(new Expenses("shopping", shopping));

		System.out.println("Enter expense for groceries");

		groceries = sc.nextDouble();

		expenses.add(new Expenses("groceries", groceries));

		System.out.println("Enter expense for electricity");

		ebBill = sc.nextDouble();

		expenses.add(new Expenses("ebBill", ebBill));

		System.out.println("Enter salary");

		salary = sc.nextDouble();

		double sumExpense = expenses.stream().map(Expenses::getCost).reduce(0.0, Double::sum);

		if (sumExpense > salary) {

			System.out.println("Expenses exceeds Salary");

		} else {

			System.out.println("Savings amount will be Rs." + (salary - sumExpense));
		}
	}
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<ItemType> itemType = new ArrayList<>();

		int i = 1;
		while (true) {

			System.out.println("Enter the details of Item Type " + i++);
			System.out.println("Name:");
			String name = br.readLine();
			System.out.println("Deposit:");
			double deposit = Double.parseDouble(br.readLine());

			System.out.println("Cost per Day:");
			double cost = Double.parseDouble(br.readLine());

			itemType.add(new ItemType(name, deposit, cost));

			System.out.println("Do you want to continue?(y/n)");
			String toContinue = br.readLine();
			if (toContinue.equals("n")) {
				break;
			}

		}

		System.out.printf("%-20s%-20s%-20s", "Name", "Deposit", "COstPerDay");
		itemType.toString();

	}

}

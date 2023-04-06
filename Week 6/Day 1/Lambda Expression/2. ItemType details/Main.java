
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<ItemType> itemList = new ArrayList<>();

		System.out.println("Enter the number of item types:");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String arr[] = sc.nextLine().split(",");

			itemList.add(new ItemType(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2])));
		}

		System.out.printf("%-10s %-10s %s\n", "Name", "Cost", "Deposit");
		itemList.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(item -> System.out
				.printf("%-10s %-10s %s\n", item.getName(), item.getCostPerDay(), item.getDeposite()));
	
	    sc.close();
	}

}

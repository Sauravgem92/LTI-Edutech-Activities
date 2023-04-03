import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, List<Address>> map = new HashMap<>();

		System.out.println("Enter the number of address");
		int n = sc.nextInt();
		sc.nextLine();

		Address obj = new Address();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the address " + i + " detail");
			String arr[] = sc.nextLine().split(",");

			obj.generateCityAddressMap(map, new Address(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4])));
		}

		System.out.println("Enter the city to be searched");
		String city = sc.nextLine();

		List<Address> result = obj.searchCity(map, city);

		if (result.size() == 0) {
			System.out.println("Searched city not found");
		} else {
			System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Line 1", "Line 2", "City", "State", "Pincode");
			for (Address a : result) {
				System.out.printf("%-15s %-15s %-15s %-15s %s\n", a.getAddressLine1(), a.getAddressLine2(), a.getCity(),
						a.getState(), a.getPincode());
			}

		}
	}

}

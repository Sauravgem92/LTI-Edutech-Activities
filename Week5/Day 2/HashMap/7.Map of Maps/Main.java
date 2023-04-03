
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		Map<String, Map<String, Integer>> Statemap = new TreeMap<>();

		System.out.println("Enter the number of address:");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the address:");
			String arr[] = sc.nextLine().split(",");

			//arr[0]=area, arr[1]=city, arr[2]=state, arr[3]= pincode

			if (Statemap.containsKey(arr[2])) {
				if (Statemap.get(arr[2]).containsKey(arr[1])) {
					System.out.println((Statemap.get(arr[2]).get(arr[1])));
					int value = (Statemap.get(arr[2]).get(arr[1]));
					value++;
					Statemap.get(arr[2]).put(arr[1], value);
				} else {
					Statemap.get(arr[2]).put(arr[1], 1);
				}
			} else {
				Map<String, Integer> cityMap = new TreeMap<>();
				cityMap.put(arr[1], 1);
				Statemap.put(arr[2], cityMap);
			}
		}

		System.out.println("Number of entries in city/state wise:");
		for (Map.Entry<String, Map<String, Integer>> state : Statemap.entrySet()) {
			System.out.println("State:" + state.getKey());

			for (Map.Entry<String, Integer> city : state.getValue().entrySet()) {
				System.out.println("City:" + city.getKey() + " Count:" + city.getValue());
			}
		}
	}
}

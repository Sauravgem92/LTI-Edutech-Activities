
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Hall> hallList = new ArrayList<>();

		System.out.println("Enter the number of halls:");
		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the details of hall " + i);
			String arr[] = br.readLine().split(",");

			Hall hall = new Hall(arr[0], arr[1], Double.parseDouble(arr[2]), arr[3]);

			hallList.add(hall);
		}

		Collections.sort(hallList);
		
		System.out.println("Sorted Order (from the least expensive to the most):");
		System.out.printf("%-15s%-15s%-15s%-15s", "Name", "Contact number", "Cost per day", "Owner name");
		hallList.forEach(hall ->System.out.println(hall.toString()));
	}

}

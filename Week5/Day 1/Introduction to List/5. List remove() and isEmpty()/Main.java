

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Hall> halls = new ArrayList<>();
		while (true) {
			System.out.println("Action\r\n" + "1.Add Hall\r\n" + "2.Remove Hall\r\n");
			System.out.println("Enter your choice");
			int action = Integer.parseInt(br.readLine());

			if (action == 1) {
				System.out.println("Enter the Hall details in CSV format");
				String input = br.readLine();
				String arr[] = input.split(",");

				halls.add(new Hall(arr[0], arr[1], Double.parseDouble(arr[2]), arr[3]));

				System.out.println("Do you want to continue?(Y/N)");
				String toContinue = br.readLine();
				if (toContinue.equals("N"))
					break;

			} else if (action == 2) {
				if (halls.isEmpty()) {
					System.out.println("The list is empty");
					break;

				} else {
					System.out.println("Enter the index of the hall to be removed");
					int index = Integer.parseInt(br.readLine());

					halls.remove(index);

					if (halls.isEmpty()) {
						System.out.println("No Hall details to display");
					} else {
						System.out.printf("%-20s%-20s%-20s%-20s\n", "Hall name", "Contact number", "Cost per day",
							"Owner name");
						for (Hall h : halls) {
							h.display();
						}
					}

					System.out.println("Do you want to continue?(Y/N)");
					String toContinue = br.readLine();
					if (toContinue.equals("N"))
						break;

				}
			} else {
				System.out.println("Please enter a valid choice");

				System.out.println("Do you want to continue?(Y/N)");
				String toContinue = br.readLine();
				if (toContinue.equals("N"))
					break;
			}
		}
	}

}

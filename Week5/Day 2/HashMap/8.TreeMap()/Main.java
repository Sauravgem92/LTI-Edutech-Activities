
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TreeMap<Integer, Integer> map = new TreeMap<>();

		System.out.println("Enter the number of events:");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter event details in CSV(Customer Name,Ticket Price,No of Seats Booked)");
		for (int i = 0; i < n; i++) {
			String[] arr = sc.nextLine().split(",");
			int ticketPrice = Integer.parseInt(arr[1]);
			int noOfSeatsBooked = Integer.parseInt(arr[2]);
			// arr[0]=Customer Name, arr[1]=Ticket Price, arr[2]=No of Seats Booked

			if (map.containsKey(ticketPrice)) {
				// If ticket price is already added as key then just increase the no of seats
				int val = map.get(ticketPrice);
				val += noOfSeatsBooked;

				map.put(ticketPrice, val);
			} else {
				map.put(ticketPrice, noOfSeatsBooked);
			}

		}

		System.out.printf("%-15s %s\n", "Ticket Price", "Tickets Booked");
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			System.out.printf("%-15s %s\n", m.getKey(), m.getValue());
		}

	}

}

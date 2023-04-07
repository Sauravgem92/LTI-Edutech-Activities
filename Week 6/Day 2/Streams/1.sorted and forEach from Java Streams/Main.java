
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<TicketBooking> ticketList = new ArrayList<>();

		System.out.println("Enter number of bookings");
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			System.out.println("Enter customer name");
			String name = br.readLine();
			System.out.println("Enter number of tickets");
			int noOfTickets = Integer.parseInt(br.readLine());
			System.out.println("Enter the price");
			double price = Double.parseDouble(br.readLine());

			ticketList.add(new TicketBooking(name, noOfTickets, price));
		}

		System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
		
		//Sorting ticketList by price using sorted and forEach from Java Streams.
		ticketList.stream().sorted((t1, t2) -> t1.getPrice().compareTo(t2.getPrice()))
				.forEach(ticket -> System.out.println(ticket.toString()));

	}
}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of objects:");
		int n = sc.nextInt();
		System.out.println("Enter the Total no of tickets:");
		int totalTickets = sc.nextInt();

		Ticket.setTotalnooftickets(totalTickets);

		for (int i = 0; i < n; i++) {

			System.out.println("Enter the ticketid:");
			int id = sc.nextInt();

			System.out.println("Enter the price:");
			int price = sc.nextInt();

			Ticket ticket = new Ticket(id, price);
			System.out.println("Enter the no of tickets:");
			int toBook = sc.nextInt();

			System.out.println();

			System.out.println("Total no of tickets: " + Ticket.getTotalnooftickets());
			int amt=ticket.Calculatetotalamount(toBook);
			if (amt == -1) {
				System.out.println("Sorry tickets not available.");
			} else {
				System.out.println("\nTotal amount:" + amt);
					System.out.println("Total no of ticket after booking:" + Ticket.getTotalnooftickets());
			}
		}
		sc.close();
	}

}

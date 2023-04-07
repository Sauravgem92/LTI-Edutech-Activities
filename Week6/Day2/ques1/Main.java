import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of bookings");
        int n = scanner.nextInt();

        List<TicketBooking> bookings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter customer name");
            String name = scanner.next();

            System.out.println("Enter number of tickets");
            int tickets = scanner.nextInt();

            System.out.println("Enter the price");
            double price = scanner.nextDouble();

            TicketBooking booking = new TicketBooking(name, tickets, price);
            bookings.add(booking);
        }

        scanner.close();

        Collections.sort(bookings, (b1, b2) -> b1.getPrice().compareTo(b2.getPrice()));

        System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");

        bookings.forEach(System.out::println);
    }
}

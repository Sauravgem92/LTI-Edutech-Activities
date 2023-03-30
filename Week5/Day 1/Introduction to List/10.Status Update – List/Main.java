

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Flight> list = new ArrayList<>();

		while (true) {
			System.out.println("1.Schedule Flight\r\n" + "\r\n" + "2.change status\r\n" + "\r\n" + "3.Display\r\n"
					+ "\r\n" + "4.Exit");

//			System.out.println("Enter your options:");
			int action = Integer.parseInt(br.readLine());

			if (action == 1) {

				int flightDetails = 1;

				while (true) {
					System.out.println("Enter the flights details :" + flightDetails++);

					System.out.println("Enter the flight name:");
					String name = br.readLine();
					System.out.println("Enter the flight number:");
					String num = br.readLine();
					System.out.println("Enter the Status:");
					String status = br.readLine();

					Flight flight = new Flight(name, num, status);

					list.add(flight);

					System.out.println("Do you want to add more flight(Yes/No):");
					String toContinue = br.readLine();
					if (toContinue.equals("No"))
						break;
				}

				System.out.println("Do you want to continue");
				String toContinue = br.readLine();
				if (toContinue.equals("No"))
					break;

			} else if (action == 2) {

				while (true) {
					System.out.println("Enter the flight number:");
					String number = br.readLine();
					System.out.println("Enter the new status:");
					String status = br.readLine();

					Flight updateFlight = null;
					for (Flight flight : list) {
						if (flight.getFlightNumber().equals(number))
							updateFlight = flight;
					}

					updateFlight.setStatus(status);

					System.out.println("Do you want to change status(Yes/No):");
					String toContinue = br.readLine();
					if (toContinue.equals("No"))
						break;
				}

				System.out.println("Do you want to continue");
				String toContinue = br.readLine();
				if (toContinue.equals("No"))
					break;

			} else if (action == 3) {
				System.out.println("Flight Status");
				int index = 1;

				for (Flight flight : list) {
					System.out.println(flight.getFlightNumber() + "\n" + flight.getStatus());
				}

				System.out.println("Do you want to continue");
				String toContinue = br.readLine();
				if (toContinue.equals("No"))
					break;

			} else {
				System.out.println("You are logged-out");
				break;
			}

		}

	}

}

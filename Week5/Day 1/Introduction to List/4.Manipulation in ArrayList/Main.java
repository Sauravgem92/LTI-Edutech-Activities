

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HallBO hallBO = new HallBO();

		while (true) {
			System.out.println("Enter an option:\r\n" + "1.Add\r\n" + "2.Replace\r\n" + "3.Display\r\n" + "4.Exit");

			int option = Integer.parseInt(br.readLine());

			if (option == 1) {
				System.out.println("Enter the name of the hall:");
				String name = br.readLine();
				System.out.println("Enter the contact number of the hall:");
				String contact = br.readLine();
				System.out.println("Enter the cost per day of the hall:");
				double cost = Double.parseDouble(br.readLine());
				System.out.println("Enter the owner name of the hall:");
				String owner = br.readLine();

				hallBO.add(new Hall(name, contact, cost, owner));

			} else if (option == 2) {
				System.out.println("Enter the hall number which should be replaced:");
				int index = Integer.parseInt(br.readLine());

				System.out.println("Enter the name of the replacement hall:");
				String name = br.readLine();
				System.out.println("Enter the contact number of the replacement hall:");
				String contact = br.readLine();
				System.out.println("Enter the cost per day of the replacement hall:");
				double cost = Double.parseDouble(br.readLine());
				System.out.println("Enter the owner name of the replacement hall:");
				String owner = br.readLine();

				hallBO.set(new Hall(name, contact, cost, owner), index);

			} else if (option == 3) {
				hallBO.displayAll(hallBO.getHallList());
			}else {
				System.out.println("Exiting Application");
				break;
			}

		}

	}

}

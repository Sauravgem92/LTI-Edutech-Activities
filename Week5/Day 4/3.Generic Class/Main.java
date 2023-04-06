
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Contact<String, String>> contactList = new ArrayList<>();

		System.out.println("Enter number of details");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter contact details");
		for (int i = 0; i < n; i++) {
			String arr[] = sc.nextLine().split(",");

			Contact<String, String> contact = new Contact<String, String>(arr[0], String.valueOf(arr[1]));
			contactList.add(contact);
		}

		System.out.println("List of contact numbers");
		for (Contact<String, String> c : contactList) {
			c.print();
		}
		sc.close();
	}

}

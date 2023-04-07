import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<User> userList = new ArrayList<>();

		System.out.println("Enter the number of users:");
		int n = sc.nextInt();
		if(n>0) sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the details of User " + i);
			String arr[] = sc.nextLine().split(",");

			userList.add(new User(arr[0], arr[1], arr[2], arr[3]));
		}

		System.out.println("The user details in reverse order:");
		System.out.printf("%-15s%-15s", "Name", "Mobile number");

		// Sorting in reverse order of name using stream and compareTo
//		userList.stream().sorted((u1, u2) -> u2.getName().compareTo(u1.getName()))
//				.forEach(user -> System.out.println(user.toString()));

		Collections.sort(userList);
		Collections.reverse(userList);
		userList.forEach(user -> System.out.println(user.toString()));
	
		sc.close();
	}

}

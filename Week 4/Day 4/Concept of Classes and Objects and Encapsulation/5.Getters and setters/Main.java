import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name:");
		String name = sc.nextLine();
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Country:");
		String country = sc.nextLine();

		Player player = new Player();
		player.setName(name);
		player.setAge(age);
		player.setCountry(country);

		System.out.println("Player Details:\n" + "Name:" + player.getName() + "\nAge:" + player.getAge() + "\nCountry:"
				+ player.getCountry());

	}

}

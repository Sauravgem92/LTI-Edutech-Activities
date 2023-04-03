
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Wicket> map = new HashMap<>();

		while (true) {
			System.out.println("Enter the player name");
			String name = sc.nextLine();
			System.out.println("Enter wickets - seperated by \"|\" symbol ");
			String wicketsTaken = sc.nextLine();

			map.put(name, new Wicket(wicketsTaken, new Bowler(name)));

			System.out.println("Do you want to add another player (yes/no) ");
			if (sc.nextLine().equals("no"))
				break;

		}

		while (true) {
			System.out.println("Enter the player name to search ");
			String nameToSearch = sc.nextLine();

			if (map.containsKey(nameToSearch)) {
				// Get the string of names of wickets taken by the particular player
				String arr[] = map.get(nameToSearch).getPlayerName().split("\\|");

				System.out.println("Player Name : " + nameToSearch);
				System.out.println("Wickets :");
				for (String s : arr) {
					System.out.println(s);
				}

			} else {
				System.out.println("No player found with the name " + nameToSearch);
			}

			System.out.println("Do you want to search another player (yes/no)  ");
			if (sc.nextLine().equals("no"))
				break;

		}
		sc.close();
	}

}

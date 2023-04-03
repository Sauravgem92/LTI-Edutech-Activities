
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TreeMap<String, Player> map = new TreeMap<>();

		System.out.println("Enter the number of players");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the details of the player " + i);
			String capNum = sc.nextLine();
			String name = sc.nextLine();
			String team = sc.nextLine();
			String skill = sc.nextLine();

			Player player = new Player(capNum, name, team, skill);

			map.put(capNum, player);
		}

		System.out.println("Player Details");
		for (Map.Entry<String, Player> m : map.entrySet()) {
			System.out.println(m.getKey() + "--" + m.getValue().getName() + "--" + m.getValue().getTeam() + "--"
					+ m.getValue().getSkill());
		}

		System.out.println("Enter the cap number of the player to be searched");
		String searchCapNum = sc.nextLine();

		
		if (map.containsKey(searchCapNum)) {
			System.out.println("Player Details");
			Player foundPlayer = map.get(searchCapNum);
			System.out.println(foundPlayer.getName() + "--" + foundPlayer.getTeam() + "--" + foundPlayer.getSkill());
		}else {
			System.out.println("Player not found");
		}

	}

}

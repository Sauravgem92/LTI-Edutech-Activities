
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		Map<Integer, Integer> map = new HashMap<>();

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			map.put(sc.nextInt(), sc.nextInt());
		}

		UserMainCode.findPass(map);
	}

}

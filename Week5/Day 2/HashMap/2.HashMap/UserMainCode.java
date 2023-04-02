import java.util.Map;

public class UserMainCode {

	public UserMainCode() {
		super();
	}

	public static void findPass(Map<Integer, Integer> map) {
	
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > 75) {
				System.out.println(m.getKey());
			}
		}

	}

}


import java.util.Map;

public class UserMainCode {

	public UserMainCode() {
		super();
	}

	public static int getSumOfEven(Map<Integer, Integer> map) {
		int sum = 0;
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getKey() % 2 == 0) {
				sum += m.getValue();
			}
		}

		return sum;

	}

}

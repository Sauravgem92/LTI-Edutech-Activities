
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<String, Integer> ageMap = new TreeMap<>();

		System.out.println("Enter the number of passengers");
		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the name of the passenger " + i);
			String name = br.readLine();
			System.out.println("Enter the age of the passenger " + i);
			int age = Integer.parseInt(br.readLine());

			ageMap.put(name, age);
		}

		//convert HashMap into List  
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(ageMap.entrySet());

		//sorting the list elements  
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if (o1.getValue().equals(o2.getValue())) {
					return o2.getKey().compareTo(o1.getKey());
				}

				return o2.getValue().compareTo(o1.getValue());
			}
		});

		Map<String, Integer> ageMapDesc = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> map : list) {
			ageMapDesc.put(map.getKey(), map.getValue());
		}

		System.out.println("Passengers Details by age(High to Low)");
		int i = 1;
		for (Map.Entry<String, Integer> m : ageMapDesc.entrySet()) {
			System.out.println(i++ + " " + m.getKey() + " " + m.getValue());
		}

	}

}

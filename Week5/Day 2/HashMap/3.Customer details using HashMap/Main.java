

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));

		Map<String, ArrayList<CallLog>> map = new TreeMap<>();
	
		String line;
		while ((line = br.readLine()) != null) {
			String arr[] = line.split(",");

			CallLog log = new CallLog(arr[0], arr[1], arr[2], arr[3]);

			if (map.get(arr[0]) == null) {
				ArrayList<CallLog> value = new ArrayList<>();
				value.add(log);

				map.put(arr[0], value);
				
			} else {
				map.get(arr[0]).add(log);
			}
		}

		for (Map.Entry<String, ArrayList<CallLog>> m : map.entrySet()) {
			System.out.println("Calls made by " + m.getKey() + " :");

			for (CallLog log : m.getValue()) {
				System.out.print("Number Called : " + log.getNumberCalled());
				System.out.print("  Call Time: " + log.getStartTime() + "\n");
			}

		}
	}

}

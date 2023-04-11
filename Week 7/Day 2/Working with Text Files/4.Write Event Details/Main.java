import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Event> eventList = new ArrayList<Event>();
		System.out.println("Enter number of events");

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s[] = br.readLine().split(",");
			eventList.add(new Event(s[0], s[1], s[2]));
		}

		EventBO eventBO = new EventBO();
		eventBO.saveToFile(eventList);
	}

}

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class EventBO {
	public void saveToFile(List<Event> eventList) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter("event.txt");

		writer.println("Event details:");
		for (Event e : eventList) {
			writer.println(e.getName() + "," + e.getDetails() + "," + e.getManager());
		}
		writer.close();
	}
}

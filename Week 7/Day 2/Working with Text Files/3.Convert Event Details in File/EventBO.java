
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EventBO {

	public void saveToFile(Event event) throws FileNotFoundException, UnsupportedEncodingException {
		String str = "Event details\n" + "Event name:" + event.getName() + "\nEvent details:" + event.getDetails()
				+ "\nEvent manager:" + event.getManager();

		PrintWriter writer = new PrintWriter("event.txt");
		writer.println(str);
		writer.close();
	}

}

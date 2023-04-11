
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the event name");
		String name = br.readLine();
		System.out.println("Enter the event details");
		String detail = br.readLine();
		System.out.println("Enter the event manager");
		String manager = br.readLine();

		EventBO eventBO = new EventBO();
		eventBO.saveToFile(new Event(name, detail, manager));

	}

}

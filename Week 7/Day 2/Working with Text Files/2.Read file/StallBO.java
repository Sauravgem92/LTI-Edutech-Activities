
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StallBO {

	public Stall readStallFromFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));

		String input[] = br.readLine().split(",");

		return new Stall(input[0], input[1], input[2]);

	}

	public void display(Stall stall) {
		System.out.println(
				"Name: " + stall.getName() + "\nCategory: " + stall.getCategory() + "\nOwner: " + stall.getOwner());
	}

}

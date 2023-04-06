   
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the values for length, width and depth : ");
		Integer length = Integer.parseInt(br.readLine());
		Integer width = Integer.parseInt(br.readLine());
		Integer depth = Integer.parseInt(br.readLine());

		Box<Integer> box = new Box<Integer>(length, width, depth);
		box.print();
	}

}

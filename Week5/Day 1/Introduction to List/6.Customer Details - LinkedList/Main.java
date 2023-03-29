
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));

		LinkedList<Customer> customerList = new LinkedList<>();

		String st;
		while ((st = br.readLine()) != null) {
			String arr[] = st.split(",");

			customerList.add(new Customer(arr[0], arr[1], arr[2]));
		}

		System.out.println("--------------------------------------------------------------------------------------");
		System.out.printf("%-20s %-20s %-20s\n", "Customer Name", "Email", "Phone Number");
		System.out.println("--------------------------------------------------------------------------------------");

		ListIterator<Customer> list_Iter = customerList.listIterator( customerList.size());

		while (list_Iter.hasPrevious()){
			Customer c = list_Iter.previous();
			System.out.printf("%-20s %-20s %-20s\n", c.getName(), c.getEmail(), c.getPhoneNO());
		}
		System.out.println("--------------------------------------------------------------------------------------");

	}

}

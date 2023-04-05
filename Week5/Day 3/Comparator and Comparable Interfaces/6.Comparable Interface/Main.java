
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Address> addressList = new ArrayList<>();

		System.out.println("Enter the number of users:");
		int n = Integer.parseInt(br.readLine());

		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
		for (int i = 0; i < n; i++) {
			String arr[] = br.readLine().split(",");

			Address address = new Address(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]));

			addressList.add(address);
		}

		Collections.sort(addressList);

		System.out.println("User Details:");
		addressList.forEach(address -> System.out.println(address.getUsername() + "," + address.getAddressLine1() + ","
				+ address.getAddressLine2() + "," + address.getPinCode()));
	}

}

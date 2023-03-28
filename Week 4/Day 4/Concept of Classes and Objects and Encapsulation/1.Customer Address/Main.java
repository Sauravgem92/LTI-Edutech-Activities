import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer Address");
		System.out.println("Enter the street");
		String street=sc.nextLine();
		System.out.println("Enter the city");
		String city=sc.nextLine();
		System.out.println("Enter the pincode");
		int pincode=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the country");
		String country=sc.nextLine();
		
		Address address=new Address();
		address.setStreet(street);
		address.setCity(city);
		address.setPincode(pincode);
		address.setCountry(country);
		address.displayAddress();

		sc.close();
	}

}

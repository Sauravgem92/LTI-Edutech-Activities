
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the country name");
		String name=sc.nextLine();
		System.out.println("Enter the country code");
		String countryCode=sc.nextLine();
		System.out.println("Enter the isd code");
		String isdCode=sc.nextLine();
		
		Country country=new Country(name,countryCode,isdCode);
		
		country.display();
		

	}

}

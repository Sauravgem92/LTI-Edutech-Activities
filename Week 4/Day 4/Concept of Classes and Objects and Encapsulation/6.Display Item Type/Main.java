import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the item type name");
		String name=sc.nextLine();
		System.out.println("Enter the cost per day");
		double cost=sc.nextDouble();
		System.out.println("Enter the deposit");
		double deposit=sc.nextDouble();
		
		ItemType itemType=new ItemType();
		
		itemType.setName(name);
		itemType.setCostPerDay(cost);
		itemType.setDeposit(deposit);

		itemType.display();
		
        sc.close();
	}

}

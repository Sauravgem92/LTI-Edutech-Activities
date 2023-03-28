import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Stall Type\r\n" + "1.Silver Stall\r\n" + "2.Gold Stall\r\n" + "3.Platinum Stall");

		int type = sc.nextInt();

		if (type == 1) {
			sc.nextLine();
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost)");

			String input = sc.nextLine();
			String arr[] = input.split(",");

			SilverStall silverStall = new SilverStall(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]));

			System.out.println("Stall Name:" + silverStall.getName() + "\nDetails:" + silverStall.getDetail()
					+ "\nOwner Name:" + silverStall.getOwner() + "\nTotal Cost:" + silverStall.getCost());
		} else if (type == 2) {
			sc.nextLine();
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set)");

			String input = sc.nextLine();
			String arr[] = input.split(",");

			GoldStall goldStall = new GoldStall(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]),
					Integer.parseInt(arr[4]));

			int totalCost = goldStall.getCost() + goldStall.getTvSet() * 100;
			
			System.out.println(
					"Stall Name:" + goldStall.getName() + "\nDetails:" + goldStall.getDetail() + "\nOwner Name:"
							+ goldStall.getOwner() + "\nTV Sets:" + goldStall.getTvSet() + "\nTotal Cost:" + totalCost);
		} else if (type == 3) {
			sc.nextLine();
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");

			String input = sc.nextLine();
			String arr[] = input.split(",");

			PlatinumStall platinumStall = new PlatinumStall(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]),
					Integer.parseInt(arr[4]), Integer.parseInt(arr[5]));

			int totalCost = platinumStall.getCost() + platinumStall.getTvSet() * 100
					+ platinumStall.getProjector() * 500;
			
			System.out.println("Stall Name:" + platinumStall.getName() + "\nDetails:" + platinumStall.getDetail()
					+ "\nOwner Name:" + platinumStall.getOwner() + "\nTV Sets:" + platinumStall.getTvSet()
					+ "\nProjectors:" + platinumStall.getProjector() + "\nTotal Cost:" + totalCost);
		}else {
			
		}

	}

}

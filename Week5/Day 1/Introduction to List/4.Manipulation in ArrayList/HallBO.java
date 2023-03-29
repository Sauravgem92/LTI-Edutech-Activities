import java.util.ArrayList;
import java.util.List;

// import oops.collections.p3.Hall;

public class HallBO {

	public HallBO() {
		super();
	}

	static List<Hall> halls = new ArrayList<>();
	
	static {
	halls.add(new Hall("SPK hall","12345",Double.parseDouble("10000"),"John"));
	halls.add(new Hall("DRG hall","67890",Double.parseDouble("15000"),"Joe"));
	halls.add(new Hall("EFG hall","45678",Double.parseDouble("20000"),"Jack"));
	}

	public void add(Hall hall) {
		halls.add(hall);
		System.out.println("Hall added successfully");
	}

	public void set(Hall hall, int index) {
		halls.set(index-1, hall);
		System.out.println("Hall replaced successfully");
	}

	public List<Hall> getHallList() {
			return halls;
	}

	public void displayAll(List<Hall> hallList) {
		System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Cost per Day", "Owner Name");
		for (Hall hall : hallList) {
			System.out.printf("%-20s%-20s%-20s%-20s\n", hall.getName(), hall.getContactNumber(), hall.getCostPerDay(),
					hall.getOwnerName());
		}
	}

}

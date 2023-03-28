

public class StageEvent extends Event{
	private int noOfSeats;
	
	public StageEvent(int noOfSeats,String name, String detail, String type, String ownerName, double costPerDay) {
		super(name, detail, type, ownerName, costPerDay);
		this.noOfSeats=noOfSeats;
	}

	private int getNoOfSeats() {
		return noOfSeats;
	}

	private void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
}

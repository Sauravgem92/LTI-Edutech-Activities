

public class StageEvent extends Event {
	private int noOfSeats;

	public StageEvent(String name, String detail, String type, String organiserName, int noOfSeats) {
		super(name, detail, type, organiserName);
		this.noOfSeats = noOfSeats;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
}

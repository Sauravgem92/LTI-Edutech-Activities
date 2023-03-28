

public class Exhibition extends Event{
	private int noOfStall;
	
	public Exhibition(int noOfStall,String name, String detail, String type, String ownerName, double costPerDay) {
		super(name, detail, type, ownerName, costPerDay);
		this.noOfStall=noOfStall;
	}

	private int getNoOfStall() {
		return noOfStall;
	}

	private void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}

}

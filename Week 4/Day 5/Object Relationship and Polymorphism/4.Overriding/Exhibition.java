

public class Exhibition extends Event {
	private int noOfStalls;

	public Exhibition(String name, String detail, String ownerName, int noOfStalls) {
		super(name, detail, ownerName);
		this.noOfStalls = noOfStalls;
	}

	@Override
	public Double projectedRevenue() {
		double revenue = this.getNoOfStalls() * 10000;
		return revenue;
	}

	public int getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(int noOfStalls) {
		this.noOfStalls = noOfStalls;
	}

}

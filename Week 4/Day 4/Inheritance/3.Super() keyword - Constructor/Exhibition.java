
public class Exhibition extends Event {
	private int noOfStall;

	public Exhibition(String name, String detail, String type, String organiserName, int noOfStall) {
		super(name, detail, type, organiserName);
		this.noOfStall = noOfStall;
	}

	public int getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}

}

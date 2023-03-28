
public class TicketBooking {
	private String stageEvent, customer;
	private int noOfSeats;

	public TicketBooking() {
		super();

	}

	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		super();
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}

	public void MakePayment(Double amount) {
		System.out.println("Stage event:" + this.getStageEvent() + "\nCustomer: " + this.getCustomer()
				+ "\nNumber of seats:" + this.getNoOfSeats());
		
		System.out.printf("\nAmount %.1f", amount);
		System.out.println(" paid in cash");

	}

	public void MakePayment(String walletNumber, Double amount) {
		System.out.println("Stage event:" + this.getStageEvent() + "\nCustomer: " + this.getCustomer()
				+ "\nNumber of seats:" + this.getNoOfSeats());
		
		System.out.printf("\nAmount %.1f", amount);
		System.out.println(" paid using wallet number " + walletNumber);

	}

	public void MakePayment(String creditCard, String ccv, String name, Double amount) {
		System.out.println("Stage event:" + this.getStageEvent() + "\nCustomer: " + this.getCustomer()
				+ "\nNumber of seats:" + this.getNoOfSeats() + "\nHolder name: " + name );
		
		System.out.printf("\nAmount %.1f", amount);
		System.out.println(" paid using " + creditCard+" card " + "\nCCV:" + ccv);

	}

	public String getStageEvent() {
		return stageEvent;
	}

	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

}

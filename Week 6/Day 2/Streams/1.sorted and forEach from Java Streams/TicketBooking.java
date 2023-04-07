
public class TicketBooking {
	private String customerName;
	private Integer noOfTickets;
	private Double price;

	public TicketBooking(String customerName, Integer noOfTickets, Double price) {
		super();
		this.customerName = customerName;
		this.noOfTickets = noOfTickets;
		this.price = price;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(Integer noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-15s %-15s\n", customerName, noOfTickets,
				price);
	}
	
	

}


public class Ticket {
	private int ticketid;
	private int price;
	private static int totalnooftickets;
	
	
	public Ticket(int ticketid, int price) {
		super();
		this.ticketid = ticketid;
		this.price = price;
	}
	
	public int Calculatetotalamount(int nooftickets) {
		if(nooftickets > Ticket.getTotalnooftickets()) {
			return -1;
		}else {
			totalnooftickets=totalnooftickets-nooftickets;
			
			return this.getPrice()*nooftickets;
		}
		
	}


	public int getTicketid() {
		return ticketid;
	}


	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public static int getTotalnooftickets() {
		return totalnooftickets;
	}


	public static void setTotalnooftickets(int totalnooftickets) {
		Ticket.totalnooftickets = totalnooftickets;
	}
	

}

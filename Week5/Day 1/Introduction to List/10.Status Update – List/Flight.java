

public class Flight {
	private String flightName;
	private String flightNumber;
	private String Status;

	public Flight(String flightName, String flightNumber, String status) {
		super();
		this.flightName = flightName;
		this.flightNumber = flightNumber;
		Status = status;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
   

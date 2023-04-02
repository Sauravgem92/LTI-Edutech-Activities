
public class CallLog {
	private String email, numberCalled;
	private String startTime;
	private String endTime;

	public CallLog(String email, String numberCalled, String arr, String arr2) {
		super();
		this.email = email;
		this.numberCalled = numberCalled;
		this.startTime = arr;
		this.endTime = arr2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumberCalled() {
		return numberCalled;
	}

	public void setNumberCalled(String numberCalled) {
		this.numberCalled = numberCalled;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}

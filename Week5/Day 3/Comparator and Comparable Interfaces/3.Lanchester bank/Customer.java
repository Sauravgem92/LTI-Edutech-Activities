
public class Customer extends User {
	private String customerId;
	private User user;

	public Customer() {
		super();
	}

	public Customer(String name, String username, String password, String email, String mobileNumber, String address) {
		super(name, username, password, email, mobileNumber, address);
	}

	public Customer(String customerId, User user) {
		super();
		this.customerId = customerId;
		this.user = user;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s%-15s%-15s%-15s", customerId, user.getName(),user.getUsername(),user.getMobileNumber(),user.getEmail(),user.getAddress());
	}

}

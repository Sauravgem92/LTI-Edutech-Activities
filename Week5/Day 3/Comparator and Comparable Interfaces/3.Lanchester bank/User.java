
public class User {
	private String name;
	private String username;
	private String password;
	private String email;
	private String mobileNumber;
	private String address;

	public User() {
		super();
	}

	public User(String name, String username, String password, String email, String mobileNumber, String address) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

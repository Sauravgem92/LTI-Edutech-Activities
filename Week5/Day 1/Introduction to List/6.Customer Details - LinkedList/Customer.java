

public class Customer {
	private String name, email, phoneNO;

	public Customer(String name, String email, String phoneNO) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNO = phoneNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNO() {
		return phoneNO;
	}

	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}

}

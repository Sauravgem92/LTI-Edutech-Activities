public class Address {
	public String street, city, country;
	public int pincode;


    public Address() {
		super();
	}

	public Address(String street, String city, int pincode,String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	void displayAddress() {
		System.out.println("Street: " + street + "\nCity: " + city + "\nPincode: " + pincode + "\nCountry: " + country );
	}

}

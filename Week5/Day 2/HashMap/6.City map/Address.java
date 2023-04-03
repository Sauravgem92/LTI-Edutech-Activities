
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Address {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private Integer pincode;

	public Address() {
		super();
	}

	public Address(String addressLine1, String addressLine2, String city, String state, Integer pincode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Map<String, List<Address>> generateCityAddressMap(Map<String, List<Address>> cityAddressMap,
			Address address) {
		if (cityAddressMap.containsKey(address.getCity())) {
			cityAddressMap.get(address.getCity()).add(address);
		} else {
			List<Address> list = new ArrayList<>();
			list.add(address);
			cityAddressMap.put(address.getCity(), list);
		}
		return cityAddressMap;
	}

	public List<Address> searchCity(Map<String, List<Address>> cityAddressMap, String city) {

		List<Address> addresses = new ArrayList<>();
		if (cityAddressMap.containsKey(city)) {
			for (Address ad : cityAddressMap.get(city)) {
				addresses.add(ad);
			}
		}
		return addresses;

	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

}

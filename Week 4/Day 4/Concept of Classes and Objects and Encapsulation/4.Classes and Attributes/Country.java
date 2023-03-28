public class Country {
	private String name,countryCode,isdCode;

	public Country(String name, String countryCode, String isdCode) {
		super();
		this.name = name;
		this.countryCode = countryCode;
		this.isdCode = isdCode;
	}
	
	
	
	public String getName() {
		return name;
	}



	public String getCountryCode() {
		return countryCode;
	}



	public String getIsdCode() {
		return isdCode;
	}



	void display() {
		System.out.println("Country Name : " + this.getName()+ 
				"\nCountry Code : " + this.getCountryCode() +
				"\nISD Code : " + this.getIsdCode());
	}

}

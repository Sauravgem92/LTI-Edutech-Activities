public class User implements Comparable<User>{
	private String username;
	private String bankname;
	
	public User(){
	}

	public User(String username, String bankname) {
		super();
		this.username = username;
		this.bankname = bankname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	//fill the code here
	@Override
	public boolean equals(Object o) {
		if(this == o) {return true;} //here == only checks for the contents of objects is same or not
		
		if(o==null || getClass() != o.getClass()) {return false;} //checking if both object belong to same class or not
		
		User u=(User) o; //downcasting object class object to user
		
		
		return username.equals(u.getUsername());
	}

	@Override
	public int hashCode() { //If two objects are equal according to equals() method, then their hash code must be same.
		return super.hashCode();
	}
	
	@Override
	public int compareTo(User u) {
		return this.getUsername().compareTo(u.getUsername());	 //To sort Users in Alphabetical order of Username.
		}
	
	
}

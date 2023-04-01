
public class Passenger implements Comparable<Passenger> {
	private String name;

	public Passenger(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Passenger p) {
		return this.getName().toLowerCase().compareTo(p.getName().toLowerCase());
	}

}

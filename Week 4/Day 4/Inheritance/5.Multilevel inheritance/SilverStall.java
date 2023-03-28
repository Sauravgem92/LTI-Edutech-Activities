
public class SilverStall {
	private String name,detail,owner;
	private int cost;
	
	
	public SilverStall() {
		super();
	}


	public SilverStall(String name, String detail, String owner, int cost) {
		super();
		this.name = name;
		this.detail = detail;
		this.owner = owner;
		this.cost = cost;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}

}

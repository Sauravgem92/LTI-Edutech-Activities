
public class GoldStall extends SilverStall {
	private int tvSet;
	
	

	public GoldStall() {
		super();
	}

	public GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet) {
		super(name, detail, owner, cost);
		this.tvSet = tvSet;
	}

	public int getTvSet() {
		return tvSet;
	}

	public void setTvSet(int tvSet) {
		this.tvSet = tvSet;
	}

}

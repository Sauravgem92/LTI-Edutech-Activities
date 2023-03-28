

public class PlatinumStall extends GoldStall {
	private int projector;

	public PlatinumStall() {
		super();
	}

	public PlatinumStall(String name, String detail, String owner, Integer cost, Integer tvSet, Integer projector) {
		super(name, detail, owner, cost, tvSet);
		this.projector = projector;
	}

	public int getProjector() {
		return projector;
	}

	public void setProjector(int projector) {
		this.projector = projector;
	}

}

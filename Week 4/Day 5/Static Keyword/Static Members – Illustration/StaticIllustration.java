

public class StaticIllustration {
	private int i1;
	private static int i2;

	public StaticIllustration(int i1, int i2) {
		super();
		this.i1 = i1;
		this.i2 = i2;
	}

	public void displayDetails() {
		System.out.println("i1 = " + this.getI1() + ",i2 = " + this.getI2());
	}

	public int getI1() {
		return i1;
	}

	public void setI1(int i1) {
		this.i1 = i1;
	}

	public static int getI2() {
		return i2;
	}

	public static void setI2(int i2) {
		StaticIllustration.i2 = i2;
	}

}


public class Student {
	private String name;
	private int registerNo;

	public Student() {
		super();
	}

	public Student(String name, int registerNo) {
		super();
		this.name = name;
		this.registerNo = registerNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
	}

	void display(Course obj) {
		System.out.println(this.getName() + " is learning the " + obj.getName() + "course");
	}

}

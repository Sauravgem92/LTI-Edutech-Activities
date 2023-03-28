
public class Department {
	private String departmentName;
	private Staff staff;

	public Department(String departmentName, Staff staff) {
		super();
		this.departmentName = departmentName;
		this.staff = staff;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public void displayStaff() {
		System.out.println(this.getStaff().getStaffName() + " is working in the " + this.getDepartmentName() + "department as "
				+ this.getStaff().getDesignation());
	}

}

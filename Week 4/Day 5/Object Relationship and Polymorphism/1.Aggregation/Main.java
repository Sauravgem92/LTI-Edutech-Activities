

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of the staff:");
		String name = sc.nextLine();
		System.out.println("Enter the staff designation:");
		String designation = sc.nextLine();
		System.out.println("Enter the department name:");
		String department_name = sc.nextLine();

		Staff staff = new Staff(name, designation);

		Department department = new Department(department_name, staff);

		department.displayStaff();
		sc.close();
	}

}

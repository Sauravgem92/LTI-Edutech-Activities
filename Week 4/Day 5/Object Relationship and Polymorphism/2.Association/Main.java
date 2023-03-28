

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the student name:");
		String name = sc.nextLine();
		System.out.println("Enter the register number:");
		int regNum = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the course id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the course name:");
		String courseName = sc.nextLine();

		Course course = new Course(id, courseName);

		Student student = new Student(name, regNum);

		student.display(course);

		sc.close();

	}

}

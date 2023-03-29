

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Object 1 details");
		System.out.println("Enter i1");
		int i11 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter i2");
		int i12 = sc.nextInt();
		sc.nextLine();

		StaticIllustration obj1 = new StaticIllustration(i11, i12);

		System.out.print("Object 1 Details : ");
		obj1.displayDetails();

		System.out.println("Enter Object 2 details");
		System.out.println("Enter i1");
		int i21 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter i2");
		int i22 = sc.nextInt();
		sc.nextLine();

		StaticIllustration obj2 = new StaticIllustration(i21, i22);

		System.out.print("Object 2 Details : ");
		obj2.displayDetails();
		System.out.print("Object 1 Details : ");
		obj1.displayDetails();

	}

}


import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape\n1.Circle\n2.Rectangle\n3.Triangle");

		int n = sc.nextInt();
		
		if (n == 1) {
			sc.nextLine();
			System.out.println("Enter the radius:");
			double radius = sc.nextDouble();

			Shape circle = new Circle(radius);
			circle.computeArea();

			System.out.printf("Area of circle is %.2f", circle.getArea());

		} else if (n == 2) {
			sc.nextLine();
			System.out.println("Enter the length and breadth:");
			double l = sc.nextDouble();
			double b = sc.nextDouble();

			Shape rectangle = new Rectangle(l, b);
			rectangle.computeArea();

			System.out.printf("Area of rectangle is %.2f", rectangle.getArea());

		} else if (n == 3) {
			sc.nextLine();
			System.out.println("Enter the base and height:");
			double b = sc.nextDouble();
			double h = sc.nextDouble();

			Shape triangle = new Triangle(b, h);
			triangle.computeArea();

			System.out.printf("Area of triangle is %.2f", triangle.getArea());
		} else {
			System.out.format("Invalid choice");
		}
	}
}

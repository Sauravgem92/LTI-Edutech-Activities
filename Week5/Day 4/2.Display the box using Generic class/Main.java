import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for length, width and depth : ");
		Integer len = sc.nextInt();
		Integer wid = sc.nextInt();
		Integer dep = sc.nextInt();
		Box<Integer, Integer, Integer> b = new Box<Integer, Integer, Integer>(len, wid, dep);
		b.print();
	}

}


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		List<Employee> employeeList = new ArrayList<>();

		String s;
		while ((s = br.readLine()) != null) {
			String arr[] = s.split(",");

			Employee employee = new Employee(arr[0], Double.parseDouble(arr[1]));
			employeeList.add(employee);
		}

		System.out.println("Name Salary" );
		employeeList.parallelStream().forEachOrdered(emp -> System.out.println(emp.toString()));
	}

}

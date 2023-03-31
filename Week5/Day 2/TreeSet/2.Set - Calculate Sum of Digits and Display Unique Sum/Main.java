

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		TreeSet<Integer> numSet = new TreeSet<>();

		NumberSet numberSet = new NumberSet();

		System.out.println("Enter number of integers:");
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			numberSet.insertElement(temp);
		}

		numSet = (TreeSet<Integer>) numberSet.getNumberSet();

		TreeSet<Integer> digitSumSet = new TreeSet<>();
		for (Integer x : numSet) {
			digitSumSet.add(numberSet.SortedSet(x));
		}

		System.out.println("Unique digit sum");
		digitSumSet.forEach(value -> System.out.println(value));
	}

}

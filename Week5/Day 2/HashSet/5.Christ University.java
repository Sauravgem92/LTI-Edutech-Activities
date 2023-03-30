

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Set<String> collegeSet = new LinkedHashSet<>();
		// LinkedHashSet will keep the order in which you insert the elements

		System.out.println("Enter number of colleges");
		int n = Integer.parseInt(br.readLine());

		System.out.println("Enter the college details one by one");
		for (int i = 0; i < n; i++) {
			collegeSet.add(br.readLine());
		}

		System.out.println("Enter number of colleges to be displayed");
		int toDisplay = Integer.parseInt(br.readLine());

		if (toDisplay > collegeSet.size()) {

			System.out.println("Invalid");

		} else {

			System.out.println("First " + toDisplay + " college details");

			for (String s : collegeSet) {
				if (toDisplay > 0) {
					System.out.println(s);
					toDisplay--;
				}
			}

			System.out.println("Enter the collage code to search :");
			String codeToSearch = br.readLine();

			boolean found = false;
			for (String s : collegeSet) {
				String arr[] = s.split("-");
				if (arr[0].equals(codeToSearch)) {
					found = true;
				}
			}

			if (found) {
				System.out.println("Entered college code is found");
			} else {
				System.out.println("Entered college code is not found");
			}

		}

	}

}

Sample Input and Output 1:
Enter number of colleges
2
Enter the college details one by one
11056-KCT-IT
11011-SKCT-ECE
Enter number of colleges to be displayed
2
First 2 college details
11056-KCT-IT
11011-SKCT-ECE
Enter the collage code to search :
11011
Entered college code is found


Sample Input and Output 2:
Enter number of colleges
4
Enter the college details one by one
12051-SREC-CSE
12023-KSR-ECE
11087-KIOT-IT
13098-SRIT-EEE
Enter number of colleges to be displayed
5
Invalid

Sample Input and Output 3:
Enter number of colleges
4
Enter the college details one by one
12051-SREC-CSE
12023-KSR-ECE
11087-KIOT-IT
13098-SRIT-EEE
Enter number of colleges to be displayed
2
First 2 college details
12051-SREC-CSE
12023-KSR-ECE
Enter the collage code to search :
15035
Entered college code is not found



Code:-

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

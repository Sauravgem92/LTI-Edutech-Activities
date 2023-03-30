Enter the number of participants to be registered : 

3
Enter the participants details

SREC_IT_1305320

SRIT_CSE_132

KCT_ECE_1234567

List of valid participants

SREC_IT_1305320

KCT_ECE_1234567

 

Sample Input and Output 2:

Enter the number of participants to be registered : 

2

Enter the participants details

KCT_EEE_13523

SKCT_MECH_12345

No valid participants




Code :-
  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LinkedList<String> list = new LinkedList<>();

		System.out.println("Enter the number of participants to be registered : ");
		int n = Integer.parseInt(br.readLine());

		System.out.println("Enter the participants details");
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			String arr[] = input.split("_");

			if (arr[2].length()==7 && (arr[1].equals("IT") || arr[1].equals("CSE") || arr[1].equals("ECE"))) {
				list.add(input);
			}
		}

		if (list.size() == 0) {
			System.out.println("No valid participants");
		} else {
			System.out.println("List of valid participants");
			list.forEach(participant -> System.out.println(participant));
		}

	}

}

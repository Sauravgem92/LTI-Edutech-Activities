Sample Input and Output 1:

Enter the username 1
John
Do you want to continue?(y/n)
y
Enter the username 2
Joe
Do you want to continue?(y/n)
n
The Names entered are:
John
Joe



Code :-

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
		ArrayList<String> names=new ArrayList<>();

        int i=1;
        while(true){
			System.out.println("Enter the username " + i++);
			names.add(sc.nextLine());
            System.out.println("Do you want to continue?(y/n)");
			String toContinue=sc.nextLine();
			if(toContinue.equals("n")){break;}
		}

        System.out.println("The Names entered are:");
		names.forEach(name -> System.out.println(name));


		
	}
}

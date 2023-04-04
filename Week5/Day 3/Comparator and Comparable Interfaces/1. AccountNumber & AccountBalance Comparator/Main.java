
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Account> accountList = new ArrayList<>();

		while (true) {
			System.out.println("Enter Account details seperated by comma [Account Id,Account Balance,Account Number,status,Account Type,Customer Id]");
			String arr[] = sc.nextLine().split(",");

			// arr[0]=Account Id,arr[1]=Account Balance,arr[2]=Account
			// Number,arr[3]=status,arr[4]=Account Type,arr[5]=Customer Id

			accountList.add(new Account(Integer.parseInt(arr[0]), Double.parseDouble(arr[1]), arr[2], arr[3], arr[4], arr[5]));
		
			System.out.println("Do you want to enter more Account details?(yes/no):");
			if(sc.nextLine().equals("no")) break;
		}
		
		System.out.println("How do you want to sort the Account details?\r\n" + 
				" Enter your choice\r\n" + 
				" 1.Account Balance\r\n" + 
				"2.Account Number");
		
		int choice=Integer.parseInt(sc.nextLine());
		
		if(choice==1) {
			Collections.sort(accountList,new AccountBalanceComparator());
			System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Account Id", "Account Number", "Account Balance","Account Type", "status", "Customer Id");
		    for(Account a:accountList) {
		     	System.out.print(a.toString());
		    }
		}else if(choice==2) {
			Collections.sort(accountList,new AccountNumberComparator());
		    System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Account Id", "Account Number", "Account Balance","Account Type", "status", "Customer Id");
		    for(Account a:accountList) {
		     	System.out.print(a.toString());
		    }
		}else{
			System.out.println("Invalid choice");
		}
		
		

	}

}
   

import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) throws IOException 
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the Booking details");
		String input=br.readLine();
		StringTokenizer str=new StringTokenizer(input,",");
		TicketBooking ticket=new TicketBooking();
		while(str.hasMoreTokens())
		{
			String stageEvent=str.nextToken();
			String customer=str.nextToken();
			Integer noOfSeats=Integer.parseInt(str.nextToken());
			ticket.setStageEvent(stageEvent);
			ticket.setCustomer(customer);
			ticket.setNoOfSeats(noOfSeats);
		}
		System.out.println("Payment mode");
		System.out.println("1.Cash payment\n2.Wallet payment\n3.Credit card payment");
	    Integer choice=Integer.parseInt(br.readLine());
		if(choice==1)
		{
			System.out.println("Enter the amount");
			Double amount=Double.parseDouble(br.readLine());
			ticket.MakePayment(amount);
		}
		else if(choice==2)
		{
			System.out.println("Enter the amount");
			Double amount=Double.parseDouble(br.readLine());
			System.out.println("Enter the wallet number");
			String walletNumber=br.readLine();
			ticket.MakePayment(walletNumber, amount);
			
		}
		else if (choice==3)
		{
            System.out.println("Enter card holder name");
            String name=br.readLine();
			System.out.println("Enter the amount");
			Double amount=Double.parseDouble(br.readLine());
			System.out.println("Enter the credit card type");
			String creditCard=br.readLine();
			System.out.println("Enter the CCV number");
			String ccv=br.readLine();
			ticket.MakePayment(creditCard, ccv, name, amount);
		}
		else
		{
			System.out.println("Invalid choice");
		}
	
	}

}

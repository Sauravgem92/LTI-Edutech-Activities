
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String args[]) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose Event type\n" + 
				"1.Exhibition\n" + 
				"2.StageEvent");
		
		int choice=sc.nextInt();
		
		
		if(choice==1) {
			sc.nextLine();
		System.out.println("Enter the details in CSV format");
		String in=sc.nextLine();
		String[] dts=in.split(",");
		
		String name= dts[0];
		String detail= dts[1];
		String type= dts[2];
		String organiserName=dts[3];
		int noOfStall=Integer.parseInt(dts[4]);
		
		Exhibition e=new Exhibition(name, detail, type,organiserName,noOfStall);
		
		System.out.println("Event Name:" +e.getName()+ 
				"\nDetail:" + e.getDetail() +
				"\nType:" + e.getType() + 
				"\nOrganiser Name:" + e.getOrganiserName()+ 
				"\nNumber of stalls:"+e.getNoOfStall());
		}
		
		else if(choice==2) {
			sc.nextLine();
			System.out.println("Enter the details in CSV format");
			String in=sc.nextLine();
			String[] dts=in.split(",");
			
			String name= dts[0];
			String detail= dts[1];
			String type= dts[2];
			String organiserName=dts[3];
			int noOfSeats=Integer.parseInt(dts[4]);
			
			StageEvent e=new StageEvent(name, detail, type,organiserName,noOfSeats);
			
			System.out.println("Event Name:" +e.getName()+ 
					"\nDetail:" + e.getDetail() +
					"\nType:" + e.getType() + 
					"\nOrganiser Name:" + e.getOrganiserName()+ 
					"\nNumber of seats:"+e.getNoOfSeats());
		}	else {
			System.out.println("Invalid choice");
		}
		
		sc.close();
	}
}
